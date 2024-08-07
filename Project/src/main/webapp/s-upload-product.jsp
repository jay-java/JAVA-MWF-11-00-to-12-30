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

	<section class="login_box_area section-margin">
		<div class="container">
			<div class="row">

				<div class="col-lg-6">
					<div class="login_form_inner register_form_inner">
						<h3>Seller Upload Product</h3>
						<form class="row login_form" action="ProductController"
							id="register_form" method="post" enctype="multipart/form-data">
							<input type="hidden" name="sid" value="<%=s.getId()%>">
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="name" name="image"
									placeholder="Product Image" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pname"
									placeholder="Product name" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pprice"
									placeholder="Product Price" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name"
									name="pcategory" placeholder="Product Category"
									onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pdesc"
									placeholder="Product Description"
									onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>

							<div class="col-md-12 form-group">
								<button type="submit" value="upload" name="action"
									class="button button-register w-100">Upload</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>