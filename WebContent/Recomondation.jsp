<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Modele.dao.IUserDao"%>
<%@ page import="Modele.dao.Userdao"%>
<%@ page import="Modele.entites.User"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
===============================================================================================
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
===============================================================================================
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
===============================================================================================
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
===============================================================================================	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
===============================================================================================
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
===============================================================================================
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css"> -->
<!--===============================================================================================-->
 
</head>
<body>

<form action="Reco" method="get"> 

		<c:forEach var="P" items="${requestScope.f}">
		<c:forEach var="r" items="${requestScope.r}" >
		   <h3> Nom de fichier :${P.q1}
			
			et email de patient :<%=request.getParameter("email")%>
			</h3>
		
			<td>${P.q2}&nbsp;&nbsp;:</td>
			
		<c:if test="${r.reponse1=='True'}" >
			<td><label>True <input type="radio" name="q1"
					checked/>
			</label> <label>False <input type="radio" name="q1" value="${r.reponse1}" disabled="disabled" />
			</label></td>
			</c:if>
				<c:if test="${r.reponse1=='False'}" >
			<td><label>True <input type="radio" name="q1"
					value="${r.reponse1}" disabled="disabled"/>
			</label> <label>False <input type="radio" name="q1" disabled="disabled" checked/>
			</label></td>
			</c:if>
			<br />
			<td>${P.q3}&nbsp;&nbsp;:</td>
				
		<c:if test="${r.reponse2=='True'}" >
			<td><label>True <input type="radio" name="q2"
					checked/>
			</label> <label>False <input type="radio" name="q2" value="" disabled="disabled" />
			</label></td>
			</c:if>
				<c:if test="${r.reponse2=='False'}" >
			<td><label>True <input type="radio" name="q2"
					value="" disabled="disabled"/>
			</label> <label>False <input type="radio" name="q2" disabled="disabled" checked/>
			</label></td>
			</c:if>
			<br />
			<br />
			<td>${P.q4}&nbsp;&nbsp;:</td>
				
		<c:if test="${r.reponse3=='True'}" >
			<td><label>True <input type="radio" name="q3"
					checked/>
			</label> <label>False <input type="radio" name="q3" value="" disabled="disabled" />
			</label></td>
			</c:if>
				<c:if test="${r.reponse3=='False'}" >
			<td><label>True <input type="radio" name="q3"
					value="${r.reponse3}" disabled="disabled"/>
			</label> <label>False <input type="radio" name="q3" disabled="disabled" checked/>
			</label></td>
			</c:if>
			<br />
			<br />
			<td>${P.q5}&nbsp;&nbsp;:</td>
			<c:if test="${r.reponse4=='True'}" >
			<td><label>True <input type="radio" name="q4"
					checked/>
			</label> <label>False <input type="radio" name="q4" value="" disabled="disabled" />
			</label></td>
			</c:if>
				<c:if test="${r.reponse4=='False'}" >
			<td><label>True <input type="radio" name="q4"
					value="" disabled="disabled"/>
			</label> <label>False <input type="radio" name="q4" disabled="disabled" checked/>
			</label></td>
			</c:if>
			<br />
			<br />
			<td>${P.q6}&nbsp;&nbsp;:</td>
			<c:if test="${r.reponse5=='True'}" >
			<td><label>True <input type="radio" name="q5"
					checked/>
			</label> <label>False <input type="radio" name="q5" value="" disabled="disabled" />
			</label></td>
			</c:if>
				<c:if test="${r.reponse5=='False'}" >
			<td><label>True <input type="radio" name="q5"
					value="" disabled="disabled"/>
			</label> <label>False <input type="radio" name="q5" disabled="disabled" checked/>
			</label></td>
			</c:if>
			<br />
			<br />
			<td>${P.q7}&nbsp;&nbsp;:</td>
			<c:if test="${r.reponse6=='True'}" >
			<td><label>True <input type="radio" name="q6"
					checked/>
			</label> <label>False <input type="radio" name="q6" value="" disabled="disabled" />
			</label></td>
			</c:if>
				<c:if test="${r.reponse6=='False'}" >
			<td><label>True <input type="radio" name="q6"
					value="${r.reponse1}" disabled="disabled"/>
			</label> <label>False <input type="radio" name="q6" disabled="disabled" checked/>
			</label></td>
			</c:if>
			<br />
			<td>la date de recepetion est :</td> ${r.date}<td></td>
			
			<br />
				<input type="hidden" name="reponse" value="${r.id_rep}" >
			</c:forEach>
		</c:forEach>
				<br />
	<br />
		<br />
			<br />
			<input type="hidden" name="file" value="<%=request.getParameter("idfile") %>">
			<input type="hidden" name="user" value="<%=request.getParameter("iduser") %>">
			<input type="hidden" name="psy" value="<%=request.getParameter("idpsy") %>">
			

		<label for="story">Recomondation :</label>
				<br />
<textarea id="story" name="story"
          rows="5" cols="33">

</textarea>
		<br />
		<input type="hidden" value="ajouter" name="action">
	<input type="submit" value="ajouter">
</form>
	<ul>
        <li><a href="Reco?aciton=&id_psy=<%=request.getParameter("idpsy") %>">Retourner à l'accueil</a></li>
        </ul>
</body>
</html>