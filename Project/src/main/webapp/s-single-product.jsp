<%@page import="Dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="s-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int pid = Integer.parseInt(request.getParameter("pid")); %>
<%Product p = ProductDao.getProductByPid(pid); %>
	<section class="login_box_area section-margin">
		<div class="container">
			<div class="row">

				<div class="col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3>Seller Upload Product</h3>
						<form class="row login_form" action="ProductController"
							id="register_form" method="post" enctype="multipart/form-data">
							<input type="hidden" name="pid" value="<%=p.getPid()%>">
							<div class="col-md-12 form-group">
								<img src ="images/<%=p.getImage()%>" height="100" width="100">
							</div>
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="name" name="image"
									placeholder="Product Image" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pname"
									value="<%=p.getPname() %>" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pprice"
									value="<%=p.getPprice() %>" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name"
									name="pcategory" value="<%=p.getPcategory() %>"
									onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pdesc"
									value="<%=p.getPdesc() %>"
									onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>

							<div class="col-md-12 form-group">
								<button type="submit" value="update" name="action"
									class="button button-register w-100">Update</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>