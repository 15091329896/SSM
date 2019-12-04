package com.test.dynamicAgent.interceptor;

import java.lang.reflect.Method;

public class InterceptorImpl1 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("代理逻辑前置处理");
		return false;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("代理逻辑前置处理失败的备用处理方案");
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("代理逻辑后置处理，执行不受前置处理执行结果的影响");
	}

}
