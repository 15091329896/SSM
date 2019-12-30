package myTest.dan_lian_biao;

public interface SingleNodeListInte<anyType> {
	/*
	 * 单链表实现
	 * 		链表元素的查看
	 * 		查询指定位置上的元素
	 * 		查找指定元素的位置
	 * 		删除元素
	 * 		添加元素到末尾
	 * 		添加到指定位置上
	 * 		
	 * */
	
	public abstract void showAllNode();
	
	public abstract Node<anyType> getNode(int index);
	
	public abstract int getNodeIndex(Node<anyType> node);
	
	public abstract boolean deleteNode(Node<anyType> node);
	
	public abstract boolean deleteNode(int index);
	
	public abstract boolean addNode(Node<anyType> node);
	
	public abstract boolean addNode(Node<anyType> node, int index);
	
	
}
