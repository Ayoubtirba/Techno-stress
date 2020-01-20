package Modele.entites;

import java.sql.Timestamp;
import java.util.Date;

public class Reponse {
	

	public int getId_rep() {
		return id_rep;
	}
	public void setId_rep(int id_rep) {
		this.id_rep = id_rep;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getReponse1() {
		return reponse1;
	}
	public void setReponse1(String reponse1) {
		this.reponse1 = reponse1;
	}
	public String getReponse2() {
		return reponse2;
	}
	public void setReponse2(String reponse2) {
		this.reponse2 = reponse2;
	}
	public String getReponse3() {
		return reponse3;
	}
	public void setReponse3(String reponse3) {
		this.reponse3 = reponse3;
	}
	public String getReponse4() {
		return reponse4;
	}
	public void setReponse4(String reponse4) {
		this.reponse4 = reponse4;
	}
	public String getReponse5() {
		return reponse5;
	}
	public void setReponse5(String reponse5) {
		this.reponse5 = reponse5;
	}
	public String getReponse6() {
		return reponse6;
	}
	public void setReponse6(String reponse6) {
		this.reponse6 = reponse6;
	}
	public String getNom_fichier() {
		return nom_fichier;
	}
	public void setNom_fichier(String nom_fichier) {
		this.nom_fichier = nom_fichier;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = (Timestamp) date;
	}
	
	public Reponse(String reponse1, String reponse2, String reponse3, String reponse4, String reponse5, String reponse6,
			String nom_fichier, Date date, int id_rep, int id_user) {
		super();
		this.reponse1 = reponse1;
		this.reponse2 = reponse2;
		this.reponse3 = reponse3;
		this.reponse4 = reponse4;
		this.reponse5 = reponse5;
		this.reponse6 = reponse6;
		this.nom_fichier = nom_fichier;
		this.date = (Timestamp) date;
		this.id_rep = id_rep;
		this.id_user = id_user;
	}
	
	public Reponse(Date date, int id_user, String reponse1, String reponse2, String reponse3, String reponse4,
			String reponse5, String reponse6, String nom_fichier) {
		super();
		this.date = (Timestamp) date;
		this.id_user = id_user;
		this.reponse1 = reponse1;
		this.reponse2 = reponse2; 
		this.reponse3 = reponse3;
		this.reponse4 = reponse4;
		this.reponse5 = reponse5;
		this.reponse6 = reponse6;
		this.nom_fichier = nom_fichier;
	}
	public int getId_file() {
		return id_file;
	}
	public void setId_file(int id_file) {
		this.id_file = id_file;
	}
	public void setDate(java.sql.Timestamp date) {
		this.date = date;
	}
	public Reponse(int id_user, int id_file, Timestamp date, String reponse1, String reponse2, String reponse3,
			String reponse4, String reponse5, String reponse6, String nom_fichier) {
		super();
		this.id_user = id_user;
		this.id_file = id_file;
		this.date = date;
		this.reponse1 = reponse1;
		this.reponse2 = reponse2;
		this.reponse3 = reponse3;
		this.reponse4 = reponse4;
		this.reponse5 = reponse5;
		this.reponse6 = reponse6;
		this.nom_fichier = nom_fichier;
	}
	private int id_rep,id_user,id_file;
	public Reponse() {
		super();
	
	}
	public Reponse(int id_rep, int id_user, int id_file) {
		super();
		this.id_rep = id_rep;
		this.id_user = id_user;
		this.id_file = id_file;
	}
	public Reponse(int id_user2, int id_file2, Date date2, String reponse12, String reponse22, String reponse32,
			String reponse42, String reponse52, String reponse62, String nom_fichier2) {
		// TODO Auto-generated constructor stub
	}
	private java.sql.Timestamp date;
	private String reponse1,reponse2,reponse3,reponse4,reponse5,reponse6,nom_fichier;
	

}
