package com.test.mybatis.test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.security.util.Length;

public class Test21 {

	public static void main(String[] args) {
		/*
		 * ��дһ�������������ַ��������е������ǰ׺��

			��������ڹ���ǰ׺�����ؿ��ַ��� ""��
			ʾ�� 1:
			����: ["flower","flow","flight"]
			���: "fl"
			ʾ�� 2:
			����: ["dog","racecar","car"]
			���: ""
			����: ���벻���ڹ���ǰ׺��
			˵��:
			��������ֻ����Сд��ĸ a-z ��
		 * 
		 * */
		
		/*
		 * Ѱ�ҹ���ǰ׺
		 * 		����һ���ַ�����ÿһ���ַ�������ĵ��ʵĵ�һ���ַ����бȽϣ�ȫ����ͬ
		 * 		ˢ�¹���ǰ׺��buffer
		 * 		
		 * 		
		 * */
		
		new Test21().find();
	}

	private void find() {
		/*
		 * �����ж��ַ�
		 * ˢ�¹���ǰ׺
		 * 		��ȡ��һ���ַ����ĵ�һ���ַ����ڱ�����
		 * 		Ȼ��������е��ַ����ĵ�һ���ַ�ͬ����������
		 * 			��һ������ͬ�����еı���ֹͣ
		 * 			ȫ����ͬ��ˢ�¹���ǰ׺
		 * 
		 * 
		 * */
		
		String[] array = {"flower","fl","flight"};
		String reString = action(array);
		System.out.println(reString);
		
		
	}

	private String action(String[] strs) {
		if(strs.length == 0) {
			return "";
		}
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < strs[0].length(); i++) {
			char tmpChar = strs[0].charAt(i);
			if(compareAllString(i, tmpChar, strs)) {
				buffer.append(tmpChar);
			}else {
				break;
			}
		}
		return buffer.toString();
	}

	private boolean compareAllString(int i, char tmpChar, String[] array) {
		boolean res = true;
		for (int j = 0; j < array.length; j++) {
			if( i >= array[j].length() || tmpChar != array[j].charAt(i)) {
				res = false;
			}
		}
		return res;
	}

}
