package com.test.mybatis.test;

public class Test24 {
	public static void main(String[] args) {
		/*
		 * 创建一个链表，存储5个不同的数字，然后使用冒泡排序进行排序
		 * 
		 * */
		
		
//		MyList list = new MyList(5, new ListNode(10));
//		list.add(new ListNode(20));
//		list.add(new ListNode(12));
//		list.add(new ListNode(5));
//		list.add(new ListNode(100));
//		list.getAll();
		
		
////		System.out.println(list.getRealSize());
////		System.out.println(list.get(0));
		
		new Test24().maoPao();
		System.exit(0);
	}

	private void maoPao() {
		MyList list = new MyList(5, new ListNode(10));
		list.add(new ListNode(20));
		list.add(new ListNode(12));
		list.add(new ListNode(5));
		list.add(new ListNode(100));
		list.getAll();
		list = action(list);
		list.getAll();
		
		
		
	}

	private MyList action(MyList list) {
		for (int i = 0; i < list.getRealSize(); i++) {
			for (int j = 0; j < list.getRealSize() - i; j++) {
				if(j + 1 >= list.getRealSize()) {
					break;
				}
				if(list.get(j).getValue() > list.get(j + 1).getValue()) {
					int tmp = list.get(j).getValue();
					list.get(j).setValue(list.get(j + 1).getValue());
					list.get(j + 1).setValue(tmp);
				}
			}
		}
		return list;
	}
	
	
}
