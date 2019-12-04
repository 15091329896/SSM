package com.test.dynamicAgent.interceptor;

public class Test {
	public static void main(String[] args) {
		/*
		 * 将代理逻辑放入拦截器中进行集中管理
		 * 		首先定义拦截器
		 * 			就是定义代理逻辑
		 * 			定义代理逻辑前置处理，后置处理，以及前置处理执行失败之后的备用处理
		 * 		定义代理工具
		 * 		使用代理工具进行真实对象的绑定
		 * 		使用代理对象执行真实对象的方法，此时拦截器就会开始工作
		 * */
		
		new Test().jdkIntecepter();
		
	}

	private void jdkIntecepter() {
		AgentTool agentTool = new AgentTool("com.test.dynamicAgent.interceptor.InterceptorImpl1");
		//注意此处的左边必须是接口形式，类转换的时候也只能是接口类型，如果是实现类变量接收会导致类转换失败，得不到实现类的接口对象
		Print print = (Print) agentTool.bind(new PrintImpl());
		print.printString("这是使用了拦截器将代理逻辑集中管理的动态代理示例");
	}
}
