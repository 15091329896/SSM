package com.test.dynamicAgent.agentChain;

import java.lang.reflect.Method;

public class InterceptorRenShi implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("�������������");
		return true;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("��������ʧ��");
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("�����������ô���");
	}

}
