package com.test.dynamicAgent.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyTool implements MethodInterceptor{



	public Object bind(Object realObject) {
		
		 /* 绑定真实对象和代理对象
		 * 
		 * 		得到增强器
		 * 		设置增强的类型(就是代理的类型)
		 * 		设置当前代理工具就是回调对象
		 * 		生成代理对象
		 * 
		 * 
		 */
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(realObject.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object proxy, Method arg1, Object[] args, MethodProxy methodProxy) throws Throwable {
		/*
		 * 在拦截器中添加代理逻辑
		 * 		在函数代理对象执行函数前后添加代理逻辑
		 * 
		 * 
		*/
		System.out.println("代理逻辑前置处理");
		Object invoke = methodProxy.invokeSuper(proxy, args);
		System.out.println("代理逻辑后置处理");
		return invoke;
	}
	
}




