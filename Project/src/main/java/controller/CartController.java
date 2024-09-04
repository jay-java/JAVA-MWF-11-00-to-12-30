package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CartDao;
import Dao.ProductDao;
import model.Cart;
import model.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		 
		
		
		
		
		
		
		
		if(action.equalsIgnoreCase("addtocart")) {
			Cart c = new Cart();
			int pid = Integer.parseInt(request.getParameter("pid"));
			Product p = ProductDao.getProductByPid(pid);
			c.setPid(pid);
			c.setCus_id(Integer.parseInt(request.getParameter("cusid")));
			c.setPprice(p.getPprice());
			c.setQty(1);
			c.setTotal_amount(p.getPprice()*c.getQty());
			c.setPname(p.getPname());
			c.setPcategory(p.getPcategory());
			c.setPdesc(p.getPdesc());
			c.setImage(p.getImage());
			c.setPayment_status("pending");
			CartDao.insertIntocart(c);
			response.sendRedirect("c-home.jsp");
		}
		else if(action.equalsIgnoreCase("update")) {
			int cart_id = Integer.parseInt(request.getParameter("cart_id"));
			int pprice = Integer.parseInt(request.getParameter("pprice"));
			int total = Integer.parseInt(request.getParameter("total_amount"));
			int qty = Integer.parseInt(request.getParameter("qty"));
			Cart c = new Cart();
			c.setCart_id(cart_id);
			c.setQty(qty);
			c.setTotal_amount(qty*pprice);
			CartDao.updateCart(c);
			response.sendRedirect("c-cart.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
