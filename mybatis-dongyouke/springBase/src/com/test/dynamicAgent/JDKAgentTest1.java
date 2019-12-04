package com.test.dynamicAgent;

public class JDKAgentTest1 {
	public static void main(String[] args) {
		/*
		 * JDK��̬����
		 * 		���ɴ�����
		 * 			ʹ�ô��������ɴ�����󣬲�����ʵ����ʹ�����������
		 * 			��Ӵ����߼�
		 * 		����ʵ����ʹ������
		 * 		ͨ���������ִ����ʵ����ĺ���
		 * 	
		 * 
		 * */
//		new JDKAgentTest1().jdkAgent();
//		new JDKAgentTest1().jdkAgent2();
		new JDKAgentTest1().jdkagent3();
		System.exit(0);
		
	}

	private void jdkagent3() {
		/*
		 * jdk��̬����
		 * 		jdkʵ�ֶ�̬����
		 * 		��Ҫһ����ڣ�ʵ���࣬��������
		 * 		�����������������������
		 * 			����ʵ�����������ӿ�
		 * 			���ɲ��Ҵ�����󣬲��Ұ���ʵ�����ڷ������õ㴦��Ӵ����߼�
		 * 		��ʼ����
		 * 		�õ�������
		 * 		���ɴ�������Ұ���ʵ����
		 * 		��ʼͨ��������������ʵ����ĺ���
		 * 
		 * 			
		 * 	
		 * 
		 * */
		AgentTool3 agentTool = new AgentTool3();
		Print print = (Print) agentTool.bind(new PrintImpl());
		print.printString("����ͨ����̬����ʵ�ַ�������");
		InterTest1 interTest1 = (InterTest1) agentTool.bind(new InterTest1Impl());
		interTest1.funcTest1("����ͬһ�������ߴ���ĵڶ�������");
	}

	private void jdkAgent2() {
		/*
		 * jdk��̬�����ʵ��
		 * 		�ӿڣ�ʵ���࣬ʵ�ַ���
		 * 		��������
		 * 			����ʵ�����������ӿ�
		 * 			��invoke������ʵ�ִ����߼���׷��
		 * 			����ʵ����ʹ������
		 * 				�õ���ʵ������ֽ������
		 * 				�����ֽ������õ���ʵ�������������ͽӿڣ�ͬʱ���뵱ǰ�Ĵ����������
		 * 		�õ���������Ķ���
		 * 		ͨ��������ʵ�ִ����������ɺ���ʵ����İ�
		 * 		ͨ���������ִ����ʵ����ĺ���
		 *		 
		 *
		 *�����߾���Ϊ���еĽӿں�ʵ���඼�������ͬ����ǰ�úͺ��ô�����࣬�����Ҫ��ͬ�Ĵ����߼���ֻ��Ҫʹ�ö�Ӧ�Ĵ������༴��
		 *
		 *
		 *
		 * */
		AgentTool2 agentTool = new AgentTool2();
		Print print = (Print) agentTool.bind(new PrintImpl());
		print.printString("����ͨ����̬����ʵ�ֵĺ�������");
		print.printString2("���ǵڶ�������");
		InterTest1 interTest1 = (InterTest1) agentTool.bind(new InterTest1Impl());
		interTest1.funcTest1("���Ǵ����ߴ���ĵڶ�����");
		
		
	}

	private void jdkAgent() {
		/*
		 * �õ�������
		 * ����ʵ����ʹ������
		 * ͨ���������ִ����ʵ����ĺ���
		 * */
		
		JdkAgentTool agentTool = new JdkAgentTool();
		Print proxyObject = (Print) agentTool.bind(new PrintImpl());
		proxyObject.printString("������ʵ�����еĺ���");
		
		
		
	}
}
