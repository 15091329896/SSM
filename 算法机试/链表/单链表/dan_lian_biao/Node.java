package myTest.dan_lian_biao;

public class Node<anyType> {
	private anyType anyTypeValue;
	private Node<anyType> nextNode;

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null){
			return false;
		}
		Node<anyType> node = (Node<anyType>) obj;
		if(this.getAnyTypeValue().equals(node.getAnyTypeValue())) {
			return true;
		}
		return false;
	}

	public Node(anyType anyTypeValue) {
		this.anyTypeValue = anyTypeValue;
		this.nextNode = null;
	}

	public Node() {
		super();
	}

	public anyType getAnyTypeValue() {
		return anyTypeValue;
	}

	public void setAnyTypeValue(anyType anyTypeValue) {
		this.anyTypeValue = anyTypeValue;
	}

	public Node<anyType> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<anyType> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [anyTypeValue=" + anyTypeValue + ", nextNode=" + nextNode + "]";
	}

}
