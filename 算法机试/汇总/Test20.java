package com.test.mybatis.test;

public class Test20 {
	public static void main(String[] args) {
		/*
		 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。

			字符          数值
			I             1
			V             5
			X             10
			L             50
			C             100
			D             500
			M             1000
				示例 1:
				
				输入: "III"
				输出: 3
				
				示例 2:
				
				输入: "IV"
				输出: 4
				
				示例 3:
				
				输入: "IX"
				输出: 9
				
				示例 4:
				
				输入: "LVIII"
				输出: 58
				解释: L = 50, V= 5, III = 3.
				
				示例 5:
				
				输入: "MCMXCIV"
				输出: 1994
				解释: M = 1000, CM = 900, XC = 90, IV = 4.
		 * */
		
		new Test20().converse();
//		char key = '2';
//		switch (key) {
//		case 'a':
////			System.out.println(key);
//			break;
//		default:
//			break;
//		}
	}

	private void converse() {
		String luo = "MCMXCIV";
		int res = action(luo);
		System.out.println(res);
		
	}

	private int action(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			int behindIndex = i + 1;
			char charAtBehind = '*';
			if(behindIndex < s.length()) {
				charAtBehind = s.charAt(behindIndex);
			}
			res += deal(charAt, charAtBehind);
		}
		return res;
	}

	/*
	 * 字符          数值
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
		示例 1:
		输入: "III"
		输出: 3
		示例 2:
		输入: "IV"
		输出: 4
		示例 3:
		输入: "IX"
		输出: 9
		示例 4:
		输入: "LVIII"
		输出: 58
		解释: L = 50, V= 5, III = 3.
		示例 5:
		输入: "MCMXCIV"
		输出: 1994
		解释: M = 1000, CM = 900, XC = 90, IV = 4.
	 * */
	private int deal(char charAt, char charAtBehind) {
		switch (charAt) {
			case 'I':
				return dealI(charAtBehind);
			case 'V':
				return dealV(charAtBehind);
			case 'X':
				return dealX(charAtBehind);
			case 'L':
				return dealL(charAtBehind);
			case 'C':
				return dealC(charAtBehind);
			case 'D':
				return dealD(charAtBehind);
			case 'M':
				return dealM(charAtBehind);
			default:
				break;
		}
		return 0;
	}

	private int dealM(char charAtBehind) {
		return 1000;
	}

	private int dealD(char charAtBehind) {
		return 500;
	}

	private int dealC(char charAtBehind) {
		if(charAtBehind == 'D' || charAtBehind == 'M') {
			return -100;
		}
		return 100;
	}

	private int dealL(char charAtBehind) {
		return 50;
	}

	private int dealX(char charAtBehind) {
		if(charAtBehind == 'L' || charAtBehind == 'C') {
			return -10;
		}
		return 10;
	}

	private int dealV(char charAtBehind) {
		return 5;
	}

	private int dealI(char charAtBehind) {
		if(charAtBehind == 'V' || charAtBehind == 'X') {
			return -1;
		}
		return 1;
	}
}
