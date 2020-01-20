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
<!--===============================================================================================-->
</head>
<body>
<div class="">
		<div class="container-contact1">
			<div class="contact1-pic js-tilt" data-tilt>
				<img src="images/psy1.jpg" alt="IMG">
			</div>
			<form class="contact1-form validate-form" action="fichier" method="post">
				<span class="contact1-form-title ">
				Ajouter un questionnaire
				</span>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="nom" placeholder="Nom de questionnaire" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="q1" placeholder="Question num�ro 1" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="q2" placeholder="Question num�ro 2" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="q3" placeholder="Question num�ro 3" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="q4" placeholder="Question num�ro 4" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="q5" placeholder="Question num�ro 5" required="required">
					<span class="shadow-input1"></span>
				</div>
				<div class="wrap-input1 validate-input" data-validate = "Nom est obligatoire">
					<input class="input1" type="text" name="q6" placeholder="Question num�ro 6" required="required">
					<span class="shadow-input1"></span>
				</div>
				    <input type="hidden" name="action" value="manule">

				
				<div class="container-contact1-form-btn">
					<button class="contact1-form-btn">
						<span>
							Ajouter
							<i class="fa fa-long-arrow-right" aria-hidden="true"></i>

						</span>
					</button>
				</div>
				<input type="hidden" name="action" value="ajouter" />
			</form>
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
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>

<!-- Global site tag (gtag.js) - Google Analytics -->

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