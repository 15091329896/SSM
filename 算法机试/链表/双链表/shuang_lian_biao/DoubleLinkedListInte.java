package myTest.shuang_lian_biao;

public interface DoubleLinkedListInte<anyType> {
	/*
	 * �鿴���е�Ԫ��
	 * ���Ԫ��
	 * ɾ��Ԫ��
	 * ����ָ��λ�õ�Ԫ��
	 * ����ָ��Ԫ�ص�λ��
	 * �鿴����ĳ���
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
