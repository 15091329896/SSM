package com.test.mybatis.test;

public class Test14 {
	public static void main(String[] args) {
		/*
		 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

			示例 1:
			
			输入: 123
			输出: 321
			
			 示例 2:
			-2147483648

			输入: -123
			输出: -321
			
			示例 3:
			
			输入: 120
			输出: 21

		 * */
		new Test14().converse();
		
	}

	private void converse() {
		int num = -2147483648;
		int res = action(num);
		System.out.println(res);
		
	}

	private int action(int x) {
		Double double1 = new Double(x);
		int num = (int) Math.abs(double1);
		StringBuffer buffer = new StringBuffer(new Integer(num).toString());
		String string = buffer.toString();
		buffer.reverse();
		string = buffer.toString();
		Double double2 = new Double(string);
		if(double2 > Integer.MAX_VALUE || double2 < Integer.MIN_VALUE) {
			return 0;
		}
		Integer integer = new Integer(string);
		if(x < 0){
			integer = -integer;
		}
		return integer;
	}
}
