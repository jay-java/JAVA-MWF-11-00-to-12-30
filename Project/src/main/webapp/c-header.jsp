<%@page import="model.Customer"%>
<%@page import="model.Seller"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<!-- Mirrored from preview.colorlib.com/theme/aroma/ by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 29 Jul 2024 06:23:48 GMT -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Aroma Shop - Home</title>
<link rel="icon" href="img/Fevicon.png" type="image/png">
<link rel="stylesheet" href="vendors/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="vendors/fontawesome/css/all.min.css">
<link rel="stylesheet" href="vendors/themify-icons/themify-icons.css">
<link rel="stylesheet" href="vendors/nice-select/nice-select.css">
<link rel="stylesheet"
	href="vendors/owl-carousel/owl.theme.default.min.css">
<link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	<%
	Customer s = null;
	if (session.getAttribute("data") != null) {
		s = (Customer) session.getAttribute("data");
	} else {
		response.sendRedirect("s-login.jsp");
	}
	%>
	<header class="header_area">
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light">
				<div class="container">
					<a class="navbar-brand logo_h" href="index-2.html"><img
						src="img/logo.png" alt></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<div class="collapse navbar-collapse offset"
						id="navbarSupportedContent">
						<ul class="nav navbar-nav menu_nav ml-auto mr-auto">
							<li class="nav-item active"><a class="nav-link"
								href="s-home.jsp">Home</a></li>

							<li class="nav-item submenu dropdown"><a href="#"
								class="nav-link dropdown-toggle" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Products</a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link"
										href="s-upload-product.jsp">Cart</a></li>
									<li class="nav-item"><a class="nav-link"
										href="s-manage-product.jsp">Wishlist</a></li>
								</ul></li>
							<li class="nav-item submenu dropdown"><a href="#"
								class="nav-link dropdown-toggle" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false"><%=s.getName()%></a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link"
										href="s-profile.jsp">Profile</a></li>
									<li class="nav-item"><a class="nav-link"
										href="s-change-pass.jsp">Change Password</a></li>
									<li class="nav-item"><a class="nav-link"
										href="s-logout.jsp">Logout</a></li>
								</ul></li>

						</ul>
						<ul class="nav-shop">
							<li class="nav-item"><button>
									<i class="ti-search"></i>
								</button></li>
							<li class="nav-item"><button>
									<i class="ti-shopping-cart"></i><span class="nav-shop__circle">3</span>
								</button></li>
							<li class="nav-item"><a class="button button-header"
								href="#">Buy Now</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</header>

</body>
</html>