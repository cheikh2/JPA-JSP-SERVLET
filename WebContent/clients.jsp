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
			<div class="panel-heading">Ajouter clients</div>
				<div class="panel-body">
				<form action="Client" method="post">
				 <div class="form-group">
					<label>Prenom</label>
					<input class="form-control" type="text" name="prenom"/>
				</div>
				 <div class="form-group">
					<label>Nom</label>
					<input class="form-control" type="text" name="nom"/>
				</div>
				 <div class="form-group">
					<label>Adresse</label>
					<input class="form-control" type="text" name="adress"/>
				</div>
				 <div class="form-group">
					<label>Telephone</label>
					<input class="form-control" type="text" name="telephone"/>
				</div>

				<div class="form-group">
                        <label>Village</label>
                        <select class="form-control" name="idVillage">
                            <option>Selectionnez un village</option>
                            <c:forEach items="${village}" var="v">
                                <option value="${v.id}"> <c:out value="${v.libelle}" /> </option>
                            </c:forEach>
                   </select>
 				</div>
					<button type="submit" class="btn btn-primary">Ajouter</button>
				</form>
				</div>
			</div>
		</div>
		<a hr></a>
		<table class="table table-striped">
				<tr>
				<th>ID</th><th>Prenom</th><th>Nom</th><th>Adresse</th><th>Telephone</th><th>Village</th><th>Supprimer</th>
				</tr>
				<c:forEach items="${client}" var="cl">
				<tr>
				<td><c:out value="${cl.id}"/></td>
				<td><c:out value="${cl.prenom}"/></td>
				<td><c:out value="${cl.nom}"/></td>
				<td><c:out value="${cl.adress}"/></td>
				<td><c:out value="${cl.telephone}"/></td>
				<td><c:out value="${cl.village.libelle}"/></td>
				<td><a href="Edit.php?id=${c.ID}">Edit</a></td>
				<td><a onclick="return confirm('Etes vous sûre ?')" href="Supprime.php?id=${c.ID}">Supprimer</a></td>
				</tr>
				</c:forEach>
				</table>
</body>
</html>