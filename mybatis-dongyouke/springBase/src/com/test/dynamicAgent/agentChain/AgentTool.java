package com.test.dynamicAgent.agentChain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentTool implements InvocationHandler {
	private Object realObject;
	private String interceptorClassName;

	
	
	
	public AgentTool() {
		super();
	}

	public AgentTool(Object realObject, String interceptorClassName) {
		super();
		this.realObject = realObject;
		this.interceptorClassName = interceptorClassName;
	}

	public Object bind(Object realObject, String interceptorClassName) {
		this.realObject = realObject;
		this.interceptorClassName = interceptorClassName;
		Class<Object> realClass = (Class<Object>) realObject.getClass();
		ClassLoader loader = realClass.getClassLoader();
		Class<Object>[] interfaces = (Class<Object>[]) realClass.getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, new AgentTool(realObject, interceptorClassName));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * 根据传入的烂机器的类名反射实例，调用响应的代理逻辑
		 * 
		 * */
		
		if(interceptorClassName == null) {
			return method.invoke(realObject, args);
		}
		Object result = null;
		Interceptor interceptor = (Interceptor) Class.forName(interceptorClassName).newInstance();
		if(interceptor.before(proxy, realObject, method, args)) {
			result = method.invoke(realObject, args);
		} else {
			interceptor.around(proxy, realObject, method, args);
		}
		interceptor.after(proxy, realObject, method, args);
		return result;
	}

	public Object getRealObject() {
		return realObject;
	}

	public void setRealObject(Object realObject) {
		this.realObject = realObject;
	}

	public String getInterceptorClassName() {
		return interceptorClassName;
	}

	public void setInterceptorClassName(String interceptorClassName) {
		this.interceptorClassName = interceptorClassName;
	}

}
