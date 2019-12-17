package com.test.mybatis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test10 {
	/*
	 * ����������СΪ m �� n ���������� nums1 �� nums2��

		�����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��
		
		����Լ��� nums1 �� nums2 ����ͬʱΪ�ա�
		
		ʾ�� 1:
		
		nums1 = [1, 3]
		nums2 = [2]
		
		����λ���� 2.0
		
		ʾ�� 2:
		
		nums1 = [1, 2]
		nums2 = [3, 4]
		
		����λ���� (2 + 3)/2 = 2.5
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		/*
		 * ���������������λ��
		 * 		����������ϲ���һ��������
		 * 		�Լ�������
		 * 		�ж�Ԫ�ظ�������������ż��
		 * 		����ȡ�м����
		 * 		ż��ȡ�м�������ƽ����
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
