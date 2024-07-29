<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
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
					<div class="login_form_inner">
						<h3>Seller Login</h3>
						<form class="row login_form" action="#/" id="contactForm">
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="email"
									placeholder="Email" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="name"
									placeholder="Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Password'">
							</div>
							
							<div class="col-md-12 form-group">
								<button type="submit" value="submit"
									class="button button-login w-100">Log In</button>
								<a href="#">Forgot Password?</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>