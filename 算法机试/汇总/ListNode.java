package com.test.mybatis.test;

public class ListNode {
	private int val;
	private ListNode next;

	public ListNode(int value, ListNode next) {
		super();
		this.val = value;
		this.next = next;
	}
	
	

	public ListNode(int value) {
		super();
		this.val = value;
		this.next = null;
	}



	public ListNode() {
		super();
	}

	public int getValue() {
		return val;
	}

	public void setValue(int value) {
		this.val = value;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return new Integer(val).toString();
	}
	
	

}
