package servlet.Product.Exhibit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Product;
import dto.User;
import entity.ProductDao;

/**
 * Servlet implementation class servletRistingCompleted
 */
@WebServlet("/RistingCompleted")

/*出品完了画面*/

public class servletRistingCompleted extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletRistingCompleted() {
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

		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");

		ProductDao productDao = new ProductDao();

		String productName = request.getParameter("productName"); /*商品名*/
		String productImg = request.getParameter("productImg");/*商品画像*/
		String category = request.getParameter("category"); /*カテゴリId 外部キー参照*/
		int categoryId = productDao.categorySearch(category);
		String productStatus = request.getParameter("productStatus");/*状態*/
		String description = request.getParameter("description");/*説明*/
		String postage = request.getParameter("postage");/*送料負担*/
		String shippingOrigin = request.getParameter("shippingOrigin");/*発送元*/
		String shipping_method = request.getParameter("shipping_method");/*配送方法*/
		String getExhibition_period = request.getParameter("exhibition_period");/*出品期間*/
		int exhibition_period = Integer.parseInt(getExhibition_period);/*出品期間*/
		String getPrice = request.getParameter("price");/*価格*/
		int price = Integer.parseInt(getPrice);

		Product product = new Product(productName, productImg, categoryId, productStatus,
				description, postage, shippingOrigin, shipping_method, price, exhibition_period);

		productDao.register(product, user);

		request.getRequestDispatcher("/Product/Exhibit/ristingCompleted.jsp").forward(request, response);



	}

}
