package com.test.mybatis.test;

import com.sun.org.apache.xml.internal.serializer.ToHTMLSAXHandler;

public class Test13 {
	public static void main(String[] args) {
		/*
		 *	将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

				比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
				
				L   C   I   R
				E T O E S I I G
				E   D   H   N
				
				之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
				
				请你实现这个将字符串进行指定行数变换的函数：
				
				string convert(string s, int numRows);
				
				示例 1:
				
				输入: s = "LEETCODEISHIRING", numRows = 3
				输出: "LCIRETOESIIGEDHN"
				
				示例 2:
				
				输入: s = "LEETCODEISHIRING", numRows = 4
				数组长度row + (row - 2)
				输出: "LDREOEIIECIHNTSG"
				解释:
				
				L     D     R
				E   O E   I I
				E C   I H   N
				T     S     G
				
		 *
		 *
		 * */
		
		/*
		 * 根据行数计算数组的长度
		 * 根据字符串长度和数组长度计算需要多少个数组
		 * 创建一个集合
		 * 第一行就是所有数组的
		 * 		第0号元素 + 下一个数组的第0号元素
		 * 第二行就是所有数组的
		 * 		第1号元素 + 当前数组的length - 1号元素 + 下一个数组的第1号元素 + 当前数组的length - 1号元素
		 * 第三行就是
		 * 		第2号元素 + 当前数组的length - 2号元素 + 下一个数组的第2号元素 + 当前数组的length - 2号元素
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
		 * 根据输入的字符串的长度创建一个二维数组
		 * 		数据的行  
		 * 			用户输入
		 * 		列	计算
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
		 * 创建集合
		 * 		填充数组
		 * 
		 * */
		
		
		return null;
	}
}
