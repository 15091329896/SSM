package com.test.mybatis.test;

import java.util.Stack;

public class Test22 {

	public static void main(String[] args) {
		/*
		 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
		 * 
		 * 有效字符串需满足：
		 * 
		 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。
		 * 
		 * 注意空字符串可被认为是有效字符串。
		 * 
		 * 示例 1:
		 * 
		 * 输入: "()" 输出: true
		 * 
		 * 示例 2:
		 * 
		 * 输入: "()[]{}" 输出: true
		 * 
		 * 示例 3:
		 * 
		 * 输入: "(]" 输出: false
		 * 
		 * 示例 4:
		 * 
		 * 输入: "([)]" 输出: false
		 * 
		 * 示例 5:
		 * 
		 * 输入: "{[]}" 输出: true
		 * 
		 * 
		 */
		/*
		 * 匹配括号 找到第一个括号 如果是}])其中之一，返回false
		 * 
		 * 
		 * 
		 * 
		 */

		new Test22().panDuan();

	}

	private void panDuan() {
		String string = "{[]}";
//		boolean valid = action(string);
//		boolean valid = action2(string);
		boolean valid = action3(string);
		System.out.println(valid);
	}

	private boolean action3(String s) {
		/*
		 * 括号配对判断
		 * 		通过栈实现
		 * 		遍历字符串中的字符
		 * 			取出当前字符
		 * 			如果为左括号
		 * 				入栈
		 *			否则，判断栈是否为空
		 *				为空：程序结束为false
		 *				栈不为空：
		 *					弹出栈顶的元素，于当前的字符进行判断
		 *						不配对:程序结束，返回false
		 *						否则:配对，继续循环遍历
		 *				
		 * 
		 * */
		
		Stack<Character> stack = new Stack<>();
		boolean continueTip = true;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
				stack.push(c);
				break;
			case '{':
				stack.push(c);
				break;
			case '[':
				stack.push(c);
				break;
			default:
				if(stack.isEmpty()) {
					return false;
				}
				continueTip = false;
				break;
			}
			if(continueTip) {
				continue;
			}
			char topChar = stack.pop();
			if(c == ')' && topChar != '(') {
				return false;
			}
			if(c == '}' && topChar != '{') {
				return false;
			}
			if(c == ']' && topChar != '[') {
				return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}

	private boolean action2(String s) {
		/*
		 * 什么是栈
		 * 		就是集合
		 * 		什么是集合
		 * 		就是讲基本数据组织起来
		 * 		就是讲基本数据构造成为一个整体
		 * 		为什么需要集合
		 * 		当多个基本数据存在关系的时候需要集合
		 * 		当多个基本数据存在关系的时候需要集合
		 * 		当多个基本数据需要同时出现的时候需要集合
		 * 		当多个基本数据同时出现的时候需要结合
		 * 		多个基本数据为什么要同时出现	
		 * 		因为这几个基本数据共同参与构成了一个新的数据
		 * 		为什么需要集合
		 * 		当一个数据需要多个基本数据参与构成的时候需要集合
		 * 		当多个基本数据共同构成一个新的数据的时候需要集合
		 *		什么是集合
		 *		就是将多个基本数据构成新数据的一种方式
		 *		什么是集合
		 *		就是一种基本数据构造新数据的一种方式
		 *		什么是集合
		 *		就是将基本数据构造成新数据的工具
		 *		是构造数据的一种工具
		 *		什么是集合
		 *		是将基本数据组装成为新数据的工具
		 *		什么是集合
		 *		就是数据的组装工具
		 *		什么是数据结构
		 *		就是研究如何组装数据
		 *		什么是数据结构
		 *		就是组装数据的工具
		 *		栈就是将元素存储起来，只能在一端对元素进行操作的集合
		 *		
		 *
		 *
		 * 		
		 * 
		 * 		
		 * */
		/*
		 * 通过栈实现括号的配对
		 * 		将字符串中的第一个括号进行判断
		 * 			左括号
		 * 				压入栈中
		 * 			右括号
		 * 				返回false
		 * 		将字符串中的下一个字符进行判断
		 * 			先从栈顶取出一个元素
		 * 			如果取出的这个元素和当前的元素可以配对
		 * 				继续循环：继续取字符串下一个元素，继续判断
		 * 			否则：程序结束，直接返回false
		 * 
		 * 		直到字符串中的字符遍历完毕
		 * 			如果此时栈为空 返回true
		 * 			否则，返回false	
		 * 
		 * */
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			boolean continueTip = true;
			switch (c) {
				case '(':
					stack.push(c);
					break;
				case '{':
					stack.push(c);
					break;
				case '[':
					stack.push(c);
					break;
				default:
					if(stack.isEmpty()) {
						return false;
					}
					continueTip = false;
					break;
			}
			if(continueTip) {
				continue;
			}
			char topChar = stack.pop();
			if (c == ')' && topChar != '(') {
				return false;
			} 
			if (c == '}' && topChar != '{') {
				return false;
			} 
			if (c == ']' && topChar != '[') {
				return false;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean action(String string) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else {
				if (stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if (c == ')' && topChar != '(')
					return false;
				if (c == ']' && topChar != '[')
					return false;
				if (c == '}' && topChar != '{')
					return false;
			}
		}
		return stack.isEmpty();
	}
	
	
	
	
}
