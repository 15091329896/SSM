package com.test.dynamicAgent.observer;

public class Test {
	public static void main(String[] args) {
		/*
		 * �۲���ģʽ
		 * 		ʲô�ǹ۲���ģʽ
		 * 		����ʵ�ִ������ĸ���
		 * 		�۲���ģʽʵ��ͬһ���������������������ģ�飬ͬʱʵ�ֶ��������ģ��֮�以������
		 * 		ΪʲôҪʹ�ù۲���ģʽ
		 * 		Ϊ��ʵ�ִ������ĸ��ã��۲���ģʽ���ǽ�ԭ����Ϊһ��Ĵ�������ִ�����ָ�������ߴ���ĸ����Ժ�ά����������
		 * 		Ϊ��ʵ�ִ�����֮��ͱ�����ģ��֮��ķ��룬��ԭ����Ϊһ��Ĵ������ͱ�����ģ��ֿ�������ģ�飬ʵ�ִ���ṹ����������ά����
		 * 		
		 * 		���ʵ��һ��������
		 * 		��Ҫ��Ԫ�أ�
		 * 			���������ɱ��۲��ߣ�������     �̳�    �ɹ۲��� Observable
		 * 			���������۲��ߣ�    �ֱ����    ʵ��      �۲��߽ӿ� Observer
		 * 			�����ָࣺ���۲������Ǹ�������������
		 * 
		 * 
		 * 		ʵ�ֹ۲���ģʽ
		 * 			������
		 * 				�ֱ�õ��������͹۲��߶���
		 * 				ͨ�����������󽫹۲�����ӵ���������
		 * 				ͨ������������ִ�д�������
		 * 
		 * 			������ detonate
		 * 				�̳пɹ۲���
		 * 				ʹ�ù��캯��˽��ģʽ���������������۸�
		 * 				�ⲿͨ��getInstance�õ�Ψһ�Ĵ���������
		 * 				�������������
		 * 					��ӹ۲���
		 * 						�ڽ�����addObserver
		 * 					���崥������
		 * 						ʵ��ҵ���߼�
		 * 						���õ�ǰ������״̬�Ѿ����޸� this.setChanged()
        						���������յ�����Ϣ���ݸ��۲���this.notifyObservers(Object);
		 * 			�۲���Observer
		 * 				ʵ�ֹ۲��� �ӿ�  Observer
		 * 				ʵ��update����
		 * 					ʵ����Ӧ��ҵ���߼�
		 * */
		
		new Test().observerTest1();
		
		System.exit(0);
	}

	private void observerTest1() {
		/*
		 * �õ��������͹۲��߶���
		 * ���۲��߶�����ӵ���������
		 * ͨ��������������ô�������
		 * 
		 * */
		Detonate detonate = Detonate.getInstance();  
		Observer1 observer1 = new Observer1(); 
		Observer2 observer2 = new Observer2();
		detonate.addDetonateObserver(observer2);
		detonate.addDetonateObserver(observer1);
		detonate.detonateMethod("������������");
		
	}
}
