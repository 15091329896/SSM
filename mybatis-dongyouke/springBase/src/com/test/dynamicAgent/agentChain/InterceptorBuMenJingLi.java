package com.test.dynamicAgent.agentChain;

import java.lang.reflect.Method;

public class InterceptorBuMenJingLi implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("���ž������������");
		return true;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("���ž�������ʧ��");
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("���ž����������ô���");
	}

}
