package myTest.shuang_lian_biao;

public class Test {
	public static void main(String[] args) {
		/*
		 *ʵ��һ��˫����
		 *
		 * */
		
		DoubleLinkedList<String> list = new DoubleLinkedList<>();
		
		Node<String> begin = new Node<String>("0��Ԫ��");
		list.setBegin(begin);
//		list.printAllNode();
		list.add(new Node<String>("1��Ԫ��"));
		list.add(new Node<String>("2��Ԫ��"));
		System.out.println(list.size());
		list.printAllNode();
		System.out.println("//////////////////////////");
		list.delete(0);
		list.printAllNode();
		
		
	}
}
