package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.User;
import entity.userDao;

/**
 * Servlet implementation class servletRegisTration
 */
@WebServlet("/RegisTration")
public class servletRegisTration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//ämîFÇµÇΩèÓïÒÇìoò^Ç∑ÇÈÅB

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletRegisTration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String userName = request.getParameter("userName");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String manOrWoman = request.getParameter("manOrWoman");
		String mail = request.getParameter("mail");
		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");

		User user = new User(userName, year, month, day, manOrWoman, mail, id, passWord);
		userDao dao = new userDao();

		dao.register(user);

		response.sendRedirect("../JSP_Auction/login/registration.jsp");

	}

}
