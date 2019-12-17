package com.test.mybatis.test;

public class Test2 {
	private Object b;
	
	
	
	public Object getB() {
		return b;
	}



	public void setB(Object b) {
		this.b = b;
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.setB(new Boolean(true));
		System.out.println(test2.getB());
		test2.setB(new Float(12.3));
		Float float1 = (Float) test2.getB();
		System.out.println(float1);
		
		
		test2.setB(new Float(12.3));
		Integer integer = (Integer) (test2.getB());
		System.out.println(integer);
		
		
	}
}
