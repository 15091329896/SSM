package myTest.dan_lian_biao;

public class SingleNodeList<anyType> implements SingleNodeListInte<anyType>{
	private Node<anyType> begin;
	private Node<anyType> end;
	
	public int getSize() {
		int i = 0;
		Node<anyType> next = this.begin;
		while (next != null) {
			i++;
			next = next.getNextNode();
		}
		return i;
	}


	public Node<anyType> getBegin() {
		return begin;
	}

	public void setBegin(Node<anyType> begin) {
		this.begin = begin;
	}

	public Node<anyType> getEnd() {
		Node<anyType> next = getBegin();
		while(next != null) {
			if(next.getNextNode() == null) {
				end = next;
				return next;
			}
			next = next.getNextNode();
		}
		System.out.println("当前链表没有合适的尾节点");
		return null;
	}

	public void setEnd(Node<anyType> end) {
		end.setNextNode(null);
		this.end = end;
	}

	public SingleNodeList() {
		super();
	}

	public SingleNodeList(Node<anyType> begin) {
		this.begin = begin;
	}

	@Override
	public void showAllNode() {
		/*
		 * 根据头结点，依次遍历整个链表
		 * */
		if(getBegin() == null) {
			System.out.println("这是个空链表");
			return;
		}
		Node<anyType> next = this.getBegin();
		while (next != null) {
			System.out.println(next.getAnyTypeValue().toString());
			next = next.getNextNode();
		}
	}

	@Override
	public Node<anyType> getNode(int index) {
		if(index > (getSize() - 1)) {
			System.out.println("索引超出了链表的最大长度");
			return null;
		}
		int i = 0;
		Node<anyType> next = this.getBegin();
		while (next != null) {
			if(i == index) {
				return next;
			}
			next = next.getNextNode();
			i++;
		}
		return null;
	}

	@Override
	public int getNodeIndex(Node<anyType> node) {
		if(node == null) {
			return -1;
		}
		int i = 0;
		Node<anyType> next = this.getBegin();
		while(next != null) {
			if(next.equals(node)) {
				break;
			}
			next = next.getNextNode();
			i++;
		}
		return i;
	}

	@Override
	public boolean deleteNode(Node<anyType> node) {
		if(node == null) {
			return false;
		}
		if(this.getBegin() == null) {
			return false;
		}
		int nodeIndex = getNodeIndex(node);
		return deleteNode(nodeIndex);
	}

	@Override
	public boolean deleteNode(int index) {
		if(index > getSize() - 1 || index < 0) {
			return false;
		}
		Node<anyType> next = this.getBegin();
		Node<anyType> pre = null;
		for (int i = 0; i < index; i++) {
			if(i == index -1) {
				pre = next;
			}
			if (next != null) {
				next = next.getNextNode();
			}
			
		}
		Node<anyType> current = null;
		if(next != null) {
			current = next;
		}
		Node<anyType> nextNode = null;
		if(current != null) {
			nextNode = current.getNextNode();
		}
		if(pre != null) {
			pre.setNextNode(nextNode);
			return true;
		} else {
			setBegin(nextNode);
			return true;
		}
	}
	
	@Override
	public boolean addNode(Node<anyType> node) {
		if(node == null || node.getNextNode() != null) {
			return false;
		}
		getEnd().setNextNode(node);
		return true;
	}

	@Override
	public boolean addNode(Node<anyType> node, int index) {
		if(index > getSize() - 1 || index < 0) {
			System.out.println("索引越界");
			return false;
		}
		Node<anyType> next = this.getBegin();
		for (int i = 0; i < index; i++) {
			next = next.getNextNode();
		}
		next.setNextNode(node);
		node.setNextNode(next.getNextNode());
		return true;
	}
	
}
