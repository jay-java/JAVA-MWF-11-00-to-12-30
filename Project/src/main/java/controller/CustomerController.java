package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.razorpay.CustomerClient;

import Dao.CustomerDao;
import Dao.SellerDao;
import model.Customer;
import model.Seller;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Customer s = new Customer();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddres(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPass(request.getParameter("password"));
			s.setCpass(request.getParameter("confirmPassword"));
			String pass = request.getParameter("password");
			String cpass = request.getParameter("confirmPassword");
			if (pass.equals(cpass)) {
				CustomerDao.sellerRegister(s);
				response.sendRedirect("c-login.jsp");
			} else {
				request.setAttribute("msg", "Pass and Cpass is not matched");
				request.getRequestDispatcher("c-regisration.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			Customer s = new Customer();
			s.setEmail(request.getParameter("email"));
			s.setPass(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = CustomerDao.checkEmail(email);
			if (flag == true) {
				Customer s1 = CustomerDao.sellerLogin(s);
				if (s1 == null) {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("c-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("c-home.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "Account doesn't exist");
				request.getRequestDispatcher("c-login.jsp").forward(request, response);
			}
		}
	}

}
