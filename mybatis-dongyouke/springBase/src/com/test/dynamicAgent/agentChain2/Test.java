package com.test.dynamicAgent.agentChain2;

public class Test {
	public static void main(String[] args) {
		/*
		 * �����һ��������
		 * �����������
		 * 
		 * 
		 * 	ʵ��һ��������
		 * 		������
		 * 			��ʵ����İ󶨣�ͬʱƥ���Ӧ��������
		 * 		�������ӿ�
		 * 			��������
		 * 		������ʵ��
		 * 			��������
		 * 		������
		 * 
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		new Test().testInterceptor();
		System.exit(0);
	}

	private void testInterceptor() {
		/*
		 * �õ�������
		 * 		ʹ�ô����߰���ʵ���󣬲��ƶ����������õ��������
		 * 		ʹ�ô�������������������ʵ����ĺ���
		 * 
		 * 
		 * */
		AgentTool agentTool = new AgentTool();
		Print print = (Print) agentTool.bind(new PrintImpl(), "com.test.dynamicAgent.agentChain2.Interceptor2");
		Print print2 = (Print) agentTool.bind(print, "com.test.dynamicAgent.agentChain2.Interceptor1");
		print2.printString("������������һ�β���");
		
		
		
	}
}
