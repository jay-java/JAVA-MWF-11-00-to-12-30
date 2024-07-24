package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.StudentDao;
import model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("delete")){
			int id = Integer.parseInt(request.getParameter("id"));
			StudentDao.deleteStudent(id);
			response.sendRedirect("home.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Student s = new Student();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			System.out.println(s);
			String email = request.getParameter("email");
			boolean flag = StudentDao.checkEmail(email);
			if (flag == false) {
				try {
					StudentDao.insertStudent(s);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				request.setAttribute("msg", "account created successfully");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "account already exist");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			Student s = new Student();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			try {
				boolean flag = StudentDao.checkEmail(email);
				if (flag == true) {
					Student s1 = StudentDao.studetnLogin(s);
					System.out.println(s1);
					if (s1 != null) {
						HttpSession session = request.getSession();
						session.setAttribute("data", s1);
						request.getRequestDispatcher("home.jsp").forward(request, response);
					} else {
						request.setAttribute("msg", "password incorrect");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
				} else {
					request.setAttribute("msg", "account doesn't exist");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (action.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Student s = StudentDao.getStudentById(id);
			request.setAttribute("data", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("update")) {
			Student s = new Student();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			StudentDao.updateStudent(s);
			response.sendRedirect("home.jsp");
		}
	}

}
