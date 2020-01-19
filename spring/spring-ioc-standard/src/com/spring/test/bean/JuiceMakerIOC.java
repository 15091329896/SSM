package com.spring.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JuiceMakerIOC implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
	private String yinLiaoShop = null;
	private Source source = null;

	public String makeJuice() {
		String juice = "����һ���ɣ�" + yinLiaoShop + "���ϵ꣬�ṩ��" + source.getSize() + source.getSugar() + source.getFruit();
		return juice;
	}

	public String getYinLiaoShop() {
		return yinLiaoShop;
	}

	public void setYinLiaoShop(String yinLiaoShop) {
		this.yinLiaoShop = yinLiaoShop;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public void init() {
		System.out.println(this.getClass().getSimpleName() + "ִ���Զ���ĳ�ʼ������");
	}
	
	public void destory() {
		System.out.println(this.getClass().getSimpleName() + "ִ���Զ�������ٷ���");
	}
	
	@Override
	public void setBeanName(String arg0) {

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("��" + this.getClass().getSimpleName() +
				"������InitializingBean�ӿڵ�afterPropertiesSet����");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println(
				this.getClass().getSimpleName() + "����ApplicationContextAware�ӿڵ�setApplicationContext����"
				);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(
				this.getClass().getSimpleName() + "����BeanFactoryAware�ӿڵ�setBeanFactory����"
				);
	}

}
