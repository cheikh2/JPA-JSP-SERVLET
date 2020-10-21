<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clients</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
<%@include file="header.jsp" %>
	<div class="container col-md-10 col-md-offset-1">
		<div class="panel panel-primary">
			<div class="panel-heading">Recherche clients</div>
				<div class="panel-body">
				<table class="table table-striped">
				<tr>
				<th>ID</th><th>Prenom</th><th>Nom</th><th>Adresse</th><th>Telephone</th><th>Village</th><th>Supprimer</th>
				</tr>
				<c:forEach items="${model.clients}" var="c">
				<tr>
				<td>${c.ID}</td>
				<td>${c.nom}</td>
				<td>${c.adress}</td>
				<td>${c.telephone}</td>
				<td><a href="Edit.php?id=${c.ID}">Edit</a></td>
				<td><a onclick="return confirm('Etes vous sûre ?')" href="Supprime.php?id=${c.ID}">Supprimer</a></td>
				</tr>
				</c:forEach>
				</table>
				</div>
			</div>
		</div>
</body>
</html>