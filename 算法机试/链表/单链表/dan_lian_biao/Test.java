package myTest.dan_lian_biao;

public class Test {
	public static void main(String[] args) {
		/*
		 * 使用自定义的单链表
		 * 		
		 * 		
		 * */
		
		SingleNodeList<String> list = new SingleNodeList<>();
		Node<String> begin = new Node<String>("第0个元素");
		Node<String> node2 = new Node<String>("第1个元素");
		Node<String> node3 = new Node<String>("第2个元素");
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
