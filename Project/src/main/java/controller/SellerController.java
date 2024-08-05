package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.SellerDao;
import model.Seller;
import servicesss.EmailService;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SellerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Seller s = new Seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddres(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPass(request.getParameter("password"));
			s.setCpass(request.getParameter("confirmPassword"));
			String pass = request.getParameter("password");
			String cpass = request.getParameter("confirmPassword");
			if (pass.equals(cpass)) {
				SellerDao.sellerRegister(s);
				response.sendRedirect("s-login.jsp");
			} else {
				request.setAttribute("msg", "Pass and Cpass is not matched");
				request.getRequestDispatcher("s-regisration.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			Seller s = new Seller();
			s.setEmail(request.getParameter("email"));
			s.setPass(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if (flag == true) {
				Seller s1 = SellerDao.sellerLogin(s);
				if (s1 == null) {
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("s-login.jsp").forward(request, response);
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("data", s1);
					request.getRequestDispatcher("s-home.jsp").forward(request, response);
				}

			} else {
				request.setAttribute("msg", "Account doesn't exist");
				request.getRequestDispatcher("s-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			Seller s = new Seller();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddres(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			SellerDao.udpateSellerProfile(s);
			HttpSession session = request.getSession();
			session.setAttribute("data", s);
			request.getRequestDispatcher("s-profile.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update pass")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = SellerDao.checkOldPassword(op);
			if(flag == true) {
				if(np.equals(cnp)) {
					SellerDao.sellerUpdatePassword(np, id);
					response.sendRedirect("s-home.jsp");
				}
				else {
					request.setAttribute("msg", "Np and CNP not matched");
					request.getRequestDispatcher("s-change-pass.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old password is incorrect");
				request.getRequestDispatcher("s-change-pass.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("fp")) {
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if(flag == true) {
				Random r = new Random();
				int num = r.nextInt(999999);
				EmailService s = new EmailService();
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("s-verify-otp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "couldn't find account");
				request.getRequestDispatcher("s-forgot-pass.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify")) {
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if(otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("s-new-pass.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "OTP not matched");
				request.setAttribute("otp", otp1);
				request.getRequestDispatcher("s-verify-otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("np")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if(np.equals(cnp)) {
				SellerDao.sellerNewPassword(np, email);
				response.sendRedirect("s-login.jsp");
			}
			else {
				request.setAttribute("msg", "np and cnp not same");
				request.setAttribute("email", email);
				request.getRequestDispatcher("s-new-pass.jsp").forward(request, response);
			}
		}
	}

}
