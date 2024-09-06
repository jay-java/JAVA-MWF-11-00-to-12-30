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

	<section class="blog-banner-area" id="category">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>Shopping Cart</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="#">Home</a></li>
							<li class="breadcrumb-item active" aria-current="page">Shopping
								Cart</li>
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</section>


	<section class="cart_area">
		<div class="container">
			<div class="cart_inner">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col">Total</th>
							</tr>
						</thead>
						<tbody>
							<%
							List<Cart> cart_list = CartDao.getCartListByCusId(s.getId());
							%>
							<%
							int net_price = 0;
							%>
							<%
							for (Cart c : cart_list) {
							%>
							<%
							net_price = net_price + c.getTotal_amount();
							%>
							<tr>
								<td>
									<div class="media">
										<div class="d-flex">
											<img src="images/<%=c.getImage()%>" height="100" width="150"
												alt>
										</div>
										<div class="media-body">
											<p><%=c.getPname()%></p>
										</div>
									</div>
								</td>
								<td>
									<h5>
										Rs.
										<%=c.getPprice()%></h5>
								</td>
								<td>
									<div class="product_count">
										<form action="CartController" method="get">
											<input type="hidden" name="cart_id"
												value="<%=c.getCart_id()%>"> <input type="hidden"
												name="pprice" value="<%=c.getPprice()%>"> <input
												type="hidden" name="total_amount"
												value="<%=c.getTotal_amount()%>"> <input
												type="number" name="qty" value="<%=c.getQty()%>"
												onchange="this.form.submit();"> <input type="hidden"
												name="action" value="update">
										</form>
									</div>
								</td>
								<td>
									<h5>
										Rs.
										<%=c.getTotal_amount()%></h5>
								</td>
							</tr>
							<%
							}
							%>
							<tr>
								<td></td>
								<td></td>
								<td>
									<h5>Subtotal</h5>
								</td>
								<td>
									<h5>
										Rs.
										<%=net_price%></h5>
								</td>
							</tr>
						</tbody>
					</table>
					<% Cart cart = cart_list.get(0); %>
					 <form method="post"
						action="payment.jsp?amount=<%=net_price%>&cid=<%=cart.getCart_id()%>">
						<table border="1">
							<tbody>
								<tr>
									<th>S.No</th>
									<th>Label</th>
									<th>Value</th>
								</tr>

								<tr>
									<td>1</td>
									<td><label>txnAmount*</label></td>
									<td><input title="TXN_AMOUNT" tabindex="10" type="text"
										name="TXN_AMOUNT" value="<%=net_price%>"></td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td><input value="CheckOut" type="submit" onclick=""></td>
								</tr>
							</tbody>
						</table>
						* - Mandatory Fields
					</form>
				</div>
			</div>
		</div>
	</section>

</body>
</html>