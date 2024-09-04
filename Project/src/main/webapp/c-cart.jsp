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
						<%List<Cart> cart_list = CartDao.getCartListByCusId(s.getId()); %>
						<%int net_price = 0; %>
						<% for(Cart c : cart_list){%>
							<%net_price = net_price+c.getTotal_amount(); %>
							<tr>
								<td>
									<div class="media">
										<div class="d-flex">
											<img src="images/<%=c.getImage() %>" height="100" width="150" alt>
										</div>
										<div class="media-body">
											<p><%=c.getPname() %></p>
										</div>
									</div>
								</td>
								<td>
									<h5>Rs. <%=c.getPprice() %></h5>
								</td>
								<td>
									<div class="product_count">
										<form action="CartController" method="get">
										<input type="hidden" name="cart_id" value="<%=c.getCart_id()%>">
										<input type="hidden" name="pprice" value="<%=c.getPprice()%>">
										<input type="hidden" name="total_amount" value="<%=c.getTotal_amount()%>">
										<input type="number" name="qty" value="<%=c.getQty()%>" onchange="this.form.submit();">
										<input type="hidden" name="action" value="update">
										</form>
									</div>
 								</td>
								<td>
									<h5>Rs. <%=c.getTotal_amount() %></h5>
								</td>
							</tr>
							<%} %>
							<tr>
								<td></td>
								<td></td>
								<td>
									<h5>Subtotal</h5>
								</td>
								<td>
									<h5>Rs. <%=net_price %></h5>
								</td>
							</tr>
							<tr class="shipping_area">
								<td class="d-none d-md-block"></td>
								<td></td>
								<td>
									<h5>Shipping</h5>
								</td>
								<td>
									<div class="shipping_box">
										<ul class="list">
											<li><a href="#">Flat Rate: $5.00</a></li>
											<li><a href="#">Free Shipping</a></li>
											<li><a href="#">Flat Rate: $10.00</a></li>
											<li class="active"><a href="#">Local Delivery: $2.00</a></li>
										</ul>
										<h6>
											Calculate Shipping <i class="fa fa-caret-down"
												aria-hidden="true"></i>
										</h6>
										<select class="shipping_select">
											<option value="1">Bangladesh</option>
											<option value="2">India</option>
											<option value="4">Pakistan</option>
										</select> <select class="shipping_select">
											<option value="1">Select a State</option>
											<option value="2">Select a State</option>
											<option value="4">Select a State</option>
										</select> <input type="text" placeholder="Postcode/Zipcode"> <a
											class="gray_btn" href="#">Update Details</a>
									</div>
								</td>
							</tr>
							<tr class="out_button_area">
								<td class="d-none-l"></td>
								<td class></td>
								<td></td>
								<td>
									<div class="checkout_btn_inner d-flex align-items-center">
										<a class="gray_btn" href="#">Continue Shopping</a> <a
											class="primary-btn ml-2" href="#">Proceed to checkout</a>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>

</body>
</html>