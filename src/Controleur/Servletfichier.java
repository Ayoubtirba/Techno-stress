package Controleur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.dao.Fichierdao;
import Modele.entites.Fichier;


/**
 * Servlet implementation class Servletfichier
 */
@WebServlet("/fichier")
public class Servletfichier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Fichierdao dao=new Fichierdao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletfichier() {
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
			if(action.equals("Supprimierfile")) {
				int id=Integer.parseInt(request.getParameter("id"));
				dao.suppermierfile(id);
				
				  List<Fichier> f=dao.getallfile(); request.setAttribute("f",f);
				  request.getRequestDispatcher("ShowAllfille.jsp").forward(request, response);
				 
				
			}
			
			
			
			
			
			if(action.equals("ajouter")) {
				String path =request.getParameter("file");
				File file = new File(path);
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
					 Class.forName("org.mariadb.jdbc.Driver");
				      Connection connect= DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress","root","");
				        System.out.println("connected");
				        Statement s = connect.createStatement();
				        try {
							while ((line = br.readLine()) != null) {
								String[] arr = line.split(",");
								String sql ="INSERT INTO `file`( `nom_file`, `q2`, `q3`, `q4`, `q5`, `q6`,q7) VALUES ('"+arr[0]+"','"+arr[1]+"','"+arr[2]+"','"+arr[3]+"','"+arr[4]+"','"+arr[5]+"','"+arr[6]+"')"; 
										s.execute(sql);
								System.out.println("Import success!");
								
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 List<Fichier>	f=dao.getallfile();
				    request.setAttribute("f",f);
					request.getRequestDispatcher("ShowAllfille.jsp").forward(request, response);
			}
			
			else if(action.equals("mod")) {
				int id = Integer.parseInt(request.getParameter("id"));
				String q1 = request.getParameter("q1");
				String q2 = request.getParameter("q2");
				String q3 = request.getParameter("q3");
				String q4 = request.getParameter("q4");
				String q5 = request.getParameter("q5");
				String q6 = request.getParameter("q6");
				String q7 = request.getParameter("q7");
				Fichier fi=new Fichier(id, q1, q2, q3, q4, q5, q6, q7);
				dao.modifierfile(fi);
				List<Fichier>	f=dao.getallfile();
				 request.setAttribute("f",f);
				  request.getRequestDispatcher("ShowAllfille.jsp").forward(request, response);
				
				
				

				
			}
			else if (action.equals("showfile")) {
				int id=Integer.parseInt(request.getParameter("id"));
				request.setAttribute("F",dao.getfile(id));
				request.getRequestDispatcher("modFile.jsp").forward(request, response);
			} else if(action.equals("manule")) {
				String q1 =request.getParameter("nom");
				String q2=request.getParameter("q1");
				String q3=request.getParameter("q2");
				String q4=request.getParameter("q3");
				String q5=request.getParameter("q4");
				String q6=request.getParameter("q5");
				String q7=request.getParameter("q6");
				Fichier p=new Fichier( q1, q2, q3, q4, q5, q6, q7);
				dao.ajouteFichierman(p);
				 List<Fichier>	f=dao.getallfile();
				 request.setAttribute("f",f);
				request.getRequestDispatcher("ShowAllfille.jsp").forward(request, response);
				
				
				
			}
			
			
		}
		else {
		
	    List<Fichier>	f=dao.getallfile();
	    request.setAttribute("f",f);
		request.getRequestDispatcher("ShowAllfille.jsp").forward(request, response);
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
