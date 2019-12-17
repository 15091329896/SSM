package com.test.mybatis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test10 {
	/*
	 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

		请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
		
		你可以假设 nums1 和 nums2 不会同时为空。
		
		示例 1:
		
		nums1 = [1, 3]
		nums2 = [2]
		
		则中位数是 2.0
		
		示例 2:
		
		nums1 = [1, 2]
		nums2 = [3, 4]
		
		则中位数是 (2 + 3)/2 = 2.5
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		/*
		 * 计算两个数组的中位数
		 * 		将两个数组合并到一个集合中
		 * 		对集合排序
		 * 		判断元素个数是奇数还是偶数
		 * 		奇数取中间的数
		 * 		偶数取中间两数的平均数
		 * */
		new Test10().find();
		
		
	}

	private void find() {
		int[] array1 = {1, 2};
		int[] array2 = {3, 4};
		double zhong = action(array1, array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(zhong);
	}

	private double action(int[] nums1, int[] nums2) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		addToList(nums1, arrayList);
		addToList(nums2, arrayList);
		Collections.sort(arrayList);
		double zhong = getZhong(arrayList);
		return zhong;
	}

	private double getZhong(ArrayList<Integer> arrayList) {
		int size = arrayList.size();
		if((size % 2) == 0) {
			int num1 = arrayList.get(((int)Math.floor(size / 2)) - 1);
			int num2 = arrayList.get((int)Math.floor(size / 2));
			return (num1 + num2) / 2.0; 
		}
		return arrayList.get((size - 1) / 2);
	}

	private void addToList(int[] array, ArrayList<Integer> arrayList) {
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
	}
}
