package com.test.dynamicAgent.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibAgentTool implements MethodInterceptor{

	
	
	@Override
	public Object intercept(Object proxy, Method arg1, Object[] args, MethodProxy methodProxy) throws Throwable {
		/*
		 *�������������ô����߼�
		 *	�ں����������ִ�к�����ǰ������
		 * 
		 * 
		 * */
		System.out.println("�����߼�ǰ�ô���");
		Object invoke = methodProxy.invokeSuper(proxy, args);
		System.out.println("�����߼����ô���");
		return invoke;
	}

	public Object bind(Object object) {
		/*
		 * 	����ʵ���󵽴��������
		 * 		�õ���ǿ��
		 * 		����Ҫ��ǿ������-�����������
		 * 		������ǿ���Ļص�����Ϊ��ǰ������
		 * 		���ɴ������
		 * 
		 * */
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
}
