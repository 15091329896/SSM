package com.test.sheJiMoShi.factory;

public class Test {
	public static void main(String[] args) {
		/*
		 * 使用工厂模式实现使用一个类管理众多具体对象的创建
		 * 		创建不同的商品
		 * 		创建商品类实现多众多不同具体商品对象创建的管理
		 * 		在测试类中使用这个商品类根据具体的商品名创建对应的商品对象
		 * 		
		 * */
		
		ProductFactory productFactory = new ProductFactory();
		Product product = productFactory.getProduct("book");
		product.printName();
		product = productFactory.getProduct("pen");
		product.printName();
		product = productFactory.getProduct("bread");
		product.printName();
		product = productFactory.getProduct("shoes");
		product.printName();
	}
}
