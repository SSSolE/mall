package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Product;

// 싱글턴 객체 디자인패턴
// 객체를 오직 한번만 만들 수 있게 코드 구조를 짜는 방법
// 이 프로젝트가 동작하는 동안 싱글턴 객체 디자인패턴이 적용된 클래스는
// 딱 한번 객체를 생성하고 이 객체가 필요한 곳에서는 생성된 객체를 가져다가 사용하는
// 이 프로젝트 안에서 하나의 객체를 공유해서 사용하는 방법

public class Repository {
	private List<Product> listOfProducts;
	
	// 싱글톤 디자인 패턴 적용
	private static Repository obj;
	
	public static Repository getInstance() {
		if(obj == null) obj = new Repository();
		
		return obj;
	}
	
	private Repository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.jpg");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processor");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		phone.setFilename("P1235.jpg");
		
		Product tablet = new Product("P1236", "Galaxy Tab 5", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(10000);
		tablet.setCondition("Old");
		phone.setFilename("P1236.jpg");
		
		listOfProducts = new ArrayList<>();
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String prdouctId) {
		Product Product = null;
		
		
		for(Product nthProduct : listOfProducts) {
			String nthProductId = nthProduct.getProductId();
			
			if(nthProductId.equals(prdouctId)) {
				Product = nthProduct;
				break;
			}
		}
		return Product;
	}
	
	public boolean addProduct(Product product) {
		listOfProducts.add(product);
		
		return true;
	}
}
