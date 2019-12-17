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

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("�T�[�u���b�g");

		//��΃p�X�̊l��
		String ABSOLUTE_PATH = getServletContext().getRealPath("WEB-INF/productImg");

		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		System.out.println(user.getId());

		//�t�H���_�[�����邩�ǂ����m�F�B
		//�Ȃ���΍쐬����B

		File folder = new File(ABSOLUTE_PATH + "/" + user.getId());

		if (folder.exists()) {

			System.out.println("�t�H���_������܂���");

		} else {

			System.out.println("�t�H���_�����݂��܂���");

			// ��΃p�X�ō쐬
			File file1 = new File(ABSOLUTE_PATH + "/" + user.getId());

			if (file1.mkdir()) {
				System.out.println("�t�H���_�̍쐬�ɐ������܂���");
			} else {
				System.out.println("�t�H���_�̍쐬�Ɏ��s���܂���");
			}
		}

		Part part = request.getPart("file");
		String name = this.getFileName(part);
		part.write(ABSOLUTE_PATH + "/" + user.getId() + "/" + name);

		ProductDao productDao = new ProductDao();

		String productName = request.getParameter("productName"); /*���i��*/
		String productImg = ABSOLUTE_PATH + "/" + user.getId() + "/" + name; /*���i�摜*/
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
