package com.test.mybatis.test;

import com.sun.org.apache.xml.internal.serializer.ToHTMLSAXHandler;

public class Test13 {
	public static void main(String[] args) {
		/*
		 *	��һ�������ַ������ݸ������������Դ������¡������ҽ��� Z �������С�

				���������ַ���Ϊ "LEETCODEISHIRING" ����Ϊ 3 ʱ���������£�
				
				L   C   I   R
				E T O E S I I G
				E   D   H   N
				
				֮����������Ҫ�����������ж�ȡ��������һ���µ��ַ��������磺"LCIRETOESIIGEDHN"��
				
				����ʵ��������ַ�������ָ�������任�ĺ�����
				
				string convert(string s, int numRows);
				
				ʾ�� 1:
				
				����: s = "LEETCODEISHIRING", numRows = 3
				���: "LCIRETOESIIGEDHN"
				
				ʾ�� 2:
				
				����: s = "LEETCODEISHIRING", numRows = 4
				���鳤��row + (row - 2)
				���: "LDREOEIIECIHNTSG"
				����:
				
				L     D     R
				E   O E   I I
				E C   I H   N
				T     S     G
				
		 *
		 *
		 * */
		
		/*
		 * ����������������ĳ���
		 * �����ַ������Ⱥ����鳤�ȼ�����Ҫ���ٸ�����
		 * ����һ������
		 * ��һ�о������������
		 * 		��0��Ԫ�� + ��һ������ĵ�0��Ԫ��
		 * �ڶ��о������������
		 * 		��1��Ԫ�� + ��ǰ�����length - 1��Ԫ�� + ��һ������ĵ�1��Ԫ�� + ��ǰ�����length - 1��Ԫ��
		 * �����о���
		 * 		��2��Ԫ�� + ��ǰ�����length - 2��Ԫ�� + ��һ������ĵ�2��Ԫ�� + ��ǰ�����length - 2��Ԫ��
		 * 
		 * */
		
		StringBuffer buffer = new StringBuffer();
		buffer.setLength(5);
//		buffer.setCharAt(52, 'a');
		
		
//		new Test13().converse();
		System.out.println("LEETCODEISHIRING".length() % 4);
		
	}

	private void converse() {
		String string = "LEETCODEISHIRING";
		System.out.println(string);
		int numRows = 3;
		string = action(string, numRows);
		System.out.println(string);
	}

	private String action(String string, int numRows) {
		/*
		 * ����������ַ����ĳ��ȴ���һ����ά����
		 * 		���ݵ���  
		 * 			�û�����
		 * 		��	����
		 * 			
		 * 		
		 * 
		 * */
		int arrayLength = numRows + (numRows - 2);
		int arrayNum = (int) Math.ceil(1.0 * string.length() / (string.length() % arrayLength));
		return getRes(arrayLength, arrayNum, string);
	}

	private String getRes(int arrayLength, int arrayNum, String string) {
		/*
		 * ��������
		 * 		�������
		 * 
		 * */
		
		
		return null;
	}
}
