package com.test.dynamicAgent.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyTool implements MethodInterceptor{



	public Object bind(Object realObject) {
		
		 /* ����ʵ����ʹ������
		 * 
		 * 		�õ���ǿ��
		 * 		������ǿ������(���Ǵ��������)
		 * 		���õ�ǰ�����߾��ǻص�����
		 * 		���ɴ������
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
		 * ������������Ӵ����߼�
		 * 		�ں����������ִ�к���ǰ����Ӵ����߼�
		 * 
		 * 
		*/
		System.out.println("�����߼�ǰ�ô���");
		Object invoke = methodProxy.invokeSuper(proxy, args);
		System.out.println("�����߼����ô���");
		return invoke;
	}
	
}




