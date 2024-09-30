<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<h1 class="text-center">Hello, world!</h1>
	<div class="container">
	<form action="register" method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Name </label> <input
				type="text" name="name" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Contact </label> <input
				type="text" name="contact" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Address </label> <input
				type="text" name="address" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Email
				address</label> <input type="email" name="email" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" name="password" class="form-control"
				id="exampleInputPassword1">
		</div>
		<button type="submit" class="btn btn-primary">Register</button>
	</form>
	</div>

</body>
</html>









<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hello index page
	<h1>
		<a href="home">Home</a>
	</h1>
	 <%
 int contact= (int)request.getAttribute("contact");
 String name = (String)request.getAttribute("name");
 List list = (List)request.getAttribute("list");
 %>
 
 <h1><%out.print(contact); %></h1>
 <h1><%out.print(name); %></h1>
 <h1><%out.print(list); %></h1>
 

	<h1>${contact }</h1>
	<h1>${name }</h1>
	<h1>${list }</h1>
	<c:forEach items="${list }" var="u">
		<h2>${u }</h2>
	</c:forEach>
	
	

</body>
</html> --%>