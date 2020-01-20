package Modele.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modele.entites.Reponse;
public class Reponsedao {
	
	
	 public void ajouteReponse(Reponse r) {

			PreparedStatement ps;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("INSERT INTO `reponse`(`id_user`, `date`, `reponse1`, `reponse2`, `reponse3`, `reponse4`, `reponse5`, `reponse6`, `nom_fichier`,`id_file`,status) VALUES (?,?,?,?,?,?,?,?,?,?,0)");
				ps.setInt(1, r.getId_user());
				ps.setTimestamp (2, (java.sql.Timestamp) r.getDate());
				ps.setString(3, r.getReponse1());
				ps.setString(4, r.getReponse2());
				ps.setString(5, r.getReponse3());
				ps.setString(6, r.getReponse4());
				ps.setString(7, r.getReponse5());
				ps.setString(8, r.getReponse6());
				ps.setString(9, r.getNom_fichier());
				ps.setInt(10, r.getId_file());
				ps.executeUpdate();
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
			
			
	 }
	 public List<Reponse> listereponse(int id_psy,int id_file,int id_user){
			List<Reponse> liste = new ArrayList<Reponse>();
			PreparedStatement ps;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("SELECT id_reponse,`date`,`reponse1`,`reponse2`,`reponse3`,`reponse4`,`reponse5`,`reponse6` from file as f,clef as c ,psy as p,user AS u,reponse as r WHERE p.id_psy=c.id_psy AND f.id_file=c.id_file and c.id_psy=? and c.status=1 AND r.id_user=u.id_user  and u.id_user=c.id_user and c.id_file=r.id_file and r.id_file=? and r.id_user=?");
				ps.setInt(1, id_psy);
				ps.setInt(2, id_file);
				ps.setInt(3, id_user);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Reponse r= new Reponse();
					r.setId_rep(rs.getInt("id_reponse"));
					r.setReponse1(rs.getString("reponse1"));
					r.setReponse2(rs.getString("reponse2"));
					r.setReponse3(rs.getString("reponse3"));
					r.setReponse4(rs.getString("reponse4"));
					r.setReponse5(rs.getString("reponse5"));
					r.setReponse6(rs.getString("reponse6"));
					r.setDate(rs.getTimestamp("date"));
					liste.add(r);
				}
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}

			return liste;
	   }
	 public void modifierReponse(Reponse r) {
			PreparedStatement ps;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				// System.out.println("connected");
				ps = cn.prepareStatement("UPDATE `reponse` SET`status`=1 WHERE `id_reponse`=? and `id_user`=? and`id_file`=?");
				ps.setInt(1, r.getId_rep());
				ps.setInt(2, r.getId_user());
				ps.setInt(3, r.getId_file());
				ps.executeUpdate();

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
	}
	

}
