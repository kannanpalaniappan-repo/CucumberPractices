package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private Integer price;
	
	public Product(String productName, Integer price){
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	public List<String> getProductList(){
		List<String> productList = new ArrayList<>();
		
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple iPhone 12");
		productList.add("IPhone 16 Pro");
		
		return productList;
		
	}
}
