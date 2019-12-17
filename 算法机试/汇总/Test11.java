package com.test.mybatis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test11 {
	/*
	 * 一组n个数确定其中的第K个最大值
	 * 		冒泡排序
	 * 		返回第K个最大值
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		new Test11().find();
	}

	private void find() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入K:");
		int input = scanner.nextInt();
		int[] array = {12,45,12,56,45,78,89,12,46};
		System.out.println(Arrays.toString(array));
		paiXuJiangXu(array);
		System.out.println(Arrays.toString(array));
		int res = array[input - 1];
		System.out.println("res = " + res);
	}

	private void paiXuJiangXu(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if(j == array.length - 1) {
					break;
				}
				if(array[j] < array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
	
	
}
