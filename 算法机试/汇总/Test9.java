package com.test.mybatis.test;

public class Test9 {
	public static void main(String[] args) {
		/*
		 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
		 * 
		 * ʾ�� 1: ����: "abcabcbb" ���: 3 ����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3�� ʾ�� 2:
		 * ����: "bbbbb" ���: 1 ����: ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1�� ʾ�� 3: ����: "pwwkew"
		 * ���: 3 ����: ��Ϊ���ظ��ַ�����Ӵ��� "wke"�������䳤��Ϊ 3�� ��ע�⣬��Ĵ𰸱����� �Ӵ� �ĳ��ȣ�"pwke"
		 * ��һ�������У������Ӵ���
		 */
		/*
		 * ����ʼ���ȼ�Ϊ1 ���Ӵ��ĳ�ʼֵ��Ϊ��һ���ַ� ���ڶ����ַ��͵�һ���ַ����бȽ� ��ͬ��ˢ���Ӵ�Ϊ��һ���͵ڶ����ַ���ɵ��Ӵ�
		 * ��ͬ��ˢ���Ӵ�Ϊ�ڶ����ַ� �����е��ַ�����ͬ���Ĳ���
		 * 
		 */

//		new Test9().findLongestSubString();
		new Test9().findLongestSubString2();
		
		
	}

	private void findLongestSubString2() {
		/*
		 * �ж���һ���ַ����Ƿ����Ӵ����ظ�
		 * 	ˢ���Ӵ�
		 * */
		String string = "au";
		int res = action2(string);
		System.out.println(res);
	}

	private int action2(String s) {
		
		StringBuffer buffer = new StringBuffer();
		int res = buffer.length();
		for (int i = 0; i < s.length(); i++) {
			shuXinBuffer(s.charAt(i), buffer);
			res = ((buffer.length() > res) ? buffer.length() : res);
		}
		return res;
	}

	private void shuXinBuffer(char charAt, StringBuffer buffer) {
		int indexOf = buffer.toString().indexOf(charAt);
		buffer.append(charAt);
		if(indexOf == -1) {
			return;
		}
		buffer.delete(0, indexOf + 1);
	}

	private void findLongestSubString() {
		/*
		 * �ж���һ���ַ��Ƿ����Ӵ��� ����ˢ���Ӵ�
		 * 
		 * 
		 * "abcabcbb"

		 * 
		 */
		String string = "";
		
		int longest = action(string);
		System.out.println(longest);
	}

	private int action(String s) {
		StringBuffer resBuffer = new StringBuffer();
		int longest = resBuffer.length();
		for (int i = 0; i < s.length(); i++) {
			flushBuff(s.charAt(i), resBuffer);
			longest = ((longest < resBuffer.length()) ? resBuffer.length() : longest);
		}
		return longest;
	}

	private void flushBuff(char nextChar, StringBuffer resBuffer) {
		int indexOf = resBuffer.toString().indexOf(nextChar);
		resBuffer.append(nextChar);
		if(indexOf == -1) {
			return;
		} 
		resBuffer.delete(0, indexOf + 1);
	}
}
