package Controleur;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modele.dao.IUserDao;
import Modele.dao.Userdao;


/**
 * Servlet implementation class ServletAuth
 */
@WebServlet("/Auth")
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("Email");
		String password=request.getParameter("passe");
		String action=request.getParameter("role");
		HttpSession session = request.getSession();
		IUserDao dao =new Userdao();
		if(action!=null) {
			if (action.equals("user")) {
				ResultSet rs=dao.getauthuser(email, password);
				try {
					if(rs.next()) {
						int r=rs.getInt("id_user");
						String n=rs.getString("nom");
						String p=rs.getString("prenom");
						session.setAttribute("n", n);
						session.setAttribute("p", p);
						session.setAttribute("id", r);
					  session.setAttribute( "s",email );
					response.sendRedirect("IndexUser.jsp");}
					else {
						String msg="L'adresse e-mail ou le mot de passe que vous avez entré ";
						session.setAttribute( "msg",msg );
						response.sendRedirect("Auth.jsp");
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (action.equals("rh")) {
				ResultSet rs=dao.getauthRh(email, password);
				try {
					if (rs.next()) {
						String n=rs.getString("nom");
						String p=rs.getString("prenom");
						session.setAttribute("n", n);
						session.setAttribute("p", p);
						response.sendRedirect("IndexRh.jsp");
					}
					else {
						
						String msg="mote passe ou l email est incoorect";
						session.setAttribute( "msg",msg );
						response.sendRedirect("Auth.jsp");
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			else if (action.equals("psy")) {
				ResultSet rs=dao.getauthuPsy(email, password);
				try {
					if (rs.next()) {
						int r=rs.getInt("id_psy");
						String n=rs.getString("nom");
						String p=rs.getString("prenom");
						session.setAttribute("n", n);
						session.setAttribute("p", p);
						session.setAttribute("id", r);
					  session.setAttribute( "s",email );
					response.sendRedirect("IndexPsy.jsp");
					}
					else {
						
						String msg="mote passe ou l email est incoorect";
						session.setAttribute( "msg",msg );
						response.sendRedirect("Auth.jsp");
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
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
