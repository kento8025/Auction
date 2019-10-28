package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletRegistrationConfirmation
 */
@WebServlet("/RegistrationConfirmation")
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
		response.sendRedirect("../JSP_Auction/login/registrationConfirmation.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// âÊñ ëJà⁄Ç∑ÇÈJSPÇéwíËÇµÅAâÊñ ëJà⁄Çé¿çsÇ∑ÇÈ
		response.sendRedirect("../JSP_Auction/login/registrationConfirmation.jsp");
		//request.getRequestDispatcher("http://localhost:8080/JSP_Auction/login/registrationConfirmation.jsp").forward(request, response);

	}

}
