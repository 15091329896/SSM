package com.test.mybatis.test;

public class Test16 {
	public static void main(String[] args) {
		/*
		 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

			示例 1:
			
			输入: 121
			输出: true
			
			示例 2:
			
			输入: -121
			输出: false
			解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
			
			示例 3:
			
			输入: 10
			输出: false
			解释: 从右向左读, 为 01 。因此它不是一个回文数。
		 * 
		 * */
		
		new Test16().panDuan();
		
		System.exit(0);
	}

	private void panDuan() {
		/*
		 *  
		 * 
		 * */
		int num = 123;
		boolean b = action(num);
		System.out.println(b);
	}

	private boolean action(int x) {
		StringBuffer buffer = new StringBuffer(new Integer(x).toString());
		StringBuffer buffer2 = new StringBuffer(new Integer(x).toString());
		buffer2.reverse();
		
		String string = buffer.toString();
		String string2 = buffer2.toString();
		return string.equals(string2);
	}
}
