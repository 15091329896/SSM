package com.test.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkAgentTool implements InvocationHandler {
	
	private Object realObject;
	
	public Object bind(Object realObject) {
		/*
		 * ����ʵ����ʹ������
		 * 		Ϊ��ʵ�����ȫ�ֱ�����ֵ
		 * 		�õ���ʵ������ֽ������
		 * 		ʹ��Proxy��Ĵ���������ɷ���������ʵ�ֽ������õ���������ͽӿڶ����Լ���������������ɴ�����󣬴�ʱ���ɴ�������ͬʱ�Ѿ�����˽���ʵ������ڴ������֮�ϵ�����	
		 * 
		 * */
		this.realObject = realObject;
		Class<Object> realObjectclass = (Class<Object>) realObject.getClass();
		return Proxy.newProxyInstance(realObjectclass.getClassLoader(), realObjectclass.getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * ��Ӵ����߼�
		 * 		��ִ����ʵ������֮ǰ��֮����Ӵ����߼�
		 * 		ͨ��method����ִ����ʵ��������ͬʱ������ʵ����
		 * 
		 * 
		 * 
		 * */
		System.out.println("ǰ�ô���");
		Object invoke = method.invoke(realObject, args);
		System.out.println("���ô���");
		return invoke;
	}
	
}
