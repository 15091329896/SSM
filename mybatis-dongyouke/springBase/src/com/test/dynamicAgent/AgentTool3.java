package com.test.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentTool3  implements InvocationHandler{
	
	
	private Object realObject;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * 在方法执行前后加入代理逻辑
		 * 		
		 * 
		 * 
		 * */
		System.out.println("代理逻辑前置处理");
		Object invoke = method.invoke(realObject, args);
		System.out.println("代理逻辑后置处理");
		return invoke;
	}

	public Object bind(Object realObject) {
		/*
		 * 生成代理对象并且绑定真实对象
		 * 		生成代理对象
		 * 		通过真实对象的字节码对象生成类加载器和接口，和当前的代理工具类对象一起完成代理对象的生成和真实对象的绑定
		 * 		得到绑定了真实对象之后的代理对象
		 * 		
		 * 
		 * */
		this.realObject = realObject;
		Class<Object> realClass = (Class<Object>) realObject.getClass();
		ClassLoader loader = realClass.getClassLoader();
		Class<?>[] interfaces = realClass.getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}

}
