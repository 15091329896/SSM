package com.test.dynamicAgent.observer2;

public class Test {
	public static void main(String[] args) {
		/*
		 * ͨ���۲���ģʽʵ�ִ������ĸ��ã���ʵ�ֱ�����ģ��Ļ�������
		 * ʵ��
		 * 		������
		 * 			�õ�����������
		 * 			�õ��۲��߶���
		 * 			���۲��߶�����ӵ���������
		 * 			ʹ�ô��������ô������������������Զ�ִ�й۲��ߵı���������
		 * 		������
		 * 			����̳пɹ۲��� Observable
		 * 			��֤�����������Ψһ�ԣ�����ģʽ��
		 * 			Ϊ������������ӹ۲���
		 * 			���崥������
		 * 				���ô����������״̬�ı�
		 * 				�����������յ�����Ϣ���ݵ��۲�����
		 * 		�۲��ߣ�������ģ�飩
		 * 			����ʵ�ֹ۲��߽ӿ� Observer
		 * 			ʵ�����е�update����
		 * 			
		 * 
		 * 
		 * 
		 * */
		new Test().observerTest();
		
		System.exit(0);
	}

	private void observerTest() {
		/*
		 * ��ӹ۲��ߵ�������
		 * ִ�д���������
		 * */
		Detonate detonate = Detonate.getInstance();
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		detonate.addDetonateObserver(observer1);
		detonate.addDetonateObserver(observer2);
		detonate.detonateMethod("������������");
		
	}
}
