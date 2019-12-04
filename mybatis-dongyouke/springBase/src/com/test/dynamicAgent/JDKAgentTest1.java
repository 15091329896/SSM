package com.test.dynamicAgent;

public class JDKAgentTest1 {
	public static void main(String[] args) {
		/*
		 * JDK动态代理
		 * 		生成代理工具
		 * 			使用代理工具生成代理对象，并将真实对象和代理对象绑定起来
		 * 			添加代理逻辑
		 * 		绑定真实对象和代理对象
		 * 		通过代理对象执行真实对象的函数
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
		 * jdk动态代理
		 * 		jdk实现动态代理
		 * 		需要一个借口，实现类，代理工具类
		 * 		代理工具中完成以下两个操作
		 * 			必须实现请求处理器接口
		 * 			生成并且代理对象，并且绑定真实对象，在方法调用点处添加代理逻辑
		 * 		开始操作
		 * 		得到代理工具
		 * 		生成代理对象并且绑定真实对象
		 * 		开始通过代理对象调用真实对象的函数
		 * 
		 * 			
		 * 	
		 * 
		 * */
		AgentTool3 agentTool = new AgentTool3();
		Print print = (Print) agentTool.bind(new PrintImpl());
		print.printString("这是通过动态代理实现方法调用");
		InterTest1 interTest1 = (InterTest1) agentTool.bind(new InterTest1Impl());
		interTest1.funcTest1("这是同一个代理工具代理的第二个对象");
	}

	private void jdkAgent2() {
		/*
		 * jdk动态代理的实现
		 * 		接口，实现类，实现方法
		 * 		代理工具类
		 * 			必须实现请求处理器接口
		 * 			在invoke函数中实现代理逻辑的追加
		 * 			绑定真实对象和代理对象
		 * 				得到真实对象的字节码对象
		 * 				根据字节码对象得到真实对象的类加载器和接口，同时传入当前的代理工具类对象
		 * 		得到代理工具类的对象
		 * 		通过代理工具实现代理对象的生成和真实对象的绑定
		 * 		通过代理对象执行真实对象的函数
		 *		 
		 *
		 *代理工具就是为所有的接口和实现类都可以添加同样的前置和后置处理的类，如果需要不同的代理逻辑，只需要使用对应的代理工具类即可
		 *
		 *
		 *
		 * */
		AgentTool2 agentTool = new AgentTool2();
		Print print = (Print) agentTool.bind(new PrintImpl());
		print.printString("这是通过动态代理实现的函数调用");
		print.printString2("这是第二个函数");
		InterTest1 interTest1 = (InterTest1) agentTool.bind(new InterTest1Impl());
		interTest1.funcTest1("这是代理工具处理的第二个类");
		
		
	}

	private void jdkAgent() {
		/*
		 * 得到代理工具
		 * 绑定真实对象和代理对象
		 * 通过代理对象执行真实对象的函数
		 * */
		
		JdkAgentTool agentTool = new JdkAgentTool();
		Print proxyObject = (Print) agentTool.bind(new PrintImpl());
		proxyObject.printString("这是真实对象中的函数");
		
		
		
	}
}
