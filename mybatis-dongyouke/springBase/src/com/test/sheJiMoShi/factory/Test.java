package com.test.sheJiMoShi.factory;

public class Test {
	public static void main(String[] args) {
		/*
		 * ʹ�ù���ģʽʵ��ʹ��һ��������ڶ�������Ĵ���
		 * 		������ͬ����Ʒ
		 * 		������Ʒ��ʵ�ֶ��ڶ಻ͬ������Ʒ���󴴽��Ĺ���
		 * 		�ڲ�������ʹ�������Ʒ����ݾ������Ʒ��������Ӧ����Ʒ����
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
