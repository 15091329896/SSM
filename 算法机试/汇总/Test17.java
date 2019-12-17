package com.test.mybatis.test;

public class Test17 {
	public static void main(String[] args) {
		/*
		 * ����һ���ַ��� s ��һ���ַ����� p��������ʵ��һ��֧�� '.' �� '*' ��������ʽƥ�䡣
		 * 
		 * '.' ƥ�����ⵥ���ַ� '*' ƥ���������ǰ�����һ��Ԫ��
		 * 
		 * ��νƥ�䣬��Ҫ���� ���� �ַ��� s�ģ������ǲ����ַ�����
		 * 
		 * ˵��:
		 * 
		 * s ����Ϊ�գ���ֻ������ a-z ��Сд��ĸ�� p ����Ϊ�գ���ֻ������ a-z ��Сд��ĸ���Լ��ַ� . �� *��
		 * 
		 * ʾ�� 1:
		 * 
		 * ����: s = "aa" p = "a" ���: false ����: "a" �޷�ƥ�� "aa" �����ַ�����
		 * 
		 * ʾ�� 2:
		 * 
		 * ����: s = "aa" p = "a*" ���: true ����: ��Ϊ '*' �������ƥ���������ǰ�����һ��Ԫ��,
		 * ������ǰ���Ԫ�ؾ��� 'a'����ˣ��ַ��� "aa" �ɱ���Ϊ 'a' �ظ���һ�Ρ�
		 * 
		 * ʾ�� 3:
		 * 
		 * ����: s = "ab" p = ".*" ���: true ����: ".*" ��ʾ��ƥ�����������'*'�������ַ���'.'����
		 * 
		 * ʾ�� 4:
		 * 
		 * ����: s = "aab" p = "c*a*b" ���: true ����: ��Ϊ '*' ��ʾ������������� 'c' Ϊ 0 ��,
		 * 'a' ���ظ�һ�Ρ���˿���ƥ���ַ��� "aab"��
		 * 
		 * ʾ�� 5:
		 * 
		 * ����: s = "mississippi" p = "mis*is*p*." ���: false
		 * 
		 * 
		 * 
		 */
		new Test17().match();

	}

	private void match() {
		String s = "mississippi";
		String p = "mis*is*p*.";
		boolean res = action(s, p);
		System.out.println(res);
	}

	private boolean action(String s, String p) {
		return s.matches(p);
	}

}
