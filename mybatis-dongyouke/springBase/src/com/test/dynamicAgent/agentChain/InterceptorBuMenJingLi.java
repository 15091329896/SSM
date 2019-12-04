package com.test.dynamicAgent.agentChain;

import java.lang.reflect.Method;

public class InterceptorBuMenJingLi implements Interceptor{

	@Override
	public boolean before(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("部门经理审批已完成");
		return true;
	}

	@Override
	public void around(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("部门经理审批失败");
	}

	@Override
	public void after(Object proxy, Object realObject, Method method, Object[] args) {
		System.out.println("部门经理审批后置处理");
	}

}
