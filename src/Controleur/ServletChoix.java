package Controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.dao.Clefdao;
import Modele.dao.Fichierdao;
import Modele.dao.IUserDao;
import Modele.dao.Userdao;
import Modele.entites.Clef;
import Modele.entites.Fichier;
import Modele.entites.Psy;
import Modele.entites.User;

/**
 * Servlet implementation class ServletChoix
 */
@WebServlet("/Choix")
public class ServletChoix extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Fichierdao Dao=new Fichierdao();
	IUserDao dao =new Userdao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletChoix() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action!=null) {
			
			
		if(action.equals("Choixfile")) {
		List<Fichier> f=Dao.getallfile();
	    request.setAttribute("f",f);
		request.getRequestDispatcher("Choixfile.jsp").forward(request, response);
		}
		else if(action.equals("Choixuser")) {
			List<User> Liste=dao.getalluser();
			request.setAttribute("Users",Liste);
			
			request.getRequestDispatcher("ChoixUser.jsp").forward(request, response);
		
		
		}
		else if(action.equals("ChoixPsy")) {
			IUserDao daO =new Userdao();
			List<Psy> Liste= daO.getallPsy();
			request.setAttribute("Psys",Liste);
			request.getRequestDispatcher("ChoixPsy.jsp").forward(request, response);
		}
		
		
		
		else if(action.equals("recherchefile")) {
			String email=request.getParameter("nom");
			List<Fichier>	f=Dao.Findemail(email);
		    request.setAttribute("f",f);
			request.getRequestDispatcher("Choixfile.jsp").forward(request, response);
			

		}
		else if(action.equals("rechercheuser")) {
			String email=request.getParameter("nom");
			List<User>	Liste=dao.getuseremail(email);
			request.setAttribute("Users",Liste);
			request.getRequestDispatcher("ChoixUser.jsp").forward(request, response);
		   
		

		}
		else if(action.equals("ajouterclef")) {
			Clefdao o=new Clefdao();
			int id_psy=Integer.parseInt(request.getParameter("idPsy"));
			int id_user=Integer.parseInt(request.getParameter("iduser"));
			int id_file=Integer.parseInt(request.getParameter("idfile"));
			int status=0;
			Clef c=new Clef(id_file, id_user, id_psy, status);
			o.ajouterclef(c);
			List<Fichier>	f=Dao.getallfile();
		    request.setAttribute("f",f);
			request.getRequestDispatcher("Choixfile.jsp").forward(request, response);
		}
		
		
		
		
		
		
		}else {
			
			List<Fichier>	f=Dao.getallfile();
		    request.setAttribute("f",f);
			request.getRequestDispatcher("Choixfile.jsp").forward(request, response);
			
		
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
