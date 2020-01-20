package Controleur;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.dao.Clefdao;
import Modele.dao.Fichierdao;
import Modele.dao.Recodao;
import Modele.dao.Reponsedao;
import Modele.entites.Clef;
import Modele.entites.Fichier;
import Modele.entites.Recomendation;
import Modele.entites.Reponse;





/**
 * Servlet implementation class ServletQuestionnaire
 */
@WebServlet("/Questionnaire")
public class ServletQuestionnaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Reponsedao dAo=new Reponsedao();
	 Fichierdao dao=new Fichierdao();
	 Clefdao da=new Clefdao();
	 Recodao aa=new Recodao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletQuestionnaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action!=null) {
			if(action.equals("file")) {
				int idfile=Integer.parseInt(request.getParameter("idfile"));
				int iduser=Integer.parseInt(request.getParameter("iduser"));
				List<Fichier>f=dao.Qusetionuserfile(iduser, idfile);
			    request.setAttribute("f",f);
				request.getRequestDispatcher("Reponse.jsp").forward(request, response);
			}
			else if(action.equals("ajouterreponse")) {
				int id_user=Integer.parseInt(request.getParameter("iduser"));
				int id_file=Integer.parseInt(request.getParameter("idfile"));
				int status=1;
				String reponse1=request.getParameter("q1");
				String reponse2=request.getParameter("q2");
				String reponse3=request.getParameter("q3");
				String reponse4=request.getParameter("q4");
				String reponse5=request.getParameter("q5");
				String reponse6=request.getParameter("q6");
				String nom_fichier=request.getParameter("nom");
				 Date date = new Date();
			      date = new Timestamp(date.getTime());
			      Reponse r =new Reponse(id_user, id_file, new Timestamp(date.getTime()), reponse1, reponse2, reponse3, reponse4, reponse5, reponse6, nom_fichier);
			     // Reponse r=new Reponse(date, id_user, reponse1, reponse2, reponse3, reponse4, reponse5, reponse6, nom_fichier,id_file);
				dAo.ajouteReponse(r);
				
				  Clef c=new Clef(id_file, id_user, status); 
				  da.modifierclef(c);
				 
				List<Fichier>f=dao.Qusetionuser(id_user);
				
			    request.setAttribute("f",f);
				request.getRequestDispatcher("ListeQuestionnaire.jsp").forward(request, response);
				
				

			}
			else if (action.equals("Recomondaiton")){
				/*
				 * int iduser=Integer.parseInt(request.getParameter("iduser"));
				 * List<Recomendation>f=aa.showRecomendation(iduser);
				 * request.setAttribute("f",f);
				 */
				request.getRequestDispatcher("Listedesrecomondations.jsp").forward(request, response);
			}
			else if (action.equals("sup")) {
				int iduser=Integer.parseInt(request.getParameter("iduser"));
				int idreco=Integer.parseInt(request.getParameter("idrecomon"));
				Recomendation re=new Recomendation(idreco, iduser);
				aa.modifierRecomendation(re);
				request.getRequestDispatcher("Listedesrecomondations.jsp").forward(request, response);
			}
			
		}
		else {
			int iduser=Integer.parseInt(request.getParameter("iduser"));
			List<Fichier>f=dao.Qusetionuser(iduser);
		    request.setAttribute("f",f);
			request.getRequestDispatcher("ListeQuestionnaire.jsp").forward(request, response);
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
