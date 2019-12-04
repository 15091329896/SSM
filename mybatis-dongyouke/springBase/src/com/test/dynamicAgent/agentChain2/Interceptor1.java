package com.test.dynamicAgent.agentChain2;

import java.lang.reflect.Method;

public class Interceptor1 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("������1��ǰ�ô���");
		return true;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("������1��ǰ�ô���ʧ��");		
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("������1�ĺ��ô���");
	}

}
