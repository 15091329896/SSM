package com.test.dynamicAgent.cglib;

import com.test.modul.Book;

public class CGLIBAgentTest {
	/*
	 * CGLIB进行动态代理
	 * 		目的，在访问真实对象之前加入代理前置处理或则代理后置处理
	 * 		需要一个代理工具类-实现函数拦截器接口
	 * 			
	 * 			完成代理对象的生成
	 * 				传入真实对象的字节码
	 * 				得到增强器
	 * 				设置增强的类型就是当前传入的真实对象的类型
	 * 				设置当前的代理工具就是回调对象
	 * 				生成代理对象
	 * 			实现代理逻辑
	 * 				在函数代理对象执行函数的前后添加代理逻辑
	 * 				返回执行完成后的结果对象
	 * */
	
	public static void main(String[] args) {
//		new CGLIBAgentTest().cglibAgent();
//		new CGLIBAgentTest().cglibAgent2();
		new CGLIBAgentTest().cglibAgent3();
		System.exit(0);
	}

	private void cglibAgent3() {
		/*
		 * cglib动态代理
		 * 		需要代理工具
		 * 		需要一个非抽象类
		 * 		通过代理工具绑定真实对象到代理对象
		 * 		通过代理对象执行代理逻辑和真实对象的函数
		 * 
		 * 
		 * */
		
		CglibAgentTool2 agentTool = new CglibAgentTool2();
		Book book = (Book) agentTool.bind(new Book());
		book.printString("这是动态代理执行的函数");
		
		
	}

	private void cglibAgent2() {
		/*
		 * cglib动态代理
		 * 		创建非抽象类
		 * 		创建代理工具类
		 * 		在主类中创建代理工具
		 * 		通过代理工具绑定真实对象到代理对象上
		 * 		通过代理对象执行真实对象的函数
		 * */
		
		CglibAgentTool cglibAgentTool = new CglibAgentTool();
		Book book = (Book) cglibAgentTool.bind(new Book());
		book.printString("这是cglib动态代理实现的方法调用");
		
		
	}

	private void cglibAgent() {
		/*
		 * cglib动态代理
		 * 		在访问真实对象之前添加处理逻辑
		 * 		不需要接口，只需要一个普通的类
		 * 		需要代理工具类-实现函数拦截器接口
		 * 			生成代理对象
		 * 				得到增强器
		 * 				设置增强类型就是当前传入的真实对象的类型
		 * 				设置当前的代理工具类就是回调对象
		 * 				生成代理对象
		 * 			添加代理逻辑
		 * 				在函数代理对象执行函数前后添加代理逻辑
		 * 				返回函数执行之后生成的结果对象
		 * 		生成代理工具
		 * 		通过代理工具得到代理对象，需要插入被代理类的类型
		 * 		通过代理对象执行真实对象的函数
		 *		 
		 * 
		 * 
		 * 
		 * */
		
		CglibProxyTool cglibAgentTool = new CglibProxyTool();
		Book book = (Book) cglibAgentTool.bind(new Book());
		book.printString("这是cglib动态代理");
	}
	
}
