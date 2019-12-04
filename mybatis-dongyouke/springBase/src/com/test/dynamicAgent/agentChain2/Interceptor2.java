package com.test.dynamicAgent.agentChain2;

import java.lang.reflect.Method;

public class Interceptor2 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("������2��ǰ�ô���");
		return true;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("������2��ǰ�ô���ʧ��");
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("������2�ĺ��ô���");
	}

}
