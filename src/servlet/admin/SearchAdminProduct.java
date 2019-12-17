package servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.AdminDao;

/**
 * Servlet implementation class ServletAdmin
 */
@WebServlet("/searchAdminProduct")
public class SearchAdminProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAdminProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubr
		request.getRequestDispatcher("/admin/admin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action =  request.getParameter("action");


		String getProductId =  request.getParameter("productId");
		int productId = Integer.parseInt(getProductId);


		AdminDao adminDao = new AdminDao();

		switch (action) {

		case "delete":
			adminDao.delete(productId);
			request.setAttribute("result", "�폜���������܂���  �폜�������iID "+ productId);
		break;

		case "hidden":
			adminDao.hidden(productId);
			request.setAttribute("result", "��\���ɂ��܂���  ��\���ɂ������iID "+ productId);
		break;

		case "hiddenCancel":
			adminDao.hiddenCancel(productId);
			request.setAttribute("result", "��\���ɂ����o�i���ēx�\��������悤�ɂ��܂���  ��\���ɂ������iID "+ productId);

		break;

		}

		request.getRequestDispatcher("/searchResults/searchResults.jsp").forward(request, response);

	}

}
