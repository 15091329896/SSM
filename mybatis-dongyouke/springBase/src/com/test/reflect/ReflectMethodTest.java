package com.test.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethodTest {
	public static void main(String[] args) {
		/*
		 * 反射方法
		 * 		
		 * 		得到类的字节码对象
		 * 		使用这个字节码对象反射出方法对象，需要传入方法名和方法参数类型
		 * 		反射得到实例对象
		 * 		使用方法对象根据实例对象和方法参数执行这个方法
		 * 
		 * */
		String className = "com.test.modul.Book";
		String methodName = "print";
		new ReflectMethodTest().reflectMethod4(className, methodName);
		
	}

	private void reflectMethod4(String className, String methodName) {
		/*
		 * 反射方法
		 * 		先发射生成对象
		 * 		通过对象再反射方法对象
		 * 		通过方法对象运行被反射的方法
		 * 
		 * */
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Object object = getInstance(classObject);
			Method method = getMethod(object, methodName);
			method.invoke(object, "这是通过反射调用的函数");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private Object getInstance(Class<Object> classObject) {
		try {
			return classObject.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private Method getMethod(Object object, String methodName) {
		try {
			return object.getClass().getMethod(methodName, String.class);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void reflectMethod3(String className, String methodName) {
		/*
		 * 反射函数
		 * 		得到字节码对象
		 * 		得到实例对象
		 * 		得到函数对象
		 * 		通过函数对象根据实例对象和参数调用指定的函数
		 * */
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Object object = getInstance(classObject);
			Method method = getMethod(classObject, methodName);
			method.invoke(object, "这是通过反射运行的函数");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	private Method getMethod(Class<Object> classObject, String methodName) {
		try {
			return classObject.getMethod(methodName, String.class);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}



	private void reflectMethod2(String className, String methodName) {
		/*
		 * 反射函数
		 * 		得到字节码对象
		 * 		使用字节码对象反射得到指定的函数对象
		 * 		通过字节码对象得到实例对象
		 * 		通过函数对象根据实例对象和函数的参数调用指定的函数
		 * 
		 * */
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Object object = classObject.newInstance();
			Method method = classObject.getMethod("printHello");
			method.invoke(object);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private void reflectMethod(String className, String methodName) {
		/*
		 * 反射方法
		 * 		
		 * 		得到类的字节码对象
		 * 		使用这个字节码对象反射出方法对象，需要传入方法名和方法参数类型
		 * 		反射得到实例对象
		 * 		使用方法对象根据实例对象和方法参数执行这个方法
		 * 
		 * */
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Method method = classObject.getMethod(methodName);
			Object object = getInstance(className);
			method.invoke(object);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

	private Object getInstance(String className) {
		/*
		 * 字节码对象
		 * 实例对象
		 * */
		Object object = null;
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			object = classObject.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return object;
	}
}
