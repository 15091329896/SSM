package com.test.dynamicAgent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentTool3  implements InvocationHandler{
	
	
	private Object realObject;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * �ڷ���ִ��ǰ���������߼�
		 * 		
		 * 
		 * 
		 * */
		System.out.println("�����߼�ǰ�ô���");
		Object invoke = method.invoke(realObject, args);
		System.out.println("�����߼����ô���");
		return invoke;
	}

	public Object bind(Object realObject) {
		/*
		 * ���ɴ�������Ұ���ʵ����
		 * 		���ɴ������
		 * 		ͨ����ʵ������ֽ������������������ͽӿڣ��͵�ǰ�Ĵ����������һ����ɴ����������ɺ���ʵ����İ�
		 * 		�õ�������ʵ����֮��Ĵ������
		 * 		
		 * 
		 * */
		this.realObject = realObject;
		Class<Object> realClass = (Class<Object>) realObject.getClass();
		ClassLoader loader = realClass.getClassLoader();
		Class<?>[] interfaces = realClass.getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}

}
