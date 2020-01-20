<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util1.css">
	<link rel="stylesheet" type="text/css" href="css/main1.css">
</head>
<body>
	<div class="container-contact1">
			<div class="contact1-pic js-tilt" data-tilt>
				<img src="images/psy1.jpg" alt="IMG">
			</div>

			<form class="contact1-form validate-form" action="User" method="post">
				<span class="contact1-form-title ">
					Entrez les informations d'utilisateur
				</span>

				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="nom" placeholder="Entrez le nom" required="required">
					<span class="shadow-input1"></span>
				</div>

				<div class="wrap-input1 validate-input" data-validate = "Prenom est obligatoire">
					<input class="input1" type="text" name="prenom" placeholder="Entrez votre prenom" required="required">
					<span class="shadow-input1"></span>
				</div>

				<div class="wrap-input1 validate-input" data-validate = " Email est obligatoire">
					<input class="input1" type="email" name="email" placeholder="Entrez l'email" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Message is required">
					<input class="input1" type="text" name="passe" placeholder="Entrez votre mote de passe" required="required">
					<span class="shadow-input1"></span>
				</div>

				<div class="container-contact1-form-btn">
					<button class="contact1-form-btn" onclick="bien insérer">
						<span>
							Ajouter
							<i class="fa fa-long-arrow-right" aria-hidden="true"></i>
							
						</span>
					</button>
					<input type="hidden" name="action" value="ajouteruser" />
				</div>
			</form>
		</div>


	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>

<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

<!--===============================================================================================-->
	<script src="js/main1.js"></script>

</body>
</html>