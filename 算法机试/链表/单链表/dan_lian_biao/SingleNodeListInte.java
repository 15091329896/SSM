package myTest.dan_lian_biao;

public interface SingleNodeListInte<anyType> {
	/*
	 * ������ʵ��
	 * 		����Ԫ�صĲ鿴
	 * 		��ѯָ��λ���ϵ�Ԫ��
	 * 		����ָ��Ԫ�ص�λ��
	 * 		ɾ��Ԫ��
	 * 		���Ԫ�ص�ĩβ
	 * 		��ӵ�ָ��λ����
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
