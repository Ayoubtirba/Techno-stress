package Modele.entites;

public class Recomendation {


	private int id_reco,id_user,id_psy,id_reponse;
	
	public Recomendation(int id_user, int id_psy, int id_reponse, String recomandation) {
		super();
		this.id_user = id_user;
		this.id_psy = id_psy;
		this.id_reponse = id_reponse;
		this.recomandation = recomandation;
	}

	public Recomendation( int id_psy, int id_reponse, String recomandation) {
		super();
	
		this.id_psy = id_psy;
		this.id_reponse = id_reponse;
		this.recomandation = recomandation;
	}

	public Recomendation() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String recomandation;

	public int getId_reco() {
		return id_reco;
	}

	public void setId_reco(int id_reco) {
		this.id_reco = id_reco;
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

	public int getId_reponse() {
		return id_reponse;
	}

	public void setId_reponse(int id_reponse) {
		this.id_reponse = id_reponse;
	}

	public String getRecomandation() {
		return recomandation;
	}

	public void setRecomandation(String recomandation) {
		this.recomandation = recomandation;
	}

	public Recomendation(int id_reco, int id_user) {
		super();
		this.id_reco = id_reco;
		this.id_user = id_user;
	}
	

	

	
}
