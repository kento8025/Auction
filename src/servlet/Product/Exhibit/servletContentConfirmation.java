package servlet.Product.Exhibit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Product;

/**
 * Servlet implementation class servletContentConfirmation
 */
@WebServlet("/ContentConfirmation")

/*内容確認*/

public class servletContentConfirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletContentConfirmation() {
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
	protected void doPost(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("サーブレット");

		String productName = rq.getParameter("productName"); /*商品名*/
		String productImg = rq.getParameter("productImg"); /*商品画像*/
		//String categoryId = rq.getParameter("categoryId"); /*カテゴリId 外部キー参照*/
		int categoryId = 001;/*Integer.parseInt(rq.getParameter("categoryId"));*/
		String productStatus = rq.getParameter("productStatus");/*状態*/
		String description = rq.getParameter("description");/*説明*/
		String postage = rq.getParameter("postage");/*送料負担*/
		String shippingOrigin = rq.getParameter("shippingOrigin");/*発送元*/
		String shipping_method = rq.getParameter("shipping_method");/*配送方法*/
		String getExhibition_period = rq.getParameter("exhibition_period");/*出品期間*/
		int exhibition_period = Integer.parseInt(getExhibition_period);/*出品期間*/

		String getPrice = rq.getParameter("price");
		int price = Integer.parseInt(getPrice);/*価格*/

		System.out.println(productName);
		System.out.println(productImg);
		System.out.println(categoryId);
		System.out.println(productStatus);
		System.out.println(description);
		System.out.println(postage);
		System.out.println(shippingOrigin);
		System.out.println(shipping_method);
		System.out.println(exhibition_period);
		System.out.println(price);


		Product product = new Product(productName, productImg, categoryId, productStatus,
				description, postage, shippingOrigin, shipping_method, price, exhibition_period);
		rq.setAttribute("product", product);
		rq.getRequestDispatcher("/Product/Exhibit/contentConfirmation.jsp").forward(rq, response);

	}

}
