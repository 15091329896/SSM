package com.test.mybatis.test;

import java.util.Stack;

public class Test22 {

	public static void main(String[] args) {
		/*
		 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��
		 * 
		 * ��Ч�ַ��������㣺
		 * 
		 * �����ű�������ͬ���͵������űպϡ� �����ű�������ȷ��˳��պϡ�
		 * 
		 * ע����ַ����ɱ���Ϊ����Ч�ַ�����
		 * 
		 * ʾ�� 1:
		 * 
		 * ����: "()" ���: true
		 * 
		 * ʾ�� 2:
		 * 
		 * ����: "()[]{}" ���: true
		 * 
		 * ʾ�� 3:
		 * 
		 * ����: "(]" ���: false
		 * 
		 * ʾ�� 4:
		 * 
		 * ����: "([)]" ���: false
		 * 
		 * ʾ�� 5:
		 * 
		 * ����: "{[]}" ���: true
		 * 
		 * 
		 */
		/*
		 * ƥ������ �ҵ���һ������ �����}])����֮һ������false
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
		 * ��������ж�
		 * 		ͨ��ջʵ��
		 * 		�����ַ����е��ַ�
		 * 			ȡ����ǰ�ַ�
		 * 			���Ϊ������
		 * 				��ջ
		 *			�����ж�ջ�Ƿ�Ϊ��
		 *				Ϊ�գ��������Ϊfalse
		 *				ջ��Ϊ�գ�
		 *					����ջ����Ԫ�أ��ڵ�ǰ���ַ������ж�
		 *						�����:�������������false
		 *						����:��ԣ�����ѭ������
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
		 * ʲô��ջ
		 * 		���Ǽ���
		 * 		ʲô�Ǽ���
		 * 		���ǽ�����������֯����
		 * 		���ǽ��������ݹ����Ϊһ������
		 * 		Ϊʲô��Ҫ����
		 * 		������������ݴ��ڹ�ϵ��ʱ����Ҫ����
		 * 		������������ݴ��ڹ�ϵ��ʱ����Ҫ����
		 * 		���������������Ҫͬʱ���ֵ�ʱ����Ҫ����
		 * 		�������������ͬʱ���ֵ�ʱ����Ҫ���
		 * 		�����������ΪʲôҪͬʱ����	
		 * 		��Ϊ�⼸���������ݹ�ͬ���빹����һ���µ�����
		 * 		Ϊʲô��Ҫ����
		 * 		��һ��������Ҫ����������ݲ��빹�ɵ�ʱ����Ҫ����
		 * 		������������ݹ�ͬ����һ���µ����ݵ�ʱ����Ҫ����
		 *		ʲô�Ǽ���
		 *		���ǽ�����������ݹ��������ݵ�һ�ַ�ʽ
		 *		ʲô�Ǽ���
		 *		����һ�ֻ������ݹ��������ݵ�һ�ַ�ʽ
		 *		ʲô�Ǽ���
		 *		���ǽ��������ݹ���������ݵĹ���
		 *		�ǹ������ݵ�һ�ֹ���
		 *		ʲô�Ǽ���
		 *		�ǽ�����������װ��Ϊ�����ݵĹ���
		 *		ʲô�Ǽ���
		 *		�������ݵ���װ����
		 *		ʲô�����ݽṹ
		 *		�����о������װ����
		 *		ʲô�����ݽṹ
		 *		������װ���ݵĹ���
		 *		ջ���ǽ�Ԫ�ش洢������ֻ����һ�˶�Ԫ�ؽ��в����ļ���
		 *		
		 *
		 *
		 * 		
		 * 
		 * 		
		 * */
		/*
		 * ͨ��ջʵ�����ŵ����
		 * 		���ַ����еĵ�һ�����Ž����ж�
		 * 			������
		 * 				ѹ��ջ��
		 * 			������
		 * 				����false
		 * 		���ַ����е���һ���ַ������ж�
		 * 			�ȴ�ջ��ȡ��һ��Ԫ��
		 * 			���ȡ�������Ԫ�غ͵�ǰ��Ԫ�ؿ������
		 * 				����ѭ��������ȡ�ַ�����һ��Ԫ�أ������ж�
		 * 			���򣺳��������ֱ�ӷ���false
		 * 
		 * 		ֱ���ַ����е��ַ��������
		 * 			�����ʱջΪ�� ����true
		 * 			���򣬷���false	
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
