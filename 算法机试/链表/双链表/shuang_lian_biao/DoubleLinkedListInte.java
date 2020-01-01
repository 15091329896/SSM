package myTest.shuang_lian_biao;

public interface DoubleLinkedListInte<anyType> {
	/*
	 * 查看所有的元素
	 * 添加元素
	 * 删除元素
	 * 查找指定位置的元素
	 * 查找指定元素的位置
	 * 查看链表的长度
	 * 
	 * */
	
	public abstract void printAllNode();
	
	public abstract Node<anyType> getNode(int index);
	
	public abstract int getIndex(Node<anyType> node);
	
	public abstract boolean delete(Node<anyType> node);
	
	public abstract boolean delete(int index);
	
	public abstract boolean add(Node<anyType> node);
	
	public abstract int size();
	
}
