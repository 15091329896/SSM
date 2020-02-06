package com.spring.test.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.bean.Book;
import com.spring.test.bean.User;
import com.spring.test.config.BeanConfig;

public class Test {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * */
		
		
		new Test().testIOC();

	}

	@SuppressWarnings("resource")
	private void testIOC() {
		/*
		 * 
		 * ���ʹ��IOC ������ͨjava�࣬�������Ҵ���������ϵ ���������ļ�������������Ϣ ʹ��IOC������������ ����������Ϣ��������
		 * ͨ����������������ID������Ӧ�Ķ��� ͨ���õ��Ķ���������Լ��ĺ��� �ر�����
		 */

		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		Book book = (Book) context.getBean("book");
		System.out.println(book.toString());
		
		context = new AnnotationConfigApplicationContext(BeanConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
		Book book2 = (Book) context.getBean("book2");
		System.out.println(book2.toString());
		Book book3 = (Book) context.getBean("book3");
		System.out.println(book3.toString());
		
	}
	

}
