<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h3>List product</h3>
	<table>
		<tr>
			<th>STT</th>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Description</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${productList}" var="product" varStatus="loop">
			<tr>
				<td>${loop.index }</td>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td>${product.categoryId }</td>
				<td>${product.description }</td>
				<td>
					<a href="#">Update</a> | 
					<a href="#">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>