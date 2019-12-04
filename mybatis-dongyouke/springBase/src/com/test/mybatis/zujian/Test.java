package com.test.mybatis.zujian;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) {
		/*
		 * 得到sqlSessionFactory
		 * 		为什么要得到SQLSessionFactory
		 * 		为了得到SQLSession
		 * 		为什么要得到SQLSession
		 * 		为了执行SQL
		 * 		为什么执行sql
		 * 		为了把数据写进数据库里和把数据库中的数据取出来
		 * 		数据库是通过sql来控制的
		 * 		什么是SQLSessionFactory
		 * 		就是专门用来管理SQLSession对象创建的一个类
		 * 		为什么要有一个类专门管理SQLSession对象的创建
		 * 		因为SQLSession对象的创建需要的信息非常多，直接创建SQLSession对象出错率较为高，通过一个类来专门管理SQLSession对象的创建
		 * 		能够降低SQLSession对象的创建的出错率
		 * 		sqlSession是一个接口，下面有非常多的实现类
		 * 		根据不同的参数创建不同的SQLSession实现类较为复杂
		 * 		于是通过一个类SQLSessionFactory专门负责SQLSession这个接口下的众多的实现类的对象的创建，只需要填入一定的参数，就可以创建对应的SQLSession接口的对象，具体的众多SQLSession
		 * 		对象的创建过程由SQLSessionFactory根据参数信息进行匹配
		 * 		为什么要是用工厂模式
		 * 		为了实现众多不同类型对象的创建，这些不同类型的对象在逻辑上属于一个大类，这个大类可以通过接口来表示
		 * 		工厂模式是为了通过一个类专门管理一个接口下众多的实现类的创建过程，通过这个专门创建对象的类来完成根据参数的匹配不同实现类对象的任务
		 * 	
		 * 
		 * 得到SQLSessionFactory
		 * 		首先定义基础配置文件
		 * 		将配置文件加载到输入流中
		 * 		得到SQLSessionFactoryBuilder对象
		 * 		通过Builder对象根据配置数据建造出SQLSessionFactory对象
		 * 
		 * 		
		 * 
		 * 
		 * 
		 * 
		 * */
		
		SqlSessionFactory factory = new Test().getSQLSessionFactory();
		
		if(factory != null) {
			
			System.out.println(factory.toString());
		}
	}

	private SqlSessionFactory getSQLSessionFactory() {
		/*
		 * 将配置数据加载到流中
		 * 		使用资源加载类进行加载
		 * 得到Builder对象
		 * 得到SQLSession对象
		 * 
		 * */
		
		SqlSessionFactory factory = null;
		try {
			String configFileAddress = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(configFileAddress);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return factory;
	}
	
	
	
	
}
