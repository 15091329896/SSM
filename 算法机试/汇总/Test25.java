package com.test.mybatis.test;

public class Test25 {
	/*
	 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

		示例：
		
		输入：1->2->4, 1->3->4
		输出：1->1->2->3->4->4

	 * */
	
	public static void main(String[] args) {
		
		
		new Test25().paiXu();
		
		
		System.exit(0);
	}

	private void paiXu() {
		/*
		 * 初始化两个链表
		 * 然后完成合并排序
		 * 
		 * 
		 * */
		
		ListNode list1 = new ListNode(1);
		ListNode list1Node2 = new ListNode(2);
		ListNode list1Node3 = new ListNode(4);
		list1.setNext(list1Node2);
		list1Node2.setNext(list1Node3);
		
		ListNode list2 = new ListNode(1);
		ListNode list2Node2 = new ListNode(3);
		ListNode list2Node3 = new ListNode(4);
		list2.setNext(list2Node2);
		list2Node2.setNext(list2Node3);
		
		
		
		
		printList(list1);
		printList(list2);
		
		
		
		ListNode list3 = action(list1, list2);
		
		printList(list3);
		
		
		
	}

	private void printList(ListNode list) {
		ListNode next = list;
		while ( next!= null) {
			System.out.print(next.getValue() + " ");
			next = next.getNext();
		}
		System.out.println("");
	}

	private ListNode action(ListNode l1, ListNode l2) {
		ListNode next = l1;
		while (next.getNext() != null) {
			next = next.getNext();
		}
		next.setNext(l2);
		next = l1;
		ListNode next2 = l1;
		for (; next != null; next = next.getNext()) {
			for (next2 = next; next2 != null && next2.getNext() != null; next2 = next2.getNext()) {
				if(next2.getValue() > next2.getNext().getValue()) {
					int tmp = next2.getValue();
					next2.setValue(next2.getNext().getValue());
					next2.getNext().setValue(tmp);
					
				}
			}
		}
		return l1;
	}


	 
	 
	
	
	
}

