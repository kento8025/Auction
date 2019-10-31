package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		System.out.print("’Ê‰ß");

		final String ID = "test";
		final String PASSWORD = "0000";

		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");

		System.out.print(id);
		System.out.print(passWord);

		if(ID.equals(id)&&PASSWORD.equals(passWord)) {
			response.sendRedirect("../JSP_Auction/login/loginTest.jsp");
		}else {
			response.sendRedirect("../JSP_Auction/login/loginError.jsp");
		}

	}

}
