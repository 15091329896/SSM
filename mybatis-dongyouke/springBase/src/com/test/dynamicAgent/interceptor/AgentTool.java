package com.test.dynamicAgent.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 *
 */
public class AgentTool implements InvocationHandler{

	private Object realObject;
	private String interceptClassNameString;
	
	public Object getRealObject() {
		return realObject;
	}

	public void setRealObject(Object realObject) {
		this.realObject = realObject;
	}

	public String getInterceptClassNameString() {
		return interceptClassNameString;
	}

	public void setInterceptClassNameString(String interceptClassNameString) {
		this.interceptClassNameString = interceptClassNameString;
	}

	public AgentTool() {
		super();
	}

	public AgentTool(String interceptClassNameString) {
		super();
		this.interceptClassNameString = interceptClassNameString;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		/*
		 * 将拦截器中的代理逻辑有序地添加在函数执行前后
		 * 
		 * */
		
		if(interceptClassNameString == null) {
			
			return method.invoke(proxy, args);
		}
		Class<Object> interceptClass = (Class<Object>) Class.forName(interceptClassNameString);
		Interceptor interceptor = (Interceptor) interceptClass.newInstance();
		Object result = null;
		if(interceptor.before(proxy, interceptor, method, args)) {
			result = method.invoke(proxy, args);
		} else {
			interceptor.around(proxy, interceptor, method, args);
		}
		interceptor.after(proxy, interceptor, method, args);
		return result;
	}

	public Object bind(Object realObject) {
		/*
		 * 绑定真实对象到代理对象上面来
		 * 		得到真实对象的类加载器
		 * 		得到真实对象的接口
		 * 		传入当前的代理工具
		 * */
		this.realObject = realObject;
		Class<Object> realClass = (Class<Object>) realObject.getClass();
		ClassLoader loader = realClass.getClassLoader();
		Class<Object>[] interfaces = (Class<Object>[]) realClass.getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this) ;
	}

}
