package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.test.modul.Book;

public class ReflectTest1 {
	/*
	 * 通过反射生成对象 
	 * 		得到要生成对象的字节码对象 
	 * 		然后通过字节码对象生成这个对象的实例
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String className = "com.test.modul.Book";
		Object object = null;
//		object = new ReflectTest1().getInstance(className);
//		object = new ReflectTest1().getInstance4(className, "理想国");
		object = new ReflectTest1().getInstance5(className, 1001);
		Book book = (Book) object;
		System.out.println(book.toString());

	}

	private Object getInstance5(String className, int bookId) {
		/*
		 * 反射带参数的构造函数生成实例
		 * 		得到字节码对象
		 * 		根据构造函数的参数类型得到构造函数对象
		 * 		传入参数得到实例
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
		 *  反射带参数的构造方法生成初始化之后的实例
		 *  	得到字节码
		 *  	使用得到的字节码对象根据构造函数的参数的类型和顺序反射出对应的构造函数对象
		 *  	使用这个构造函数对象通过传入参数值生成这个对象的实例
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
		 * 反射创建对象 
		 * 		得到字节码对象 
		 * 		通过字节码对象得到实例
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
		 * 反射出对象 得到字节码文件 通过字节码文件得到实例
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
		 * 通过反射生成对象 得到字节码对象 通过字节码对象生成实例
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
