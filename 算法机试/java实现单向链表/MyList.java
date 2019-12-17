package com.test.mybatis.test;

public class MyList {
	private int size;
	private ListNode firstNode;

	public int getLongestSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ListNode getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(ListNode firstNode) {
		this.firstNode = firstNode;
	}

	public MyList(int size, ListNode firstNode) {
		super();
		this.size = size;
		this.firstNode = firstNode;
	}

	public ListNode add(ListNode listNode) {
		if(firstNode == null) {
			this.firstNode = listNode;
			return listNode;
		}
		int currentSize = getRealSize();
		if(currentSize >= size) {
			return null;
		}
		ListNode next = this.firstNode;
		while (next.getNext()!= null) {
			next = next.getNext();
		}
		next.setNext(listNode);
		return listNode;
	}

	public int getRealSize() {
		if(this.firstNode == null) {
			return 0;
		}
		int currentSize = 1;
		ListNode next = this.firstNode;
		while (next.getNext() != null) {
			next = next.getNext();
			currentSize++;
		}
		return currentSize;
	}

	public ListNode delete(int index) {
		ListNode deleteNode = null;
		while(true) {
			if(index == 0) {
				deleteNode = this.firstNode;
				this.firstNode = firstNode.getNext();
				break;
			}
			ListNode next = this.firstNode.getNext();
			int i = 1;
			i++;
			if(index == i) {
				deleteNode = next.getNext();
				next.setNext(next.getNext().getNext());
				break;
			} else {
				next = next.getNext();
			}
		}
		return deleteNode;
	}
	
	
	public ListNode get(int index) {
		
		if(index == 0) {
			return this.firstNode;
		}
		ListNode next = this.firstNode.getNext();
		int i = 1;
		while(index != i) {
			next = next.getNext();
			i++;
		}
		return next;
	}
	
	public boolean clean() {
		this.firstNode = null;
		return true;
		
	}
	
	public void getAll() {
		System.out.print("[");
		for (int i = 0; i < this.getRealSize(); i++) {
			System.out.print(this.get(i));
			if(i < this.getRealSize() - 1 ) {
				System.out.print(", ");
			} 
		}
		System.out.println("]");
	}
	
	
}
