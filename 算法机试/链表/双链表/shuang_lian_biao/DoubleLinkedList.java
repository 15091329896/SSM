package myTest.shuang_lian_biao;

public class DoubleLinkedList<anyType> implements DoubleLinkedListInte<anyType> {
	private Node<anyType> begin;
	private Node<anyType> end;

	public DoubleLinkedList() {
	}

	public DoubleLinkedList(Node<anyType> begin) {
		super();
		this.begin = begin;
	}

	public Node<anyType> getBegin() {
		return begin;
	}

	public void setBegin(Node<anyType> begin) {
		this.begin = begin;
	}

	public Node<anyType> getEnd() {
		/*
		 * 找到最后的节点 最后的节点的标志是最后一个节点的后继一定为null
		 */
		Node<anyType> next = this.getBegin();
		while (next != null) {
			if (next.getNext() == null) {
				return next;
			}
			next = next.getNext();
		}
		return null;
	}

	public void setEnd(Node<anyType> end) {
		end.setNext(null);
		this.end = end;
	}

	@Override
	public void printAllNode() {
		Node<anyType> next = this.getBegin();
		if (next == null) {
			System.out.println("这是个空链表");
		}
		while (next != null) {
			System.out.println(next.toString());
			next = next.getNext();
		}
	}

	@Override
	public Node<anyType> getNode(int index) {
		if (index < 0 || index > size() - 1) {
			return null;
		}
		Node<anyType> next = this.getBegin();
		for (int i = 0; i < this.size(); i++) {
			if (index == i) {
				return next;
			}
			if (next != null) {
				next = next.getNext();
			}
		}
		return null;
	}

	@Override
	public int getIndex(Node<anyType> node) {
		if (node == null) {
			return -1;
		}
		Node<anyType> next = this.getBegin();
		if (next == null) {
			System.out.println("这是个空链表");
			return -1;
		}
		for (int i = 0; i < size(); i++) {
			if (next.getAnyTypeValue().equals(node.getAnyTypeValue())) {
				return i;
			}
			next = next.getNext();
		}
		return -1;
	}

	@Override
	public boolean delete(Node<anyType> node) {
		int index = getIndex(node);
		return delete(index);
	}

	@Override
	public boolean delete(int index) {
		if(index < 0 || index > size() -1) {
			return false;
		}
		Node<anyType> next = this.getBegin();
		if (next == null) {
			System.out.println("这是个空链表");
			return false;
		}
		if(index == 0) {
			this.setBegin(next.getNext());
			return true;
		}
		for (int i = 0; i < size() && next != null; i++) {
			if (index == i && index != 0) {
				Node<anyType> pre = next.getPre();
				Node<anyType> nextTmp = next.getNext();
				pre.setNext(nextTmp);
				return true;
			}
			next = next.getNext();
		}
		return false;
	}

	@Override
	public boolean add(Node<anyType> node) {
		if(node == null) {
			return false;
		}
		Node<anyType> end = getEnd();
		end.setNext(node);
		node.setNext(null);
		return true;
	}

	@Override
	public int size() {
		int i = 0;
		Node<anyType> next = this.getBegin();
		if (next == null) {
			return 0;
		}
		while (next != null) {
			next = next.getNext();
			i++;
		}
		return i;
	}

}
