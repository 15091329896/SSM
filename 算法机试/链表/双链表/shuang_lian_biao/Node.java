package myTest.shuang_lian_biao;

public class Node<anyType> {
	private anyType anyTypeValue;
	private Node<anyType> pre;
	private Node<anyType> next;

	public anyType getAnyTypeValue() {
		return anyTypeValue;
	}

	public void setAnyTypeValue(anyType anyTypeValue) {
		this.anyTypeValue = anyTypeValue;
	}

	public Node<anyType> getPre() {
		return pre;
	}

	public void setPre(Node<anyType> pre) {
		this.pre = pre;
	}

	public Node<anyType> getNext() {
		return next;
	}

	public void setNext(Node<anyType> next) {
		this.next = next;
	}

	public Node(anyType anyTypeValue) {
		super();
		this.anyTypeValue = anyTypeValue;
		this.pre = null;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [anyTypeValue=" + anyTypeValue + ", pre=" + pre + ", next=" + next + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Node<anyType> node = (Node<anyType>) obj;
		if (this.getAnyTypeValue().equals(node.getAnyTypeValue())) {
			return true;
		}
		return false;
	}

}
