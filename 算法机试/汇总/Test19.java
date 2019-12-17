package com.test.mybatis.test;

import java.util.HashMap;
import java.util.Map;

public class Test19 {
	public static void main(String[] args) {
		/*
		 * �������ְ������������ַ��� I�� V�� X�� L��C��D �� M��
		 * 
		 * �ַ� ��ֵ I 1 V 5 X 10 L 50 C 100 D 500 M 1000
		 * 
		 * ���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д�� XXVII, ��Ϊ XX
		 * + V + II ��
		 * 
		 * ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5
		 * ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������
		 * 
		 * I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9�� X ���Է��� L (50) �� C (100) ����ߣ�����ʾ
		 * 40 �� 90�� C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
		 * 
		 * ����һ������������תΪ�������֡�����ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
		 * 
		 * ʾ�� 1:
		 * 
		 * ����: 3 ���: "III"
		 * 
		 * ʾ�� 2:
		 * 
		 * ����: 4 ���: "IV"
		 * 
		 * ʾ�� 3:
		 * 
		 * ����: 9 ���: "IX"
		 * 
		 * ʾ�� 4:
		 * 
		 * ����: 58 ���: "LVIII" ����: L = 50, V = 5, III = 3.
		 * 
		 * ʾ�� 5:
		 * 
		 * ����: 1994 ���: "MCMXCIV" ����: M = 1000, CM = 900, XC = 90, IV = 4.
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
		 * �ַ� ��ֵ I 1 V 5 X 10 L 50 C 100 D 500 M 1000 ������ת������������
		 * ����һ��map���ϣ���1-10,10-100,100-1000��ʾ���� Ȼ�󽫸��������ֳַ�ǧ��ʮλȻ���Ӧ׷����һ��
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
	 * �ַ�          ��ֵ
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
