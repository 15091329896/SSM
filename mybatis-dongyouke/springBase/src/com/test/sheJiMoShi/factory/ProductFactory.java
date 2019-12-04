package com.test.sheJiMoShi.factory;

public class ProductFactory {
	public Product getProduct(String productName) {
		Product product = null;
		
		if(productName.equals("book")) {
			product = new Book();
		}
		if(productName.equals("pen")) {
			product = new Pen();
		}
		
		if(productName.equals("bread")) {
			product = new Bread();
		}
		
		if(productName.equals("shoes")) {
			product = new Shoes();
		}
		return product;
	}
}
