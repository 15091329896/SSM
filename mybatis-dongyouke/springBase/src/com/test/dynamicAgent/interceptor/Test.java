package com.test.dynamicAgent.interceptor;

public class Test {
	public static void main(String[] args) {
		/*
		 * �������߼������������н��м��й���
		 * 		���ȶ���������
		 * 			���Ƕ�������߼�
		 * 			��������߼�ǰ�ô������ô����Լ�ǰ�ô���ִ��ʧ��֮��ı��ô���
		 * 		���������
		 * 		ʹ�ô����߽�����ʵ����İ�
		 * 		ʹ�ô������ִ����ʵ����ķ�������ʱ�������ͻῪʼ����
		 * */
		
		new Test().jdkIntecepter();
		
	}

	private void jdkIntecepter() {
		AgentTool agentTool = new AgentTool("com.test.dynamicAgent.interceptor.InterceptorImpl1");
		//ע��˴�����߱����ǽӿ���ʽ����ת����ʱ��Ҳֻ���ǽӿ����ͣ������ʵ����������ջᵼ����ת��ʧ�ܣ��ò���ʵ����Ľӿڶ���
		Print print = (Print) agentTool.bind(new PrintImpl());
		print.printString("����ʹ�����������������߼����й���Ķ�̬����ʾ��");
	}
}
