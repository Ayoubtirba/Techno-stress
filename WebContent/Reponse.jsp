
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="Modele.dao.IUserDao"%>
<%@ page import="Modele.dao.Userdao"%>
<%@ page import="Modele.entites.User"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<form action="Questionnaire" method="post">
		<c:forEach var="P" items="${requestScope.f}">
		   <h3> Nom de fichier :${P.q1}
			<input  type="hidden" name="nom" value="${P.q1}">
			</h3>
			<br />
			<td>${P.q2}&nbsp;&nbsp;:</td>
			<td><label>True <input type="radio" name="q1"
					value="true" checked="checked"/>
			</label> <label>False <input type="radio" name="q1" value="false" />
			</label></td>
			<br/>
			<td>${P.q3}&nbsp;&nbsp;:</td>
			<td><label>True <input type="radio" name="q2"
					value="true"   checked="checked"/>
			</label> <label>False <input type="radio" name="q2" value="false" />
			</label></td>
			<br />
			<td>${P.q4}&nbsp;&nbsp;:</td>
			<td><label>True <input type="radio" name="q3"
					value="true"  checked="checked" />
			</label> <label>False <input type="radio" name="q3" value="false" />
			</label></td>
			<br />
			<td>${P.q5}&nbsp;&nbsp;:</td>
			<td><label>True <input type="radio" name="q4"
					value="true"  checked="checked" />
			</label> <label>False <input type="radio" name="q4" value="false" />
			</label></td>
			<br />
			<td>${P.q6}&nbsp;&nbsp;:</td>
			<td><label>True <input type="radio" name="q5"
					value="true"  checked="checked" />
			</label> <label>False <input type="radio" name="q5" value="false" />
			</label></td>
			<br />
			<td>${P.q7}&nbsp;&nbsp;:</td>
			<td><label>True <input type="radio" name="q6"
					value="true"  checked="checked"/>
			</label> <label>False <input type="radio" name="q6" value="false" />
			</label></td>
			<br />
		</c:forEach>
		<input type="hidden" name="action" value="ajouterreponse">
		<input type="hidden" name="iduser" value="<%=request.getParameter("iduser")%>">
		<input type="hidden" name="idfile" value="<%=request.getParameter("idfile")%>">
			 <input type="submit" value="ajouter">
	</form>
</body>
</html>