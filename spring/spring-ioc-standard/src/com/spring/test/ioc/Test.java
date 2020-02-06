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
		 * 如何使用IOC 定义普通java类，两个，且存在依赖关系 创建配置文件，定义依赖信息 使用IOC容器创建对象 根据配置信息创建容器
		 * 通过容器，根据类型ID创建对应的对象 通过得到的对象调用它自己的函数 关闭容器
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
