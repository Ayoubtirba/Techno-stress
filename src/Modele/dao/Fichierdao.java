package Modele.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modele.entites.Fichier;
public class Fichierdao {
	
	   public List<Fichier> getallfile(){
			List<Fichier> liste = new ArrayList<Fichier>();
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

				Statement ps = cn.createStatement();

				String sql = "SELECT * FROM file";
				ResultSet rs = ps.executeQuery(sql);

				while (rs.next()) {
					Fichier f = new Fichier();
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
	  public void suppermierfile(int id) {
		   PreparedStatement ps;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

				ps = cn.prepareStatement("DELETE FROM `file` WHERE `id_file`=?");
				ps.setInt(1, id);
				ps.executeUpdate();

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
		   
		   
		   
		   
	   }
	
	 public  void modifierfile(Fichier f) {
		   PreparedStatement ps;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

				ps = cn.prepareStatement("UPDATE file SET `nom_file`=?,`q2`=?,`q3`=?,`q4`=?,`q5`=?,`q6`=?,`q7`=? where id_file=? ");
				ps.setString(1, f.getQ1());
				ps.setString(2, f.getQ2());
				ps.setString(3, f.getQ3());
				ps.setString(4, f.getQ4());
				ps.setString(5, f.getQ5());
				ps.setString(6, f.getQ6());
				ps.setString(7, f.getQ7());
				ps.setInt(8,f.getId());
				ps.executeUpdate();

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
		   
		   
		   
	   }
	 public  List<Fichier> getfile(int id){
		 PreparedStatement ps;
		   List<Fichier> liste = new ArrayList<Fichier>();
			try {
				Fichier f = new Fichier();
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

				ps = cn.prepareStatement("SELECT * FROM file where id_file=?");

				
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
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
	 public void ajouteFichierman(Fichier f) {

			PreparedStatement ps;

			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("INSERT INTO `file`(nom_file, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`) VALUES (?,?,?,?,?,?,?)");
				ps.setString(1, f.getQ1());
				ps.setString(2, f.getQ2());
				ps.setString(3, f.getQ3());
				ps.setString(4, f.getQ4());
				ps.setString(5, f.getQ5());
				ps.setString(6, f.getQ6());
				ps.setString(7, f.getQ7());
				ps.executeUpdate();

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}
			
	 }
	
	 public  List<Fichier> Findemail(String email){
		 PreparedStatement ps;
		   List<Fichier> liste = new ArrayList<Fichier>();
			try {
				Fichier f = new Fichier();
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

				ps = cn.prepareStatement("SELECT * FROM file where nom_file LIKE?");
				ps.setString(1, "%"+email+"%");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
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
	 public List<Fichier> Qusetionuser(int iduser){
			List<Fichier> liste = new ArrayList<Fichier>();
			PreparedStatement ps;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("SELECT f.id_file,f.nom_file,f.q2,f.q3,f.q4,f.q5,f.q6,f.q7 from file as f,user as u,clef as c WHERE u.id_user=c.id_user and f.id_file=c.id_file AND u.id_user=? and c.status=0 ");
				ps.setInt(1, iduser);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Fichier f = new Fichier();
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
	 public List<Fichier> Qusetionuserfile(int iduser ,int idfile){
			List<Fichier> liste = new ArrayList<Fichier>();
			PreparedStatement ps;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("SELECT f.id_file,f.nom_file,f.q2,f.q3,f.q4,f.q5,f.q6,f.q7 from file as f,user as u,clef as c WHERE u.id_user=c.id_user and f.id_file=c.id_file AND u.id_user=? and f.id_file=?  ");
				ps.setInt(1, iduser);
				ps.setInt(2, idfile);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					Fichier f = new Fichier();
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
	


}
