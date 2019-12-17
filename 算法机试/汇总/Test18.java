package com.test.mybatis.test;

public class Test18 {
	public static void main(String[] args) {
		/*
		 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ���������ڻ� n ����ֱ�ߣ���ֱ�� i
		 * �������˵�ֱ�Ϊ (i, ai) �� (i, 0)���ҳ����е������ߣ�ʹ�������� x �Ṳͬ���ɵ�����������������ˮ��
		 * 
		 * 
		 */

		new Test18().max();
	}

	private void max() {
		int[] array = {1,8,6,2,5,4,8,3,7};
		int area = action(array);
		System.out.println(area);
	}

	private int action(int[] height) {
		/*
		 * ѡ��������������������Χ�ɵ������������
		 * 		��ʼ��һ��������maxarea
		 * 		������Ͻ��м������
		 * 			��ô����
		 * 				������� �õ�����
		 * 				��С��ֵ�����
		 * 			�Ƚ�ˢ����������ֵ
		 * 		�����������ֵ����
		 * */
		int maxArea = 0;
		maxArea = getMaxArea(height, maxArea);
		return maxArea;
	}

	private int getMaxArea(int[] array, int maxArea) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(j > array.length - 1) {
					break;
				}
				int hengBian = j - i;
				int changBian = min(array, i, j);
				int tmpArea = hengBian * changBian;
				if(tmpArea > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
				maxArea = tmpArea > maxArea ? tmpArea : maxArea;
			}
		}
		return maxArea;
	}

	private int min(int[] array, int i, int j) {
		return array[i] < array[j] ? array[i] : array[j];
	}
}
