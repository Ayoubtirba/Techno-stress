package Modele.entites;

public class Clef {
 public Clef(int id_file, int id_user, int id_psy, int status) {
		super();
		this.id_file = id_file;
		this.id_user = id_user;
		this.id_psy = id_psy;
		this.status = status;
	}

public Clef(int id_file, int id_user, int status) {
	super();
	this.id_file = id_file;
	this.id_user = id_user;
	this.status = status;
}



private int id_clef,id_file,id_user,id_psy,status;

public Clef() {
	super();
	// TODO Auto-generated constructor stub
}

public Clef(int id_clef, int id_file, int id_user, int id_psy, int status) {
	super();
	this.id_clef = id_clef;
	this.id_file = id_file;
	this.id_user = id_user;
	this.id_psy = id_psy;
	this.status = status;
}

public int getId_clef() {
	return id_clef;
}

public void setId_clef(int id_clef) {
	this.id_clef = id_clef;
}

public int getId_file() {
	return id_file;
}

public void setId_file(int id_file) {
	this.id_file = id_file;
}

public int getId_user() {
	return id_user;
}

public void setId_user(int id_user) {
	this.id_user = id_user;
}

public int getId_psy() {
	return id_psy;
}

public void setId_psy(int id_psy) {
	this.id_psy = id_psy;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}
	
	
	
	
}
