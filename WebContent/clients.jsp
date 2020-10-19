<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clients</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
	<div class="container col-md-10 col-md-offset-1">
		<div class="panel panel-primary">
			<div class="panel-heading">Ajouter clients</div>
				<div class="panel-body">
				<form action="Client" method="post">
				 <div class="form-group">
					<label>Prenom</label>
					<input type="text" name="prenom"/>
				</div>
				 <div class="form-group">
					<label>Nom</label>
					<input type="text" name="nom"/>
				</div>
				 <div class="form-group">
					<label>Adress</label>
					<input type="text" name="adress"/>
				</div>
				 <div class="form-group">
					<label>Telephone</label>
					<input type="text" name="telephone"/>
				</div>
				<div class="form-group">
					<label>Village</label>
					<input type="text" name="idVillage"/>
				</div>
					<button type="submit" class="btn btn-primary">Ajouter</button>
				</form>
				</div>
			</div>
		</div>
		<a hr></a>
</body>
</html>