<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Modele.dao.IUserDao" %>
<%@ page import="Modele.dao.Userdao" %>
<%@ page import="Modele.entites.User" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
	
	
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Line Menu Styles</title>
		<meta name="description" content="An open collection of menu styles that use the line as a creative design element" />
		<meta name="keywords" content="web design, styles, inspiration, line, pseudo-element, SVG, animation" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<!--[if IE]>
			<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
	</head>
	<body>
		<div class="container">
			<section class="section section--menu" id="Maria">
				<h2 class="menu__item" >Techno Steress</h2>
				<span class="link-copy"></span>
				<nav class="menu menu--maria">
					<ul class="menu__list">
						<li class="menu__item menu__item--current"><a href="Reco?aciton=&id_psy=${sessionScope.id}" class="menu__link">Notifcation</a></li>
						<li class="menu__item"><a href="" class="menu__link"></a></li>
						<li class="menu__item"><a href="Questionnaire?action=Recomondaiton&iduser=${sessionScope.id}" class="menu__link"></a></li>
						<li class="menu__item"><a href="#" class="menu__link"></a></li>
						<li class="menu__item"><a href="deco.jsp" class="menu__link">Se&nbsp;deconnecter</a></li>
						
					</ul>
					
				</nav>
			</section>
		
		</div>
		<!-- /container -->
	 <script src="js/classie.js"></script>
		<script src="js/clipboard.min.js"></script> 
		<script>
		(function() {
			[].slice.call(document.querySelectorAll('').forEach(function(menu) {
				var menuItems = menu.querySelectorAll('menu__link'),
					setCurrent = function(ev) {
						ev.preventDefault();

						var item = ev.target.parentNode; // li

						// return if already current
						if (classie.has(item, 'menu__item--current')) {
							return false;
						}
						// remove current
						classie.remove(menu.querySelector('.menu__item--current'), 'menu__item--current');
						// set current
						classie.add(item, 'menu__item--current');
					};

				[].slice.call(menuItems).forEach(function(el) {
					el.addEventListener('click', setCurrent);
				});
			});

	[].slice.call(document.querySelectorAll('.link-copy')).forEach(function(link) {
				link.setAttribute('data-clipboard-text', location.protocol + '/' + location.host + location.pathname + '#' + link.parentNode.id);
				new Clipboard(link);
				link.addEventListener('click', function() {
					classie.add(link, 'link-copy--animate');
					setTimeout(function() {
						classie.remove(link, 'link-copy--animate');
					}, 300);
				});
			});
		})(window);
		</script>
	</body>
</html>
