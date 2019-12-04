package com.test.dynamicAgent.cglib;

import com.test.modul.Book;

public class CGLIBAgentTest {
	/*
	 * CGLIB���ж�̬����
	 * 		Ŀ�ģ��ڷ�����ʵ����֮ǰ�������ǰ�ô�����������ô���
	 * 		��Ҫһ����������-ʵ�ֺ����������ӿ�
	 * 			
	 * 			��ɴ�����������
	 * 				������ʵ������ֽ���
	 * 				�õ���ǿ��
	 * 				������ǿ�����;��ǵ�ǰ�������ʵ���������
	 * 				���õ�ǰ�Ĵ����߾��ǻص�����
	 * 				���ɴ������
	 * 			ʵ�ִ����߼�
	 * 				�ں����������ִ�к�����ǰ����Ӵ����߼�
	 * 				����ִ����ɺ�Ľ������
	 * */
	
	public static void main(String[] args) {
//		new CGLIBAgentTest().cglibAgent();
//		new CGLIBAgentTest().cglibAgent2();
		new CGLIBAgentTest().cglibAgent3();
		System.exit(0);
	}

	private void cglibAgent3() {
		/*
		 * cglib��̬����
		 * 		��Ҫ������
		 * 		��Ҫһ���ǳ�����
		 * 		ͨ�������߰���ʵ���󵽴������
		 * 		ͨ���������ִ�д����߼�����ʵ����ĺ���
		 * 
		 * 
		 * */
		
		CglibAgentTool2 agentTool = new CglibAgentTool2();
		Book book = (Book) agentTool.bind(new Book());
		book.printString("���Ƕ�̬����ִ�еĺ���");
		
		
	}

	private void cglibAgent2() {
		/*
		 * cglib��̬����
		 * 		�����ǳ�����
		 * 		������������
		 * 		�������д���������
		 * 		ͨ�������߰���ʵ���󵽴��������
		 * 		ͨ���������ִ����ʵ����ĺ���
		 * */
		
		CglibAgentTool cglibAgentTool = new CglibAgentTool();
		Book book = (Book) cglibAgentTool.bind(new Book());
		book.printString("����cglib��̬����ʵ�ֵķ�������");
		
		
	}

	private void cglibAgent() {
		/*
		 * cglib��̬����
		 * 		�ڷ�����ʵ����֮ǰ��Ӵ����߼�
		 * 		����Ҫ�ӿڣ�ֻ��Ҫһ����ͨ����
		 * 		��Ҫ��������-ʵ�ֺ����������ӿ�
		 * 			���ɴ������
		 * 				�õ���ǿ��
		 * 				������ǿ���;��ǵ�ǰ�������ʵ���������
		 * 				���õ�ǰ�Ĵ���������ǻص�����
		 * 				���ɴ������
		 * 			��Ӵ����߼�
		 * 				�ں����������ִ�к���ǰ����Ӵ����߼�
		 * 				���غ���ִ��֮�����ɵĽ������
		 * 		���ɴ�����
		 * 		ͨ�������ߵõ����������Ҫ���뱻�����������
		 * 		ͨ���������ִ����ʵ����ĺ���
		 *		 
		 * 
		 * 
		 * 
		 * */
		
		CglibProxyTool cglibAgentTool = new CglibProxyTool();
		Book book = (Book) cglibAgentTool.bind(new Book());
		book.printString("����cglib��̬����");
	}
	
}
