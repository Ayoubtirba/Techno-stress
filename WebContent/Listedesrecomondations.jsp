<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Modele.dao.IUserDao" %>
<%@ page import="Modele.dao.Userdao" %>
<%@ page import="Modele.entites.User" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>


	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	

<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util3.css">
	<link rel="stylesheet" type="text/css" href="css/main3.css">
		<link rel="stylesheet" type="text/css" href="css/util.css">

<!--===============================================================================================-->
</head>
<body>

 <div class="container">
		<div class="container-table100">
			<div class="wrap-table100">
				<div class="table100 ver5 m-b-110 input100">
					<div class="table100-body js-pscroll">
						<table>
						<thead>
								<tr class="row100 head">
									<th class="cell100 column1">Recomendation</th>
								
									
									<th class="cell100 column1">Action</th>
									
								</tr>
		 <% 
         PreparedStatement ps;
         Class.forName("org.mariadb.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/technostress", "root", "");
				ps = cn.prepareStatement("SELECT id_reco,recomondation FROM `recomendation` WHERE `id_user`=? and status=0");
				ps.setInt(1,Integer.parseInt(request.getParameter("iduser")));
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {%>
        <tr>
							<tbody>
								<tr class="row100 body">
									<td class="cell100 column1"><%= rs.getString(2)%>  </td>
								<td class="cell100 column1"><a href="Questionnaire?action=sup&iduser=${sessionScope.id }&idrecomon=<%= rs.getString(1)%>">Supprimier</a></td>
								</tr>

								

							
							</tbody>
							         <%} %>
						</table>
					</div>
					
				</div>
		<ul>
        <li><a href="IndexUser.jsp">Retourner à l'accueil</a></li>
        </ul>
							</div>
			</div>
		</div>
	
				
 
        <!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})
		});
			
		
	</script>
<!--===============================================================================================-->
	<script src="js/main3.js"></script>