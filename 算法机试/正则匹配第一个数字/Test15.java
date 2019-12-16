package com.test.mybatis.test;


public class Test15 {
	public static void main(String[] args) {
		
		/*
		 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。

			首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
			
			当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的     连续数字    组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
			
			该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
			
			注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
			
			在任何情况下，若函数不能进行有效的转换时，请返回 0。
			
			说明：
			
			假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
			
			示例 1:
			
			输入: "42"
			输出: 42
			
			示例 2:
			
			输入: "   -42"
			输出: -42
			解释: 第一个非空白字符为 '-', 它是一个负号。
			     我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
			
			示例 3:
			
			输入: "4193 with words"
			输出: 4193
			解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
			
			示例 4:
			
			输入: "words and 987"
			输出: 0
			解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
			     因此无法执行有效的转换。
			
			示例 5:
			
			输入: "-91283472332"
			输出: -2147483648
			解释: 数字 "-91283472332" 超过 32 位有符号整数范围。 
			     因此返回 INT_MIN (−231) 。
			
		 * 
		 * */
		
		new Test15().converse();
		
//		System.out.println("9w87".matches("^[+-]?[0-9]+.*"));
		
		System.exit(0);
	}

	private void converse() {
		/*
		 * 判断第一个非空字符
		 * 		正负号+数字或者数字
		 * 			去空：
		 * 			"^[+-]?[0-9]+"
		 * 			截取所有的数字
		 * 			判断然后追加
		 * 			进行转换
		 * 		否则
		 * 			返回0
		 * 
		 * */
		String string = "4193 with words";
		int res = action(string);
		System.out.println(res);
		
	}

	private int action(String str) {
		/*
		 *  
		 * 
		 * 
		 * */
		str = str.trim();
		if(!str.matches("^[+-]?[0-9]+.*")) {
			return 0;
		}
		StringBuffer buffer = new StringBuffer();
		int startIndex = dealFirstChar(str, buffer);
		return deal(str, buffer, startIndex);
	}

	private int deal(String string, StringBuffer buffer, int startIndex) {
		for (int i = startIndex; i < string.length(); i++) {
			if(new Character(string.charAt(i)).toString().matches("^[0-9]{1}")) {
				buffer.append(string.charAt(i));
			} else {
				break;
			}
		}
		String string2 = buffer.toString();
		System.out.println(string2);
		Double double1 = new Double(string2);
		System.out.println(double1);
		if(double1 > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if(double1 < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return new Integer(string2);
	}

	private int dealFirstChar(String string, StringBuffer buffer) {
		int startIndex = 0;
		if(new Character(string.charAt(0)).toString().matches("^[-+]{1}")){
			if(new Character(string.charAt(0)).toString().matches("^[-]{1}")) {
				buffer.append(string.charAt(0));
			}
			startIndex = 1;
		} else {
			startIndex = 0;
		}
		return startIndex;
	}
}
