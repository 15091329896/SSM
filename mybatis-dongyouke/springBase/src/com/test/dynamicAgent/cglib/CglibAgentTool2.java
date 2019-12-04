package com.test.dynamicAgent.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibAgentTool2 implements MethodInterceptor{

	@Override
	public Object intercept(Object proxy, Method arg1, Object[] args, MethodProxy methodProxy) throws Throwable {
		/*
		 * ��Ӵ����߼�
		 * 		�ں������ض���ִ�к�����ǰ�����
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * */
		
		System.out.println("���Ǵ����߼���ǰ�ô���");
		Object invoke = methodProxy.invokeSuper(proxy, args);
		System.out.println("���Ǵ����߼��ĺ��ô���");
		return invoke;
	}

	public Object bind(Object realObject) {
		/*
		 * ����ʵ���󵽴������
		 * 		�õ���ǿ��
		 * 		������ǿ����
		 * 		������ǿ�ص�����Ϊ��ǰ�Ĵ����߶���
		 * 		�����������
		 * */
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(realObject.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	

}
