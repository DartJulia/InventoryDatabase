<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
	text-align: center;
}
body{
color:: #D1B894;
}
</style>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://bootswatch.com/4/minty/bootstrap.min.css" />
<title>Display Items</title>
</head>
<body style="background-color:#F0EDE5">
	<br>
	<h1>Coffee Inventory Database System</h1>
	<br>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>Food</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
					<td>${item.quantity}</td>
					<td>${item.price}</td>
					<td><a class="btn btn-primary btn-small"
						href="/itemslist/${item.id}/update">Edit</a> <a
						class="btn btn-primary btn-small" href="/itemslist/${item.id}/delete"
						>Delete</a></td>
				</tr>


			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-secondary" href="itemslist/add">Add</a>
<script>
function ConfirmDelete()
{
  var x = confirm("Are you sure you want to delete?");
  if (x)
      return true;
  else
    return false;
}
</script>
</body>
</html>