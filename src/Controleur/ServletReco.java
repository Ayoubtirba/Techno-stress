package Controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.dao.Fichierdao;
import Modele.dao.Recodao;
import Modele.dao.Reponsedao;
import Modele.entites.Fichier;
import Modele.entites.Recomendation;
import Modele.entites.Reponse;






/**
 * Servlet implementation class ServletReco
 */
@WebServlet("/Reco")

public class ServletReco extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Fichierdao dao=new Fichierdao();
	Recodao dAo= new Recodao();
	Reponsedao oo=new Reponsedao();
	
    public ServletReco() {
        super();
        
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getParameter("action");
		if(action!=null) {
			if(action.equals("cc")) {
			int idfile=Integer.parseInt(request.getParameter("idfile"));
			int iduser=Integer.parseInt(request.getParameter("iduser"));
			int id_psy=Integer.parseInt(request.getParameter("idpsy"));
			List<Fichier>f=dao.Qusetionuserfile(iduser, idfile);
		    request.setAttribute("f",f);
		   List<Reponse> r=oo.listereponse(id_psy, idfile, iduser);
		   request.setAttribute("r",r);
			request.getRequestDispatcher("Recomondation.jsp").forward(request, response);
			}
			else if(action.equals("ajouter")) {
				int id_file=Integer.parseInt(request.getParameter("file"));
				int id_user=Integer.parseInt(request.getParameter("user"));
				int id_psy=Integer.parseInt(request.getParameter("psy"));
				int id_reponse=Integer.parseInt(request.getParameter("reponse"));
				String recomandation=request.getParameter("story");
				//deux methode ajouter et modifier le champ de reponse a 0;
				Recomendation r=new Recomendation(id_user, id_psy, id_reponse,recomandation);
				dAo.ajouteRecomondation(r);
				Reponse modifi=new Reponse(id_reponse, id_user,id_file);
				oo.modifierReponse(modifi);
			//List<Fichier>f=dAo.Qusetionpsy(id_psy); request.setAttribute("f",f); 
			request.getRequestDispatcher("IndexPsy.jsp").forward(request, response);
			}
			
		}
		else {
			
			
			  int idpsy=Integer.parseInt(request.getParameter("id_psy"));
			  List<Fichier>f=dAo.Qusetionpsy(idpsy); request.setAttribute("f",f);
			 
			  request.getRequestDispatcher("Listeuser.jsp").forward(request, response);
			 
				
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
