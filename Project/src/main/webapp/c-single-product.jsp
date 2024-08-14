<%@page import="Dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="c-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	%>
	<%
	Product p = ProductDao.getProductByPid(pid);
	%>

	<section class="blog-banner-area" id="blog">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>Shop Single</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="#">Home</a></li>
							<li class="breadcrumb-item active" aria-current="page">Shop
								Single</li>
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</section>


	<div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<img class="img-fluid" src="images/<%=p.getImage() %>">
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text">
						<h3><%=p.getPname() %></h3>
						<h2>Rs. <%=p.getPprice() %></h2>
						<ul class="list">
							<li><a class="active" href="#"><span>Category</span> :
									<%=p.getPcategory() %></a></li>
							<li><a href="#"><span>Availibility</span> : In Stock</a></li>
						</ul>
						<p><%=p.getPdesc() %></p>
						<div class="product_count">
							<a class="button primary-btn" href="WishListController?action=addtowishlist&pid=<%=p.getPid()%>&cid=<%=s.getId()%>">Add to wishlist</a>
						</div>
						<div class="product_count">
							<a class="button primary-btn" href="">Add to Cart</a>
						</div>
						<div class="card_area d-flex align-items-center">
							<a class="icon_btn" href="#"><i class="lnr lnr lnr-diamond"></i></a>
							<a class="icon_btn" href="#"><i class="lnr lnr lnr-heart"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>