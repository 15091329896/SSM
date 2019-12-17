package com.test.mybatis.test;

public class Test18 {
	public static void main(String[] args) {
		/*
		 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i
		 * 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
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
		 * 选择两个数，计算与数轴围成的区域的最大面积
		 * 		初始化一个最大面积maxarea
		 * 		两辆组合进行计算面积
		 * 			怎么计算
		 * 				索引相减 得到长边
		 * 				最小的值做横边
		 * 			比较刷新最大区域的值
		 * 		最后将最大区域的值返回
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
