package com.test.mybatis.test;

public class Test16 {
	public static void main(String[] args) {
		/*
		 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������

			ʾ�� 1:
			
			����: 121
			���: true
			
			ʾ�� 2:
			
			����: -121
			���: false
			����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
			
			ʾ�� 3:
			
			����: 10
			���: false
			����: ���������, Ϊ 01 �����������һ����������
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
