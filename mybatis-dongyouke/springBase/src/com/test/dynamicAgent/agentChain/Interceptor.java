package com.test.dynamicAgent.agentChain;

import java.lang.reflect.Method;

public interface Interceptor {
	public boolean before(Object proxy, Object realObject, Method method, Object[] args);

	public void around(Object proxy, Object realObject, Method method, Object[] args);

	public void after(Object proxy, Object realObject, Method method, Object[] args);
}
