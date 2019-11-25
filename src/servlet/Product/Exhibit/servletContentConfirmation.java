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

/*���e�m�F*/

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

		System.out.println("�T�[�u���b�g");

		String productName = rq.getParameter("productName"); /*���i��*/
		String productImg = rq.getParameter("productImg"); /*���i�摜*/
		//String categoryId = rq.getParameter("categoryId"); /*�J�e�S��Id �O���L�[�Q��*/
		int categoryId = 001;/*Integer.parseInt(rq.getParameter("categoryId"));*/
		String productStatus = rq.getParameter("productStatus");/*���*/
		String description = rq.getParameter("description");/*����*/
		String postage = rq.getParameter("postage");/*�������S*/
		String shippingOrigin = rq.getParameter("shippingOrigin");/*������*/
		String shipping_method = rq.getParameter("shipping_method");/*�z�����@*/
		String getExhibition_period = rq.getParameter("exhibition_period");/*�o�i����*/
		int exhibition_period = Integer.parseInt(getExhibition_period);/*�o�i����*/

		String getPrice = rq.getParameter("price");
		int price = Integer.parseInt(getPrice);/*���i*/

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
