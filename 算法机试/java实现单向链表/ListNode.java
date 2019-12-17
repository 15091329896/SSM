package com.test.mybatis.test;

public class ListNode {
	private int value;
	private ListNode next;

	public ListNode(int value, ListNode next) {
		super();
		this.value = value;
		this.next = next;
	}
	
	

	public ListNode(int value) {
		super();
		this.value = value;
		this.next = null;
	}



	public ListNode() {
		super();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return new Integer(value).toString();
	}
	
	

}
