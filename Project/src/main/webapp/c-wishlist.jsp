<%@page import="Dao.WishlistDao"%>
<%@page import="model.Wishlist"%>
<%@page import="Dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
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
	List<Wishlist> list = WishlistDao.getWishListByCudId(s.getId());
	%>

	<section class="cart_area">
		<div class="container">
			<div class="cart_inner">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Product Category</th>
								<th scope="col">Product Description</th>
								<th scope="col">Remove Product</th>
							</tr>
						</thead>
						<tbody>
						<%for(Wishlist w:list){ %>
						<%int pid = w.getPid(); %>
						<%Product p = ProductDao.getProductByPid(pid); %>
							<tr>
								<td>
									<div class="media">
										<div class="d-flex">
											<img src="images/<%=p.getImage() %>" height="100" width="100">
										</div>
										<div class="media-body">
											<p><%=p.getPname() %>e</p>
										</div>
									</div>
								</td>
								<td>
									<h5>Rs. <%=p.getPprice() %></h5>
								</td>
								<td>
									<h5><%=p.getPcategory() %></h5>
								</td>
								<td>
									<h5><%=p.getPdesc() %></h5>
								</td>
								
								<td>
									<h5><a href="remove-wihslist.jsp?pid=<%=p.getPid()%>">Remove</a></h5>
								</td>
							</tr>
							<%} %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
</body>
</html>