package Modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modele.entites.Clef;


public class Clefdao {
	
	
	public void ajouterclef(Clef c) {
		PreparedStatement ps;

		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			ps = cn.prepareStatement("INSERT INTO `clef`(id_psy,id_file,id_user,status) VALUES (?,?,?,?)");
			ps.setInt(1, c.getId_psy());
			ps.setInt(2, c.getId_file());
			ps.setInt(3, c.getId_user());
			ps.setInt(4, c.getStatus());
			ps.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}
	
		
		
		
	}
	
	public void modifierclef(Clef c) {
		PreparedStatement ps;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			// System.out.println("connected");
			ps = cn.prepareStatement("UPDATE `clef` SET `status`=?  WHERE `id_user`=? and `id_file`=?");
			ps.setInt(1, c.getStatus());
			ps.setInt(2, c.getId_user());
			ps.setInt(3, c.getId_file());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	

}
}
