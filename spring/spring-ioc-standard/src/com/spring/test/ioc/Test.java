package com.spring.test.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.bean.JuiceMakerIOC;
import com.spring.test.bean.Source;
import com.spring.test.common.JuiceMaker;

public class Test {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * */
		
		
		new Test().testIOC();

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
		
		
		
		Source source = (Source) context.getBean("source");
		System.out.println(source.toString());
		
		
		
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
