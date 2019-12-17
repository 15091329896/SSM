package com.test.mybatis.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		/*
		 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

			你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
			
			示例:
			
			给定 nums = [2, 7, 11, 15], target = 9
			
			因为 nums[0] + nums[1] = 2 + 7 = 9
			所以返回 [0, 1]

			
			
		 * 
		 * */
		
		/*
		 * 遍历数组中的元素
		 * 		将第一个元素和其余的元素依次相加，判断是否等于目标值
		 * 			不等，继续和其余元素的下一个元素进行同样的操作
		 * 		对数组中的每一个元素进行同样的操作
		 * 
		 * */
		
//		new Test().find();
		
		/*
		 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

			如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
			
			您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
			
			示例：
			
			输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
			输出：7 -> 0 -> 8
			原因：342 + 465 = 807
			
		 * */
		Object object = null;
		object = new Float(12.3);
		Integer integer = (Integer) object;
		System.out.println(integer);
		
	}

	private void find() {
		int[] nums = {2, 7, 11, 15}; 
		int target = 9;
//		int[] res = findAction(nums, target);
		int[] res = findAction2(nums, target);
		System.out.println(Arrays.toString(res));
		
	}

	private int[] findAction2(int[] nums, int target) {
		Arrays.sort(nums);
		int length = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > target) {
				length = i;
			}
		}
		int[] res = new int[2];
		boolean stop = false;
		for (int i = 0; i < length; i++) {
			res[0] = i;
			for (int j = i + 1; j < length; j++) {
				if(j < nums.length && (nums[i] + nums[j]) == target) {
					res[1] = j;
					stop = true;
					break;
				}
			}
			if(stop) {
				break;
			}
		}
		return res;
	}

	private int[] findAction(int[] nums, int target) {
		int[] res = new int[2];
		boolean stop = false;
		for (int i = 0; i < nums.length; i++) {
			res[0] = i;
			for (int j = i + 1; j < nums.length; j++) {
				if(j < nums.length && (nums[i] + nums[j]) == target) {
					res[1] = j;
					stop = true;
					break;
				}
			}
			if(stop) {
				break;
			}
		}
		return res;
	}
}
