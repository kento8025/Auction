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

/*�o�i�������*/

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

		String productName = request.getParameter("productName"); /*���i��*/
		String productImg = request.getParameter("productImg");/*���i�摜*/
		String category = request.getParameter("category"); /*�J�e�S��Id �O���L�[�Q��*/
		int categoryId = productDao.categorySearch(category);
		String productStatus = request.getParameter("productStatus");/*���*/
		String description = request.getParameter("description");/*����*/
		String postage = request.getParameter("postage");/*�������S*/
		String shippingOrigin = request.getParameter("shippingOrigin");/*������*/
		String shipping_method = request.getParameter("shipping_method");/*�z�����@*/
		String getExhibition_period = request.getParameter("exhibition_period");/*�o�i����*/
		int exhibition_period = Integer.parseInt(getExhibition_period);/*�o�i����*/
		String getPrice = request.getParameter("price");/*���i*/
		int price = Integer.parseInt(getPrice);

		Product product = new Product(productName, productImg, categoryId, productStatus,
				description, postage, shippingOrigin, shipping_method, price, exhibition_period);

		productDao.register(product, user);

		request.getRequestDispatcher("/Product/Exhibit/ristingCompleted.jsp").forward(request, response);



	}

}
