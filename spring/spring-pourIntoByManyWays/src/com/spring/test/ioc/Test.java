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
		 * װ�����ݵ�����������
		 * */
		
//		new Test().testIOC();
		new Test().testAnnoIOC();
	}

	
	



	private void testAnnoIOC() {
		/*
		 * ͨ��ע��ע��
		 * 		��pojo��ʹ��ע��
		 * 		����ע��ɨ�����࣬�����ʹ��ע��ע���bean��ͬһ�����£������޷�ɨ��
		 * 		����ע��ע���������ɶ���
		 * */
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TestAnnoIOCBean iocBean = (TestAnnoIOCBean) context.getBean("TestAnnoIOCBean");
		System.out.println(iocBean.toString());
	}






	private void testIOC() {
		/*
		 * 
		 * ���ʹ��IOC ������ͨjava�࣬�������Ҵ���������ϵ ���������ļ�������������Ϣ ʹ��IOC������������ ����������Ϣ��������
		 * ͨ����������������ID������Ӧ�Ķ��� ͨ���õ��Ķ���������Լ��ĺ��� �ر�����
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
		juiceMaker.setWater("��Ȫˮ");
		juiceMaker.setFruit("����");
		juiceMaker.setSugar("����");
		System.out.println(juiceMaker.makeJuice());
	}

}
