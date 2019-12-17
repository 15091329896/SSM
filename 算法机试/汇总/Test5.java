package com.test.mybatis.test;

public class Test5<T> {
	private T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public static void main(String[] args) {
		Test5<String> test5 = new Test5<String>();
		String[] arrayString = {"成员1", "成员2", "成员3", "成员4", "成员5"};
		test5.setArray(arrayString);
		for (int i = 0; i < test5.getArray().length; i++) {
			System.out.println(test5.getArray()[i]);
		}
		
		System.exit(0);
	}

}
