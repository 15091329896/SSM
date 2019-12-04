package com.test.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentTool2 implements InvocationHandler{

	private Object realObject;

	public Object bind(Object realObject) {
		/*
		 * 实现代理对象的生成和真实对象的绑定
		 * 		真实对象的类加载器，接口，当前的代理工具类的对象
		 * 
		 * 
		 * */
		this.realObject = realObject;
		Class<Object> realObjectClass = (Class<Object>) realObject.getClass();
		ClassLoader loader = realObjectClass.getClassLoader();
		Class<?>[] interfaces = realObjectClass.getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * 实现代理逻辑
		 * 		在执行真实函数的前后加入代理逻辑
		 * 
		 * */
		System.out.println("代理逻辑前置处理");
		Object invoke = method.invoke(realObject, args);
		System.out.println("代理逻辑后置处理");
		return invoke;
	}
	
}
