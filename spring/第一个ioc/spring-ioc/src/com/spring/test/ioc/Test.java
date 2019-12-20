package com.spring.test.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.common.JuiceMaker;

public class Test {
	public static void main(String[] args) {

//		new Test().testCommon();
		new Test().testIOC();

	}

	private void testIOC() {
		/*
		 * 
		 * ���ʹ��IOC ������ͨjava�࣬�������Ҵ���������ϵ ���������ļ�������������Ϣ ʹ��IOC������������ ����������Ϣ��������
		 * ͨ����������������ID������Ӧ�Ķ��� ͨ���õ��Ķ���������Լ��ĺ��� �ر�����
		 */

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-ioc.xml");
		JuiceMakerIOC juiceMakerIOC = (JuiceMakerIOC) context.getBean("juiceMakerIOC");
		System.out.println(juiceMakerIOC.makeJuice());
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
