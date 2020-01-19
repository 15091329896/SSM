package com.spring.test.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.bean.BeanConfig;
import com.spring.test.bean.Role;
import com.spring.test.bean.TestAnnoIOCBean;
import com.spring.test.common.JuiceMaker;

public class Test {
	public static void main(String[] args) {


		/*
		 * 装配数据到集合属性中
		 * */
		
//		new Test().testIOC();
		new Test().testAnnoIOC();
	}

	
	



	private void testAnnoIOC() {
		/*
		 * 通过注解注入
		 * 		在pojo中使用注解
		 * 		定义注解扫描器类，必须和使用注解注入的bean在同一个包下，否则无法扫描
		 * 		定义注解注入容器生成对象
		 * */
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TestAnnoIOCBean iocBean = (TestAnnoIOCBean) context.getBean("TestAnnoIOCBean");
		System.out.println(iocBean.toString());
	}






	private void testIOC() {
		/*
		 * 
		 * 如何使用IOC 定义普通java类，两个，且存在依赖关系 创建配置文件，定义依赖信息 使用IOC容器创建对象 根据配置信息创建容器
		 * 通过容器，根据类型ID创建对应的对象 通过得到的对象调用它自己的函数 关闭容器
		 */

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-ioc.xml");
		
		System.out.println("\n");
		Role  role = (Role) context.getBean("role3");
		System.out.println(role.toString());
		Role  role2 = (Role) context.getBean("role4");
		System.out.println(role2.toString());
		System.out.println("\n");
		
		
		
		context.close();
	}
	
	private void testCommon() {
		JuiceMaker juiceMaker = new JuiceMaker();
		juiceMaker.setWater("矿泉水");
		juiceMaker.setFruit("橙子");
		juiceMaker.setSugar("少糖");
		System.out.println(juiceMaker.makeJuice());
	}

}
