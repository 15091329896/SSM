package com.test.dynamicAgent.interceptor;

import java.lang.reflect.Method;

public class InterceptorImpl1 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("�����߼�ǰ�ô���");
		return false;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("�����߼�ǰ�ô���ʧ�ܵı��ô�����");
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("�����߼����ô���ִ�в���ǰ�ô���ִ�н����Ӱ��");
	}

}
