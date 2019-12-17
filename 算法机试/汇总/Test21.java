package com.test.mybatis.test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.security.util.Length;

public class Test21 {

	public static void main(String[] args) {
		/*
		 * 编写一个函数来查找字符串数组中的最长公共前缀。

			如果不存在公共前缀，返回空字符串 ""。
			示例 1:
			输入: ["flower","flow","flight"]
			输出: "fl"
			示例 2:
			输入: ["dog","racecar","car"]
			输出: ""
			解释: 输入不存在公共前缀。
			说明:
			所有输入只包含小写字母 a-z 。
		 * 
		 * */
		
		/*
		 * 寻找公共前缀
		 * 		将第一个字符串的每一个字符和其余的单词的第一个字符进行比较，全部相同
		 * 		刷新公共前缀的buffer
		 * 		
		 * 		
		 * */
		
		new Test21().find();
	}

	private void find() {
		/*
		 * 依次判断字符
		 * 刷新公共前缀
		 * 		获取第一个字符串的第一个字符放在变量中
		 * 		然后遍历所有的字符串的第一个字符同这个变量相比
		 * 			有一个不相同，所有的遍历停止
		 * 			全部相同：刷新公共前缀
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
