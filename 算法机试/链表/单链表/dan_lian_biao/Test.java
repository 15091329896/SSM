package myTest.dan_lian_biao;

public class Test {
	public static void main(String[] args) {
		/*
		 * ʹ���Զ���ĵ�����
		 * 		
		 * 		
		 * */
		
		SingleNodeList<String> list = new SingleNodeList<>();
		Node<String> begin = new Node<String>("��0��Ԫ��");
		Node<String> node2 = new Node<String>("��1��Ԫ��");
		Node<String> node3 = new Node<String>("��2��Ԫ��");
		list.setBegin(begin);
		list.addNode(node2);
		list.addNode(node3);
//		System.out.println(singleNodeList.getSize());
//		singleNodeList.showAllNode(singleNodeList);
//		System.out.println(singleNodeList.deleteNode(0));
//		System.out.println(singleNodeList.getSize());
//		singleNodeList.showAllNode(singleNodeList);
//		System.out.println(singleNodeList.deleteNode(0));
//		System.out.println(singleNodeList.getSize());
		list.showAllNode();
//		System.out.println(singleNodeList.getSize());
		System.out.println(list.deleteNode(0));
		System.out.println(list.deleteNode(0));
		System.out.println(list.deleteNode(0));
		System.out.println(list.deleteNode(0));
		System.out.println(list.deleteNode(0));
		list.showAllNode();
		
		
		
	}
}
