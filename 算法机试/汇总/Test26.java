package com.test.mybatis.test;

public class Test26 {
	public static void main(String[] args) {
		/*
		 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

			不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
			
			示例 1:
			
			给定数组 nums = [1,1,2], 
			
			函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
			
			你不需要考虑数组中超出新长度后面的元素。
			
			示例 2:
			
			给定 nums = [0,0,1,1,1,2,2,3,3,4],
			
			函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
			
			你不需要考虑数组中超出新长度后面的元素。

		 * 
		 * 
		 * */
		new Test26().shanChu();
		
//		int[] array = {0,0,1,1,1,1,2,2,3,3,4};
//		System.out.println(Arrays.toString(array));
//		new Test26().maoPao(3, array);
//		System.out.println(Arrays.toString(array));
//		System.out.println(array.length);
//		System.out.println(new Test26().chongFuNum(array));
		
	}

	private void shanChu() {
		/*
		*删除数组中的重复元素，并且数组元素顺序不变
		*	遍历数组元素，如果当前元素与后面的元素相同，将这个元素后面的元素向后冒泡，依次两两交换
		*		记录冒泡的次数
		*		用总长度减去冒泡的次数就是数组的新长度
		*	
		*
		*	先统计数中重复元素的个数，计算数组的新长度
		*	然后按照新长度重新整理数组
		*	
		*
		*
		 * */
		int[] array = {1,2,2};
		int res = action(array);
		System.out.println(res);
	}

	private int action(int[] nums) {
		/*
		 * 统计重复元素个数
		 * 重新整理数组
		 * */
		if(nums.length == 0) {
			return 0;
		}
		int chongfu = chongFuNum(nums);
		if(chongfu == nums.length - 1) {
			return nums.length - chongfu;
		}
		System.out.println(chongfu);
		chongXinZhengLi(nums, chongfu);
		return nums.length - chongfu;
	}

	private void chongXinZhengLi(int[] array, int chongfu) {
		/*
		 * 重复了几个元素，就实现几次冒泡
		 * */
		int maxValue = array[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if(i + 1 < array.length && array[i] > array[i + 1]) {
				break;
			}
			for (int j = i + 1; j < array.length; j++) {
				if(j >= array.length) {
					break;
				}
				if(j + 1 < array.length && array[j] > array[j + 1]) {
					break;
				}
				if(array[i] == array[j] && array[i] != maxValue) {
					maoPao(j, array);
					j = i;
				}
			}
		}
		
	}

	private void maoPao(int index, int[] array) {
		for (int i = index; i < array.length; i++) {
			int tmp = array[i];
			if(i + 1 >= array.length) {
				break;
			}
			array[i] = array[i + 1];
			array[i + 1] = tmp;
		}
	}

	private int chongFuNum(int[] array) {
		/*
		 * 计算重复元素个数
		 * 		遍历数组
		 * 		找出每一个元素的重复元素的个数
		 * */
		int chongFu = 0;
		for (int i = 0; i < array.length; i++) {
			int tiao = 0;
			for (int j = i + 1; j < array.length; j++) {
				if(j >= array.length) {
					break;
				}
				if(array[i] == array[j]) {
					tiao++;
					chongFu++;
				}
			}
			if(tiao > 0) {
				i = i + tiao -1;
			}
		}
		return chongFu;
	}
}

