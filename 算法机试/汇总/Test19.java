package com.test.mybatis.test;

import java.util.HashMap;
import java.util.Map;

public class Test19 {
	public static void main(String[] args) {
		/*
		 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
		 * 
		 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000
		 * 
		 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX
		 * + V + II 。
		 * 
		 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5
		 * 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
		 * 
		 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 X 可以放在 L (50) 和 C (100) 的左边，来表示
		 * 40 和 90。 C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
		 * 
		 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
		 * 
		 * 示例 1:
		 * 
		 * 输入: 3 输出: "III"
		 * 
		 * 示例 2:
		 * 
		 * 输入: 4 输出: "IV"
		 * 
		 * 示例 3:
		 * 
		 * 输入: 9 输出: "IX"
		 * 
		 * 示例 4:
		 * 
		 * 输入: 58 输出: "LVIII" 解释: L = 50, V = 5, III = 3.
		 * 
		 * 示例 5:
		 * 
		 * 输入: 1994 输出: "MCMXCIV" 解释: M = 1000, CM = 900, XC = 90, IV = 4.
		 * 
		 * 
		 */

		 new Test19().converse();
//		StringBuffer buffer = new StringBuffer("abc");
//		System.out.println(buffer.reverse().toString());
//		buffer.append("");
//		System.out.println(new Integer(new Character('9').toString()));

		System.exit(0);
		 
	}

	private void converse() {
		/*
		 * 
		 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000 将整数转换成罗马数字
		 * 建立一个map集合，将1-10,10-100,100-1000表示出来 然后将给出的数字分成千百十位然后对应追加在一起
		 * 
		 * 
		 */
		int num = 581;
		String luoMa = action(num);
		System.out.println(luoMa);
	}

	private String action(int num) {
		String numString = new Integer(num).toString();
		StringBuffer tmpBuffer = new StringBuffer(numString);
		numString = tmpBuffer.reverse().toString();
		StringBuffer buffer = new StringBuffer();
		Map<Integer, String> map = new HashMap<Integer, String>();
		int j = 0;
		for (int i = 0; i < numString.length(); i++) {
			String tmp = null;
			switch (i) {
			case 0:
				tmp = dealGeWei(numString.charAt(i));
				break;
			case 1:
				tmp = dealShiWei(numString.charAt(i));
				break;
			case 2:
				tmp = dealBaiWei(numString.charAt(i));
				break;
			default:
				tmp = dealQianWei(numString.charAt(i));
				break;
			}
			if(tmp != null) {
				map.put(j++, tmp);
//				System.out.println("tmp -->" + tmp);
			}
		}
		for (int i = map.size() - 1; i >= 0; i--) {
//			System.out.println(map.get(i));
			buffer.append(map.get(i));
		}
		String string = buffer.toString();
		return string;
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

	 * */
	private String dealQianWei(char charAt) {
		int qianWei = new Integer(new Character(charAt).toString());
		switch (qianWei) {
			case 0:
				return null;
			case 1:
				return "M";
			case 2:
				return "MM";
			case 3:
				return "MMM";
			case 4:
				return "MMMM";
			case 5:
				return "MMMMM";
			case 6:
				return "MMMMMM";
			case 7:
				return "MMMMMMM";
			case 8:
				return "MMMMMMMM";
			case 9:
				return "MMMMMMMMM";
			default:
				break;
		}
		return null;
	}

	private String dealBaiWei(char charAt) {
		int baiWei = new Integer(new Character(charAt).toString());
		switch (baiWei) {
			case 0:
				return null;
			case 1:
				return "C";
			case 2:
				return "CC";
			case 3:
				return "CCC";
			case 4:
				return "CD";
			case 5:
				return "D";
			case 6:
				return "DC";
			case 7:
				return "DCC";
			case 8:
				return "DCCC";
			case 9:
				return "CM";
			default:
				break;
		}
		return null;
	}


	private String dealShiWei(char charAt) {
		int shiWei = new Integer(new Character(charAt).toString());
		switch (shiWei) {
			case 0:
				return null;
			case 1:
				return "X";
			case 2:
				return "XX";
			case 3:
				return "XXX";
			case 4:
				return "XL";
			case 5:
				return "L";
			case 6:
				return "LX";
			case 7:
				return "LXX";
			case 8:
				return "LXXX";
			case 9:
				return "XC";
			default:
				break;
		}
		return null;
	}


	private String dealGeWei(char charAt) {
		int geWei = new Integer(new Character(charAt).toString());
		switch (geWei) {
			case 0:
				return null;
			case 1:
				return "I";
			case 2:
				return "II";
			case 3:
				return "III";
			case 4:
				return "IV";
			case 5:
				return "V";
			case 6:
				return "VI";
			case 7:
				return "VII";
			case 8:
				return "VIII";
			case 9:
				return "IX";
			default:
				break;
		}
		return null;
	}
}
