package com.test.mybatis.test;

public class Test14 {
	public static void main(String[] args) {
		/*
		 * ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��

			ʾ�� 1:
			
			����: 123
			���: 321
			
			 ʾ�� 2:
			-2147483648

			����: -123
			���: -321
			
			ʾ�� 3:
			
			����: 120
			���: 21

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
