package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;
import entity.userDao;

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

		System.out.print("ログインチェック");

		HttpSession session = request.getSession(true);

		userDao dao = new userDao();

		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");

		request.setAttribute("id", id);
		request.setAttribute("passWord", passWord);

		User user = new User(id,passWord);
		request.setAttribute("user", user);
		session.setAttribute("user", user);

		if(id.isEmpty()){
			session.removeAttribute("user");
		}

		if(dao.loginCheck(id, passWord)) {
			//response.sendRedirect("/home/homePage.jsp");
			request.getRequestDispatcher("/home/homePage.jsp").forward(request, response);
		}else {
			response.sendRedirect("/JSP_Auction/login/loginError.jsp");
		}





	}

}
