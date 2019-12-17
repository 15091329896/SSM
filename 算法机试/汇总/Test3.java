package com.test.mybatis.test;

public class Test3<T> {
	private T object;

	
	
	public T getObject() {
		return object;
	}



	public void setObject(T object) {
		this.object = object;
	}



	public static void main(String[] args) {
		Test3<Boolean> test31 = new Test3<Boolean>();
		Test3<Float> test32 = new Test3<Float>();
		test31.setObject(true);
		test32.setObject(12.3f);
		Boolean boolean1 = test31.getObject();
		Float float1 = test32.getObject();
		System.out.println(boolean1);
		System.out.println(float1);
		
	}
	
	
	
}
