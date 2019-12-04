package com.test.dynamicAgent.agentChain2;

public class Test {
	public static void main(String[] args) {
		/*
		 * 先完成一个拦截器
		 * 在完成责任链
		 * 
		 * 
		 * 	实现一个拦截器
		 * 		代理工具
		 * 			真实对象的绑定，同时匹配对应的拦截器
		 * 		拦截器接口
		 * 			三个方法
		 * 		拦截器实现
		 * 			三个方法
		 * 		测试类
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
		 * 得到代理工具
		 * 		使用代理工具绑定真实对象，并制定拦截器，得到代理对象
		 * 		使用代理对象调用拦截器和真实对象的函数
		 * 
		 * 
		 * */
		AgentTool agentTool = new AgentTool();
		Print print = (Print) agentTool.bind(new PrintImpl(), "com.test.dynamicAgent.agentChain2.Interceptor2");
		Print print2 = (Print) agentTool.bind(print, "com.test.dynamicAgent.agentChain2.Interceptor1");
		print2.printString("这是责任链的一次测试");
		
		
		
	}
}
