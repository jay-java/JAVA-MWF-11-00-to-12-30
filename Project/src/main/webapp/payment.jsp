<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.bttnStyle
	{
		background-color: lightblue;
		border-radius: 0.50rem;
		border:1px solid transperent;
	}
</style>
<script type="text/javascript">
	var xhttp=new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID()
	{
		/*  alert("1");  */
		var number=document.getElementById("amount").value;
		var cid=document.getElementById("cid").value;
		xhttp.open("GET","http://localhost:8080/Project/OrderCreation?amount="+number+"&id="+cid,false);
		/* alert("2"); */
		xhttp.send();
		RazorpayOrderId=xhttp.responseText;
		  
		alert(number);  
		OpenCheckOut(number); 
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut()
	{
		/* alert("3");  */
		var number=document.getElementById("amount").value;
		/* alert(number); */
		var options={
				"key":"rzp_test_j01fp37VE3NWWF",
				"amount":number,
				"currency":"INR",
				"name":"Anjali Makwana",	
				"description":"Test",
				"order_id":RazorpayOrderId,
				
				"callback_url":"http://localhost:8080/Project/c-home.jsp",
				"prefill":{
					"name":"Anjali Makwana",
					"email":"AnjaliMakwana@gmail.com",
					"contact":"9328334187"
				},
				"notes":{
					"address":"Ahmedabad"
				},
				"theme":{
					"color":"#3399cc"
				}
				
				
		};
		var rzp1=new Razorpay(options);
		rzp1.on('payment.failed',function (response){
			alert(response.error.code);
	        alert(response.error.description);
	        alert(response.error.source);
	        alert(response.error.step);
	        alert(response.error.reason);
	        alert(response.error.metadata.order_id);
	        alert(response.error.metadata.payment_id);
		});
		rzp1.open();
	    /* e.preventDefault(); */
	}
</script>
</head>
<body>
<div id="order_id">
	
</div>
<%int am = Integer.parseInt(request.getParameter("amount")); %>
<%int cart_id = Integer.parseInt(request.getParameter("cid")); %>
<center> 
	<input type="hidden" id="amount" value="<%=am%>">
	<input type="hidden" id="cid" value="<%=cart_id%>"> 
	<button id="payButton" onclick="CreateOrderID()" class="bttnStyle">Pay Now</button>
</center>
</body>
</html>