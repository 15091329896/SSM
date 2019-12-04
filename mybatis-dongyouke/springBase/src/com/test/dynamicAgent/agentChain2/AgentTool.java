package com.test.dynamicAgent.agentChain2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentTool implements InvocationHandler{
	private Object realObject;
	private String interceptorNameString = null;

	/*
	 * ����ʵ����
	 * 
	 * */
	
	
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * ��Ӵ����߼������п��
		 * 
		 * */
		Interceptor interceptor = getInterceptor();
		Object invoke = null;
		if(interceptor.before(proxy, realObject, method, args)) {
			
			invoke = method.invoke(realObject, args);
			
		} else {
			interceptor.around(proxy, realObject, method, args);
			
		}
		interceptor.after(proxy, realObject, method, args);
		return invoke;
	}

	
	public AgentTool() {
		super();
	}


	public AgentTool(Object realObject, String interceptorNameString) {
		super();
		this.realObject = realObject;
		this.interceptorNameString = interceptorNameString;
	}

	private Interceptor getInterceptor() {
		if(interceptorNameString == null) {
			return null;
		}
		Interceptor interceptor = null;
		try {
			interceptor = (Interceptor) Class.forName(interceptorNameString).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return interceptor;
	}

	public Object bind(Object realObject, String interceptorNameString) {
		this.realObject = realObject;
		this.interceptorNameString = interceptorNameString;
		Class<?> realObjectClass = realObject.getClass();
		ClassLoader loader = realObjectClass.getClassLoader();
		Class<?>[] interfaces = realObjectClass.getInterfaces();
		//�������ĺ��ģ���ʱ�ĵ�������������Ĳ���this�������ǵ�ǰ����������ʵ����Ĵ����ߣ�����һ���յĴ�����
		//return Proxy.newProxyInstance(loader, interfaces, this);  ����
		return Proxy.newProxyInstance(loader, interfaces, new AgentTool(realObject, interceptorNameString));
	}

	
	
}
