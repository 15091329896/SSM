package com.test.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethodTest {
	public static void main(String[] args) {
		/*
		 * ���䷽��
		 * 		
		 * 		�õ�����ֽ������
		 * 		ʹ������ֽ�������������������Ҫ���뷽�����ͷ�����������
		 * 		����õ�ʵ������
		 * 		ʹ�÷����������ʵ������ͷ�������ִ���������
		 * 
		 * */
		String className = "com.test.modul.Book";
		String methodName = "print";
		new ReflectMethodTest().reflectMethod4(className, methodName);
		
	}

	private void reflectMethod4(String className, String methodName) {
		/*
		 * ���䷽��
		 * 		�ȷ������ɶ���
		 * 		ͨ�������ٷ��䷽������
		 * 		ͨ�������������б�����ķ���
		 * 
		 * */
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Object object = getInstance(classObject);
			Method method = getMethod(object, methodName);
			method.invoke(object, "����ͨ��������õĺ���");
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
		 * ���亯��
		 * 		�õ��ֽ������
		 * 		�õ�ʵ������
		 * 		�õ���������
		 * 		ͨ�������������ʵ������Ͳ�������ָ���ĺ���
		 * */
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Object object = getInstance(classObject);
			Method method = getMethod(classObject, methodName);
			method.invoke(object, "����ͨ���������еĺ���");
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
		 * ���亯��
		 * 		�õ��ֽ������
		 * 		ʹ���ֽ��������õ�ָ���ĺ�������
		 * 		ͨ���ֽ������õ�ʵ������
		 * 		ͨ�������������ʵ������ͺ����Ĳ�������ָ���ĺ���
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
		 * ���䷽��
		 * 		
		 * 		�õ�����ֽ������
		 * 		ʹ������ֽ�������������������Ҫ���뷽�����ͷ�����������
		 * 		����õ�ʵ������
		 * 		ʹ�÷����������ʵ������ͷ�������ִ���������
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
		 * �ֽ������
		 * ʵ������
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
