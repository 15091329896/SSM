package com.test.mybatis.test;

public class Test26 {
	public static void main(String[] args) {
		/*
		 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

			��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
			
			ʾ�� 1:
			
			�������� nums = [1,1,2], 
			
			����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 
			
			�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
			
			ʾ�� 2:
			
			���� nums = [0,0,1,1,1,2,2,3,3,4],
			
			����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
			
			�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

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
		*ɾ�������е��ظ�Ԫ�أ���������Ԫ��˳�򲻱�
		*	��������Ԫ�أ������ǰԪ��������Ԫ����ͬ�������Ԫ�غ����Ԫ�����ð�ݣ�������������
		*		��¼ð�ݵĴ���
		*		���ܳ��ȼ�ȥð�ݵĴ�������������³���
		*	
		*
		*	��ͳ�������ظ�Ԫ�صĸ���������������³���
		*	Ȼ�����³���������������
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
		 * ͳ���ظ�Ԫ�ظ���
		 * ������������
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
		 * �ظ��˼���Ԫ�أ���ʵ�ּ���ð��
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
		 * �����ظ�Ԫ�ظ���
		 * 		��������
		 * 		�ҳ�ÿһ��Ԫ�ص��ظ�Ԫ�صĸ���
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

