<%@page import="DAO.StudentDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
	<h1>Hello, world!</h1>
	<%
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	<%
	Student s = null;
	if (session.getAttribute("data") != null) {
		s = (Student) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>


	<h4>
		Name :
		<%=s.getName()%></h4>
	<h4>
		contact :
		<%=s.getContact()%></h4>
	<h4>
		Address :
		<%=s.getAddress()%></h4>
	<h4>
		Email :
		<%=s.getEmail()%></h4>
	<h4>
		Password :
		<%=s.getPassword()%></h4>

<div class="container">

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Contact</th>
				<th scope="col">Address</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
		<%List<Student> list = StudentDao.getAllStudents(); %>
		<%for(Student s1:list){ %>
			<tr>
				<th scope="row"><%=s1.getId() %></th>
				<td><%=s1.getName() %></td>
				<td><%=s1.getContact() %></td>
				<td><%=s1.getAddress() %></td>
				<td><%=s1.getEmail() %></td>
				<td><%=s1.getPassword() %></td>
				<td>
					<form action ="StudentController" method="post"> 
						<input type="hidden" name="id" value="<%=s1.getId()%>">
						<input type="submit" name="action" value="edit">
					</form>
				</td>
				<td>
					<a href="">Delete</a>
				</td>
			</tr>
			<%} %>
			
		</tbody>
	</table>
</div>


	<h1>
		<a href="logout.jsp">Logout</a>
	</h1>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>

