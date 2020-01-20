package Modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Modele.entites.Psy;
import Modele.entites.User;

public class Userdao implements IUserDao {

	@Override
	public List<User> getalluser() {
		List<User> liste = new ArrayList<User>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			Statement ps = cn.createStatement();

			String sql = "SELECT * FROM user";
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id_user"));
				u.setNom(rs.getString("Nom"));
				u.setPrenom(rs.getString("Prenom"));
				u.setEmail(rs.getString("Email"));
				u.setPassword(rs.getString("MotPasse"));
				liste.add(u);

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return liste;
	}

	@Override
	public void ajouteUser(User u) {

		PreparedStatement ps;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("INSERT INTO `User`( `Nom`, `Prenom`, `Email`, `MotPasse`) VALUES (?,?,?,?)");
			ps.setString(1, u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	}

	@Override
	public void suppermierUser(int id) {
		PreparedStatement ps;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("DELETE FROM `User` WHERE `id_user`=?");
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	}

	@Override
	public ResultSet  getauthuser(String email, String password) {
		// TODO Auto-generated method stub

		PreparedStatement ps;
		ResultSet rs=null;
		try {
		
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("SELECT * FROM `User` WHERE `Email`=? and MotPasse=?");
			ps.setString(1,email);
			ps.setString(2,password);
			rs = ps.executeQuery();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return rs;

	}

	@Override
	public void modifierUser(User U) {
		// TODO Auto-generated method stub
		PreparedStatement ps;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("UPDATE user SET Nom=?,Prenom=?,Email=?,`MotPasse`=? WHERE id_user=? ");
			ps.setString(1, U.getNom());
			ps.setString(2, U.getPrenom());
			ps.setString(3, U.getEmail());
			ps.setString(4, U.getPassword());
			ps.setInt(5, U.getId());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	}

	@Override
	public List<User> getuser(int id) {
		PreparedStatement ps;
		List<User> liste = new ArrayList<User>();
		try {
			User u = new User();
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("SELECT * FROM `User` WHERE `id_user`=? ");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u.setId(rs.getInt("id_user"));
				u.setNom(rs.getString("Nom"));
				u.setPrenom(rs.getString("Prenom"));
				u.setEmail(rs.getString("Email"));
				u.setPassword(rs.getString("MotPasse"));
				liste.add(u);

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return liste;

	}

	@Override
	public ResultSet getauthuPsy(String email, String password) {
		PreparedStatement ps;
		ResultSet rs=null;
	
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("SELECT * FROM psy WHERE Email=? and MotPasse=? ");
			ps.setString(1, email);
			ps.setString(2, password);
			 rs = ps.executeQuery();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return rs;
	}

	@Override
	public List<Psy> getPsy(int id) {
		PreparedStatement ps;
		List<Psy> liste = new ArrayList<Psy>();
		try {
			Psy p = new Psy();
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			ps = cn.prepareStatement("SELECT * FROM `psy` WHERE `id_psy`=? ");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				p.setId(rs.getInt("id_psy"));
				p.setNom(rs.getString("Nom"));
				p.setPrenom(rs.getString("Prenom"));
				p.setEmail(rs.getString("Email"));
				p.setPassword(rs.getString("MotPasse"));
				liste.add(p);

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return liste;

	}

	@Override
	public void modifierPsy(Psy p) {
		PreparedStatement ps;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			// System.out.println("connected");
			ps = cn.prepareStatement("UPDATE psy SET Nom=?,Prenom=?,Email=?,MotPasse=? WHERE id_psy=? ");
			ps.setString(1, p.getNom());
			ps.setString(2, p.getPrenom());
			ps.setString(3, p.getEmail());
			ps.setString(4, p.getPassword());
			ps.setInt(5, p.getId());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	}

	@Override
	public List<Psy> getallPsy() {
		List<Psy> liste = new ArrayList<Psy>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			Statement ps = cn.createStatement();

			String sql = "SELECT * FROM psy ";
			ResultSet rs = ps.executeQuery(sql);

			while (rs.next()) {
				Psy p = new Psy();
				p.setId(rs.getInt("id_psy"));
				p.setNom(rs.getString("Nom"));
				p.setPrenom(rs.getString("Prenom"));
				p.setEmail(rs.getString("Email"));
				p.setPassword(rs.getString("MotPasse"));
				liste.add(p);

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return liste;
	}

	@Override
	public void ajouteUser(Psy y) {
		PreparedStatement ps;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			ps = cn.prepareStatement("INSERT INTO `psy`( `Nom`, `Prenom`, `Email`, `MotPasse`) VALUES (?,?,?,?)");
			ps.setString(1, y.getNom());
			ps.setString(2, y.getPrenom());
			ps.setString(3, y.getEmail());
			ps.setString(4, y.getPassword());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	}

	@Override
	public void suppermierPsy(int id) {
		PreparedStatement ps;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			// System.out.println("connected");

			ps = cn.prepareStatement("DELETE FROM psy WHERE `id_psy`=?");
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

	}

	@Override
	public ResultSet getauthRh(String email, String password) {
		PreparedStatement ps;
		ResultSet rs=null;
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");

			ps = cn.prepareStatement("SELECT * FROM `rh` WHERE `Email`=? and MotPasse=?");
			ps.setString(1, email);
			ps.setString(2,password);
			 rs = ps.executeQuery();
		
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return rs;

	}

	@Override
	public List<Psy> getPsyemail(String email) {

			PreparedStatement ps;
			List<Psy> liste = new ArrayList<Psy>();
			try {
				Psy p = new Psy();
				Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("SELECT * FROM `psy` WHERE `Email`LIKE ?");
				ps.setString(1, email);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					p.setId(rs.getInt("Id"));
					p.setNom(rs.getString("Nom"));
					p.setPrenom(rs.getString("Prenom"));
					p.setEmail(rs.getString("Email"));
					p.setPassword(rs.getString("MotPasse"));
					liste.add(p);

				}
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("problème" + e.getMessage());
			}

			return liste;
	}

	@Override
	public List<User> getuseremail(String email) {
		PreparedStatement ps;
		List<User> liste = new ArrayList<User>();
		try {
			User u = new User();
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
			ps = cn.prepareStatement("SELECT * FROM `User` WHERE  Email LIKE ?");
			ps.setString(1,"%"+ email+"%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				u.setId(rs.getInt("Id"));
				u.setNom(rs.getString("Nom"));
				u.setPrenom(rs.getString("Prenom"));
				u.setEmail(rs.getString("Email"));
				u.setPassword(rs.getString("MotPasse"));
				liste.add(u);

			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problème" + e.getMessage());
		}

		return liste;

	}

}
