package servlet.login;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletRegistrationConfirmation
 */
@WebServlet("/login/RegistrationConfirmation")
public class servletRegistrationConfirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletRegistrationConfirmation() {
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
		//response.sendRedirect("../JSP_Auction/login/registrationConfirmation.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Servlet通過");

		// 画面遷移するJSPを指定し、画面遷移を実行する
		//response.sendRedirect("../JSP_Auction/login/JSTLregistrationConfirmation.jsp");

		//User user = new User();

		String name = request.getParameter("name");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String manOrWoman = request.getParameter("manOrWoman");
		String mail = request.getParameter("mail");
		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");

		boolean passWordCheck = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])[0-9a-z\\-]{8,16}$", passWord);
		boolean mailCheck = Pattern.matches(".*@.*", mail);
		boolean birthday = CheckDate.checkDate(year + "/" + month + "/" + day);

		System.out.println(birthday);
		System.out.println(year + "/" + month + "/" + day);

		request.setAttribute("name", name);
		request.setAttribute("year", year);
		request.setAttribute("month", month);
		request.setAttribute("day", day);
		request.setAttribute("passWord", passWord);
		request.setAttribute("manOrWoman", manOrWoman);
		request.setAttribute("mail", mail);
		request.setAttribute("id", id);
		request.setAttribute("passWord", passWord);

		if (!(passWordCheck) || (!(mailCheck) || (!(birthday)))) {

			if (!(passWordCheck)) {
				request.setAttribute("passWordError", "パスワードは半角英小文字と数字を組み合わせた8文字以上ものでおねがいします");
			}

			if (!(mailCheck)) {
				request.setAttribute("mailError", "メールアドレスではありません");
			}

			if (!(birthday)) {
				request.setAttribute("birthdayError", "生年月日が不正です");
			}

			request.getRequestDispatcher("/login/signUp.jsp").forward(request, response);

		} else {

			request.getRequestDispatcher("/login/JSTLregistrationConfirmation.jsp").forward(request, response);

		}
	}

}
