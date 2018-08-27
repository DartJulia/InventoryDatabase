<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://bootswatch.com/4/minty/bootstrap.min.css" />
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body style="background-color:#F0EDE5">
<br><br>
	<h1 style="text-align:center">${title}</h1>
<br>

	<form method="post" style="text-align:center">
		<div class="form-group">
			<label for="name">Name:  </label> <input id="name" name="name"
				value="${item.name}" autocomplete="off">
				<br>
				
		</div>

		<div class="form-group">
			<label for="description">Description:  </label> <input id="description"
				name="description" value="${item.description}" autocomplete="off">
				<br>
				
		</div>


		<div>
			<label for="quantity">Quantity:  </label> <input id="quantity"
				name="quantity" value="${item.quantity}">
				<br>
				<br>
		</div>

		<div class="form-group">
			<label for="price">Price:  </label> <input id="price" name="price"
				value="${item.price}">
				<br>
			</div>	
	
		<button type="submit" class="btn btn-primary">Submit</button>
		<a href="/itemslist" class="btn btn-link">Cancel</a>




	</form>


</body>
</html>