package product;

import javax.servlet.http.HttpServletResponse;

import dao.Repository;
import dto.Product;

public class ProductService {
	
	public int addProduct(Product product) {
		Repository repos = Repository.getInstance();
		
		boolean result = repos.addProduct(product);
		if(result) {
			return HttpServletResponse.SC_CREATED;
		} else {
			return HttpServletResponse.SC_BAD_REQUEST;
		}
	}
}
