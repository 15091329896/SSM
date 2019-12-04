package com.test.dynamicAgent.agentChain2;

import java.lang.reflect.Method;

public class Interceptor1 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("拦截器1的前置处理");
		return true;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("拦截器1的前置处理失败");		
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("拦截器1的后置处理");
	}

}
