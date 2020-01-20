<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				  <ul>
        <li><a href="Ajouterfichierm.jsp" class="ee"><i class="fa fa-plus-square"></i>Ajouter manuellement un utilisateur</a></li>
        <li><a href="Ajouterfichier.jsp" class="contact1-form"><i class="fa fa-plus-square"></i>Ajouter automatiquement des utilisateurs</a></li>
        </ul>
        
						
					<div class="table100-body js-pscroll">
						<table>
						<thead>
								<tr class="row100 head">
									<th class="cell100 column1">Nom de fichier</th>
									<th class="cell100 column1">q1</th>
									<th class="cell100 column1">q2</th>
									<th class="cell100 column1">q3</th>
									<th class="cell100 column1">q4</th>
									<th class="cell100 column1">q5</th>
									<th class="cell100 column1">q6</th>
									<th class="cell100 column1">Action</th>
									
								</tr>
								   <c:forEach  var="P" items="${requestScope.f}">
							<tbody>
								<tr class="row100 body">
								
									<td class="cell100 column1">${P.q1}</td>
								<td class="cell100 column1">${P.q2}</td>
								<td class="cell100 column1">${P.q3}</td>
								<td class="cell100 column1">${P.q4}</td>
								<td class="cell100 column1">${P.q5}</td>
								<td class="cell100 column1">${P.q6}</td>
								<td class="cell100 column1">${P.q7}</td>
								
								<td  class="cell100 column1"><a href="fichier?action=Supprimierfile&id=${P.id}"><i class="fa fa-trash-o" width></i></a>
              <a href="fichier?action=showfile&id=${P.id}"><i class="fa fa-pencil-square-o"></i></a></td>
								
								</tr>

								

							
							</tbody>
							 </c:forEach>
						</table>
					</div>
					
				</div>
				<ul>
        <li><a href="IndexRh.jsp">Retourner à l'accueil</a></li>
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