package product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dto.Product;

@WebServlet("/productMng")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MultipartRequest multi = new MultipartRequest(request, "C:\\Users\\User\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\mall\\images", 5 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());
		
		// 파라미터 전달받음
		String productId = multi.getParameter("productId");
		String name = multi.getParameter("name");
		String unitPrice = multi.getParameter("unitPrice");
		String description = multi.getParameter("description");
		String manufacturer = multi.getParameter("manufacturer");
		String category = multi.getParameter("category");
		String unitInStock = multi.getParameter("unitsInStock");
		String condition = multi.getParameter("condition");
		String fileName = multi.getFilesystemName("productImage");
		
		// 입력 값 검증
		// ...
		// 입력 값 검증
		
		int price = Integer.parseInt(unitPrice);
		int stock = Integer.parseInt(unitInStock);
		
		// 받은 상품 파라미터 정보 저장
		Product newProduct = new Product();
		newProduct.setProductId(productId);
		newProduct.setPname(name);
		newProduct.setUnitPrice(price);
		newProduct.setDescription(description);
		newProduct.setManufacturer(manufacturer);
		newProduct.setCategory(category);
		newProduct.setUnitsInStock(stock);
		newProduct.setCondition(condition);
		newProduct.setFilename(fileName);
		
		// 상품 정보 저장
		ProductService service = new ProductService();
		
		int statusCode = service.addProduct(newProduct);
		
		// 적절한 페이지로 리다이렉트
		if(statusCode == HttpServletResponse.SC_CREATED) {
			// 성공적으로 상품을 추가했다면
			response.sendRedirect("frontController.jsp?active=product_list");
		} else {
			// 상품을 추가하지 못했다면
			// 리다이렉트할  페이지 미정
		}
	}
}
