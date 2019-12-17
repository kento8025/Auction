package servlet.Product.Exhibit;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dto.Product;
import dto.User;
import entity.ProductDao;

/**
 * Servlet implementation class servletContentConfirmation
 */
@WebServlet("/ContentConfirmation")
@MultipartConfig(location = "", maxFileSize = 1048576)

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

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("サーブレット");

		//絶対パスの獲得
		String ABSOLUTE_PATH = getServletContext().getRealPath("WEB-INF/productImg");

		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		System.out.println(user.getId());

		//フォルダーがあるかどうか確認。
		//なければ作成する。

		File folder = new File(ABSOLUTE_PATH + "/" + user.getId());

		if (folder.exists()) {

			System.out.println("フォルダがありました");

		} else {

			System.out.println("フォルダが存在しません");

			// 絶対パスで作成
			File file1 = new File(ABSOLUTE_PATH + "/" + user.getId());

			if (file1.mkdir()) {
				System.out.println("フォルダの作成に成功しました");
			} else {
				System.out.println("フォルダの作成に失敗しました");
			}
		}

		Part part = request.getPart("file");
		String name = this.getFileName(part);
		part.write(ABSOLUTE_PATH + "/" + user.getId() + "/" + name);

		ProductDao productDao = new ProductDao();

		String productName = request.getParameter("productName"); /*商品名*/
		String productImg = ABSOLUTE_PATH + "/" + user.getId() + "/" + name; /*商品画像*/
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

		product.setCategoryName(category);
		request.setAttribute("product", product);

		request.getRequestDispatcher("/Product/Exhibit/contentConfirmation.jsp").forward(request, response);

	}

	private String getFileName(Part part) {
		String name = null;
		for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
			if (dispotion.trim().startsWith("filename")) {
				name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
				name = name.substring(name.lastIndexOf("\\") + 1);
				break;
			}
		}
		return name;
	}

}
