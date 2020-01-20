package Controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modele.dao.IUserDao;
import Modele.dao.Userdao;
import Modele.entites.Psy;
/**
 * Servlet implementation class ServletPsy
 */
@WebServlet("/Psy")
public class ServletPsy extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserDao dao =new Userdao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPsy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action!=null) {
			if(action.equals("ajouter")) {
				
				
				String nom=	request.getParameter("nom");
				String prenom	=request.getParameter("prenom");
					String email=request.getParameter("email");
					String password=request.getParameter("passe1");
					Psy p=new Psy(nom, prenom, email, password);
					dao.ajouteUser(p);
					List<Psy> Liste=dao.getallPsy();
					request.setAttribute("Psys",Liste);
					request.getRequestDispatcher("ShowallPsy.jsp").forward(request, response);
			
				}
			
			else if (action.equals("SupprimierPsy")) {
				int id=Integer.parseInt(request.getParameter("id"));
				dao.suppermierPsy(id);
				List<Psy> Liste=dao.getallPsy();
				request.setAttribute("Psys",Liste);
				request.getRequestDispatcher("ShowallPsy.jsp").forward(request, response);
			}
			else if (action.equals("showPsy")) {
				int id=Integer.parseInt(request.getParameter("id"));
				request.setAttribute("Psy",dao.getPsy(id));
				request.getRequestDispatcher("ModifierPsy.jsp").forward(request, response);
			} 
			
			  else if (action.equals("mod")) { 
				int id = Integer.parseInt(request.getParameter("id"));
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String email = request.getParameter("email");
				String password = request.getParameter("passe");
				//Psy p=new Psy(id,nom, prenom, email, password);
				Psy p=new Psy(nom, prenom, email, password, id);
				dao.modifierPsy(p);
				List<Psy> Liste=dao.getallPsy();
				request.setAttribute("Psys",Liste);
				request.getRequestDispatcher("ShowallPsy.jsp").forward(request, response);

			}
			
		}else {
			
			
			List<Psy> Liste=dao.getallPsy();
			request.setAttribute("Psys",Liste);
			request.getRequestDispatcher("ShowallPsy.jsp").forward(request, response);
		}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
