package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;
import entity.UserDao;

/**
 * Servlet implementation class servletLoginCheck
 */
@WebServlet("/LoginCheck")
public class servletLoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletLoginCheck() {
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
		// TODO Auto-generated method stub
		doGet(request, response);

		System.out.println("ログインチェック");

		HttpSession session = request.getSession(true);

		UserDao userDao = new UserDao();

		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");
		String logout = request.getParameter("logout");

		request.setAttribute("id", id);
		request.setAttribute("passWord", passWord);

		User user = new User(id,passWord);
		request.setAttribute("user", user);


		if(logout == null) {
			logout="";
		}


		if(logout.equals("out")){
				session.removeAttribute("user");
				request.getRequestDispatcher("/home/homePage.jsp").forward(request, response);

		}

		if(userDao.loginCheck(id, passWord)) {
			session.setAttribute("user", userDao.getUser());
			request.getRequestDispatcher("/home/homePage.jsp").forward(request, response);
		}else {
			response.sendRedirect("/JSP_Auction/login/loginError.jsp");
		}





	}

}
