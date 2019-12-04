package com.test.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkAgentTool implements InvocationHandler {
	
	private Object realObject;
	
	public Object bind(Object realObject) {
		/*
		 * 绑定真实对象和代理对象
		 * 		为真实对象的全局变量赋值
		 * 		得到真实对象的字节码对象
		 * 		使用Proxy类的代理对象生成方法根据真实字节码对象得到类加载器和接口对象以及代理工具类对象生成代理对象，此时生成代理对象的同时已经完成了将真实对象绑定在代理对象之上的任务	
		 * 
		 * */
		this.realObject = realObject;
		Class<Object> realObjectclass = (Class<Object>) realObject.getClass();
		return Proxy.newProxyInstance(realObjectclass.getClassLoader(), realObjectclass.getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * 添加代理逻辑
		 * 		在执行真实对象函数之前和之后添加代理逻辑
		 * 		通过method对象执行真实对象函数，同时传入真实对象
		 * 
		 * 
		 * 
		 * */
		System.out.println("前置处理");
		Object invoke = method.invoke(realObject, args);
		System.out.println("后置处理");
		return invoke;
	}
	
}
