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
import Modele.entites.User;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/User")
public class ServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserDao dao =new Userdao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if(action!=null) {
		 if(action.equals("ajouteruser")) {
				
				
			String nom=	request.getParameter("nom");
			String prenom	=request.getParameter("prenom");
				String email=request.getParameter("email");
				String password=request.getParameter("passe");
				User u=new User(nom, prenom, email, password);
				dao.ajouteUser(u);
				List<User> Liste=dao.getalluser();
				request.setAttribute("Users",Liste);
				request.getRequestDispatcher("ShowUser.jsp").forward(request, response);
				
		
			}
		 
			else if (action.equals("SupprimierUser")) {
				int id=Integer.parseInt(request.getParameter("id"));
				dao.suppermierUser(id);
				List<User> Liste=dao.getalluser();
				request.setAttribute("Users",Liste);
				request.getRequestDispatcher("ShowUser.jsp").forward(request, response);
				
			}
			else if (action.equals("showuser")) {
				int id=Integer.parseInt(request.getParameter("id"));
				request.setAttribute("Users",dao.getuser(id));
				request.getRequestDispatcher("ModifierUser.jsp").forward(request, response);
			}
			else if (action.equals("mod")) {
				int id=Integer.parseInt(request.getParameter("id"));
				String nom=	request.getParameter("nom");
				String prenom=request.getParameter("prenom");
				String email=request.getParameter("email");
				String password=request.getParameter("passe");
				User u=new User(nom, prenom, email, password, id);
				dao.modifierUser(u);
				  List<User> Liste=dao.getalluser(); request.setAttribute("Users",Liste);
				  request.getRequestDispatcher("ShowUser.jsp").forward(request, response);
				 
			}
			
		}else
		{
			List<User> Liste=dao.getalluser();
			request.setAttribute("Users",Liste);
			request.getRequestDispatcher("ShowUser.jsp").forward(request, response);
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
