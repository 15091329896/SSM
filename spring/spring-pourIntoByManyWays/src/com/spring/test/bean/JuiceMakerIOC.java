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
		String juice = "这是一杯由：" + yinLiaoShop + "饮料店，提供的" + source.getSize() + source.getSugar() + source.getFruit();
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
		System.out.println(this.getClass().getSimpleName() + "执行自定义的初始化方法");
	}
	
	public void destory() {
		System.out.println(this.getClass().getSimpleName() + "执行自定义的销毁方法");
	}
	
	@Override
	public void setBeanName(String arg0) {

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("【" + this.getClass().getSimpleName() +
				"】调用InitializingBean接口的afterPropertiesSet方法");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println(
				this.getClass().getSimpleName() + "调用ApplicationContextAware接口的setApplicationContext方法"
				);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println(
				this.getClass().getSimpleName() + "调用BeanFactoryAware接口的setBeanFactory方法"
				);
	}

}
