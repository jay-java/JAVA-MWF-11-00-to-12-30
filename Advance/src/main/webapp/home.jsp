<%@page import="model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache"); 
response.setHeader ("Expires", "0");
%>
<%
Student s = null;
if(session.getAttribute("data")!=null){
	s = (Student)session.getAttribute("data");
}
else{
	response.sendRedirect("login.jsp");
}
%>


<h1>Name : <%=s.getName() %></h1>
<h1>contact : <%=s.getContact() %></h1>
<h1>Address : <%=s.getAddress() %></h1>
<h1>Email : <%=s.getEmail() %></h1>
<h1>Password : <%=s.getPassword() %></h1>

<h1><a href="logout.jsp">Logout</a></h1>
</body>
</html>