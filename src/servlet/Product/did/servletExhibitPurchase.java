package servlet.Product.did;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.PurchaseDisplay;
import entity.SearchDao;

/**
 * Servlet implementation class servletExhibitPurchase
 */
@WebServlet("/ExhibitPurchase")
public class servletExhibitPurchase extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletExhibitPurchase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("サーブレット");

		String productId =  request.getParameter("productId");

		System.out.println(productId);

		SearchDao searchDao = new SearchDao();
		PurchaseDisplay purchaseDisplay ;
		purchaseDisplay = searchDao.productInformation(productId);
		request.setAttribute("purchaseDisplay",purchaseDisplay);

		request.getRequestDispatcher("/Product/bid/exhibitPurchase.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
