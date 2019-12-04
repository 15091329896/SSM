package com.test.dynamicAgent.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibAgentTool implements MethodInterceptor{

	
	
	@Override
	public Object intercept(Object proxy, Method arg1, Object[] args, MethodProxy methodProxy) throws Throwable {
		/*
		 *在拦截器中设置代理逻辑
		 *	在函数代理对象执行函数的前后设置
		 * 
		 * 
		 * */
		System.out.println("代理逻辑前置处理");
		Object invoke = methodProxy.invokeSuper(proxy, args);
		System.out.println("代理逻辑后置处理");
		return invoke;
	}

	public Object bind(Object object) {
		/*
		 * 	绑定真实对象到代理对象上
		 * 		得到增强器
		 * 		设置要增强的类型-被代理的类型
		 * 		设置增强器的回调对象为当前代理工具
		 * 		生成代理对象
		 * 
		 * */
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
}
