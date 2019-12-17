package servlet.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Product;
import entity.SearchDao;
import tool.DbSetUp;

/**
 * Servlet implementation class servletSearchResults
 */
@WebServlet("/SearchResults")
public class servletSearchResults extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletSearchResults() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DbSetUp dbSetUp = new DbSetUp();

		List<Product> productList = new ArrayList<Product>();
		SearchDao searchDao = new SearchDao();
		String search = request.getParameter("search");
		//String search = "–{";

		productList = searchDao.productSearch(search);

		request.setAttribute("productList", productList);

		request.getRequestDispatcher("/searchResults/searchResults.jsp").forward(request, response);

		}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
