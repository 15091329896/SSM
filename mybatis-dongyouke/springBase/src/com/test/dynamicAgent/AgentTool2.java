package com.test.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentTool2 implements InvocationHandler{

	private Object realObject;

	public Object bind(Object realObject) {
		/*
		 * ʵ�ִ����������ɺ���ʵ����İ�
		 * 		��ʵ���������������ӿڣ���ǰ�Ĵ�������Ķ���
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
		 * ʵ�ִ����߼�
		 * 		��ִ����ʵ������ǰ���������߼�
		 * 
		 * */
		System.out.println("�����߼�ǰ�ô���");
		Object invoke = method.invoke(realObject, args);
		System.out.println("�����߼����ô���");
		return invoke;
	}
	
}
