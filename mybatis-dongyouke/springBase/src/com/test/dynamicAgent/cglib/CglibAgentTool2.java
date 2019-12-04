package com.test.dynamicAgent.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibAgentTool2 implements MethodInterceptor{

	@Override
	public Object intercept(Object proxy, Method arg1, Object[] args, MethodProxy methodProxy) throws Throwable {
		/*
		 * 添加代理逻辑
		 * 		在函数拦截对象执行函数的前后添加
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * */
		
		System.out.println("这是代理逻辑的前置处理");
		Object invoke = methodProxy.invokeSuper(proxy, args);
		System.out.println("这是代理逻辑的后置处理");
		return invoke;
	}

	public Object bind(Object realObject) {
		/*
		 * 绑定真实对象到代理对象
		 * 		得到增强器
		 * 		设置增强类型
		 * 		设置增强回调对象为当前的代理工具对象
		 * 		产生代理对象
		 * */
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(realObject.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	

}
