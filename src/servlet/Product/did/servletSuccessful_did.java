package servlet.Product.did;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.TradeDao;

/**
 * Servlet implementation class servletSuccessful_did
 */
@WebServlet("/Successful_did")
public class servletSuccessful_did extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletSuccessful_did() {
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

		System.out.println("落札サーブレット");

		String getUserNo = request.getParameter("userNo");
		String getProduct = request.getParameter("productId");
		String getPrice = request.getParameter("contractPrice");


		System.out.println(getUserNo);
		System.out.println(getPrice);
		System.out.println(getProduct);


		int userNo = Integer.parseInt(getUserNo);
		int productId = Integer.parseInt(getProduct);
		int price = Integer.parseInt(getPrice);

		TradeDao tradedao = new TradeDao();
		tradedao.register(productId, userNo, price);

		request.getRequestDispatcher("/Product/bid/Successful_did.jsp").forward(request, response);

	}

}
