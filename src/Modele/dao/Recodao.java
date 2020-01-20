package Modele.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modele.entites.Fichier;
import Modele.entites.Recomendation;
public class Recodao {
	 public List<Fichier> Qusetionpsy(int idpsy){
	
				List<Fichier> liste = new ArrayList<Fichier>();
				PreparedStatement ps;
				try {
					Class.forName("org.mariadb.jdbc.Driver");
					Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
					ps = cn.prepareStatement("SELECT u.email,p.nom ,f.id_file,f.nom_file,f.q2,f.q3,f.q4,f.q5,f.q6,f.q7 from file as f,clef as c ,psy as p,user AS u,reponse as r WHERE p.id_psy=c.id_psy AND f.id_file=c.id_file and c.id_psy=? and c.status=1 AND r.id_user=u.id_user and r.status=0 and u.id_user=c.id_user and c.id_file=r.id_file ");
					ps.setInt(1, idpsy);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						Fichier f = new Fichier();
						//User u =new User();
						f.setId(rs.getInt("id_file"));
						f.setQ1(rs.getString("nom_file"));
						f.setQ2(rs.getString("q2"));
						f.setQ3(rs.getString("q3"));
						f.setQ4(rs.getString("q4"));
						f.setQ5(rs.getString("q5"));
						f.setQ6(rs.getString("q6"));
						f.setQ7(rs.getString("q7"));
						liste.add(f);

					}
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("problème" + e.getMessage());
				}

				return liste;
		   }
	 public void ajouteRecomondation(Recomendation r) {

			PreparedStatement ps;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("INSERT INTO `recomendation`( `id_user`, `id_psy`, `recomondation`, `status`) VALUES (?,?,?,0)");
				ps.setInt(1, r.getId_user());
				ps.setInt(2, r.getId_psy());
				ps.setString(3,r.getRecomandation());
				ps.executeUpdate();

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
			
			
			
	 }
	 public List<Recomendation> showRecomendation(int iduser){
			
			List<Recomendation> liste = new ArrayList<Recomendation>();
			PreparedStatement ps;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("SELECT recomondation FROM `recomendation` WHERE `id_user`=?");
				ps.setInt(1, iduser);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Recomendation r = new Recomendation();
					r.setRecomandation(rs.getString("recomondation"));
					
					liste.add(r);	
				}
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}

			return liste;
	   }
	 
	 public void modifierRecomendation(Recomendation r) {
			PreparedStatement ps;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				// System.out.println("connected");
				ps = cn.prepareStatement("UPDATE `recomendation` SET `status`=1 WHERE `id_reco`=? and `id_user`=?");
				ps.setInt(1, r.getId_reco());
				ps.setInt(2, r.getId_user());
				ps.executeUpdate();

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
	}
	   }
	
	




