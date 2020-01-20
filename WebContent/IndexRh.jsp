<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Modele.dao.IUserDao" %>
<%@ page import="Modele.dao.Userdao" %>
<%@ page import="Modele.entites.User" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!doctype html>
<html lang="eg" class="no-js">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href='http://fonts.googleapis.com/css' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
<link rel="stylesheet" href="css/style.css"> <!-- Resource style -->
	<script src="js/modernizr.js"></script> <!-- Modernizr -->
</head>
<body>
<main id="cd-main-content">
	<section id="cd-intro">
		<h1><c:if test="${ !empty sessionScope.n && !empty sessionScope.p }">
        <p>Bienvenue monsieur ${ sessionScope.n } ${ sessionScope.p } </p>
    </c:if></h1>
		<header class="cd-header">
			<div id="cd-logo"><h1>Techno&nbsp;Stress</h1></div>
			<a class="cd-menu-trigger" href="#main-nav">Menu<span></span></a>
		</header>
		<div class="cd-blurred-bg"></div>
	</section> <!-- cd-intro -->
</main>

<div class=""></div>

<nav id="main-nav">

<ul>
    <li><a href="User"><span>Gestion des utlisateurs</span></a></li>
    <li><a href="Psy"><span>Gestion des psychiatres</span></a></li>
     <li><a href="fichier"><span>Gestion des fichiers</span></a></li>
      <li><a href="Choix"><span>Choisir l'exman et le patient</span></a></li>
     <li><a href="deco.jsp"><span> Se deconnecter</span></a></li>
    
</ul>
	<a href="#0" class="cd-close-menu">Close<span></span></a>
</nav>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/menu.js"></script> <!-- Resource jQuery -->
</body>
</html>