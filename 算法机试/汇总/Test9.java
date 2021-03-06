package com.test.mybatis.test;

public class Test9 {
	public static void main(String[] args) {
		/*
		 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
		 * 
		 * 示例 1: 输入: "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。 示例 2:
		 * 输入: "bbbbb" 输出: 1 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。 示例 3: 输入: "pwwkew"
		 * 输出: 3 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。 请注意，你的答案必须是 子串 的长度，"pwke"
		 * 是一个子序列，不是子串。
		 */
		/*
		 * 将初始长度记为1 将子串的初始值记为第一个字符 将第二个字符和第一个字符进行比较 不同；刷新子串为第一个和第二个字符组成的子串
		 * 相同：刷新子串为第二个字符 对所有的字符进行同样的操作
		 * 
		 */

//		new Test9().findLongestSubString();
		new Test9().findLongestSubString2();
		
		
	}

	private void findLongestSubString2() {
		/*
		 * 判断下一个字符串是否在子串中重复
		 * 	刷新子串
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
		 * 判断下一个字符是否在子串中 不断刷新子串
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
