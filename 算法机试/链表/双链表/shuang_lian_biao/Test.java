package myTest.shuang_lian_biao;

public class Test {
	public static void main(String[] args) {
		/*
		 *实现一个双链表
		 *
		 * */
		
		DoubleLinkedList<String> list = new DoubleLinkedList<>();
		
		Node<String> begin = new Node<String>("0号元素");
		list.setBegin(begin);
//		list.printAllNode();
		list.add(new Node<String>("1号元素"));
		list.add(new Node<String>("2号元素"));
		System.out.println(list.size());
		list.printAllNode();
		System.out.println("//////////////////////////");
		list.delete(0);
		list.printAllNode();
		
		
	}
}
