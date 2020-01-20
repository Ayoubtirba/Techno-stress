package Modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class SingletonConnection {
	private static Connection connection;

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		SingletonConnection.connection = connection;
	}

	static {
		try {
			 Class.forName("org.mariadb.jdbc.Driver");
		      connection= DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress","root","");
		        System.out.println("connected");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("problème"+e.getMessage());
		}
	
		}
	}

        
        



