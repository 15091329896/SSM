package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.test.modul.Book;

public class ReflectTest1 {
	/*
	 * ͨ���������ɶ��� 
	 * 		�õ�Ҫ���ɶ�����ֽ������ 
	 * 		Ȼ��ͨ���ֽ������������������ʵ��
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String className = "com.test.modul.Book";
		Object object = null;
//		object = new ReflectTest1().getInstance(className);
//		object = new ReflectTest1().getInstance4(className, "�����");
		object = new ReflectTest1().getInstance5(className, 1001);
		Book book = (Book) object;
		System.out.println(book.toString());

	}

	private Object getInstance5(String className, int bookId) {
		/*
		 * ����������Ĺ��캯������ʵ��
		 * 		�õ��ֽ������
		 * 		���ݹ��캯���Ĳ������͵õ����캯������
		 * 		��������õ�ʵ��
		 * */
		
		
		Object object = null;
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Constructor<Object> constructor = classObject.getConstructor(Integer.class);
			object = constructor.newInstance(bookId);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return object;
	}

	private Object getInstance4(String className, String bookName) {
		/*
		 *  ����������Ĺ��췽�����ɳ�ʼ��֮���ʵ��
		 *  	�õ��ֽ���
		 *  	ʹ�õõ����ֽ��������ݹ��캯���Ĳ��������ͺ�˳�������Ӧ�Ĺ��캯������
		 *  	ʹ��������캯������ͨ���������ֵ������������ʵ��
		 *   
		 *   
		 * */
		
		Object object = null;
		try {
			Class<Object> classObject = (Class<Object>) Class.forName(className);
			Constructor<Object> constructor = classObject.getConstructor(String.class);
			object = constructor.newInstance(bookName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return object;
	}

	private Object getInstance(String className) {
		/*
		 * ���䴴������ 
		 * 		�õ��ֽ������ 
		 * 		ͨ���ֽ������õ�ʵ��
		 * 
		 */
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

	private Object getInstance3(String className) {
		/*
		 * ��������� �õ��ֽ����ļ� ͨ���ֽ����ļ��õ�ʵ��
		 * 
		 */
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

	private Object getInstance2(String className) {
		/*
		 * ͨ���������ɶ��� �õ��ֽ������ ͨ���ֽ����������ʵ��
		 * 
		 */

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
