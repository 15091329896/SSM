package com.test.mybatis.zujian;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) {
		/*
		 * �õ�sqlSessionFactory
		 * 		ΪʲôҪ�õ�SQLSessionFactory
		 * 		Ϊ�˵õ�SQLSession
		 * 		ΪʲôҪ�õ�SQLSession
		 * 		Ϊ��ִ��SQL
		 * 		Ϊʲôִ��sql
		 * 		Ϊ�˰�����д�����ݿ���Ͱ����ݿ��е�����ȡ����
		 * 		���ݿ���ͨ��sql�����Ƶ�
		 * 		ʲô��SQLSessionFactory
		 * 		����ר����������SQLSession���󴴽���һ����
		 * 		ΪʲôҪ��һ����ר�Ź���SQLSession����Ĵ���
		 * 		��ΪSQLSession����Ĵ�����Ҫ����Ϣ�ǳ��ֱ࣬�Ӵ���SQLSession��������ʽ�Ϊ�ߣ�ͨ��һ������ר�Ź���SQLSession����Ĵ���
		 * 		�ܹ�����SQLSession����Ĵ����ĳ�����
		 * 		sqlSession��һ���ӿڣ������зǳ����ʵ����
		 * 		���ݲ�ͬ�Ĳ���������ͬ��SQLSessionʵ�����Ϊ����
		 * 		����ͨ��һ����SQLSessionFactoryר�Ÿ���SQLSession����ӿ��µ��ڶ��ʵ����Ķ���Ĵ�����ֻ��Ҫ����һ���Ĳ������Ϳ��Դ�����Ӧ��SQLSession�ӿڵĶ��󣬾�����ڶ�SQLSession
		 * 		����Ĵ���������SQLSessionFactory���ݲ�����Ϣ����ƥ��
		 * 		ΪʲôҪ���ù���ģʽ
		 * 		Ϊ��ʵ���ڶ಻ͬ���Ͷ���Ĵ�������Щ��ͬ���͵Ķ������߼�������һ�����࣬����������ͨ���ӿ�����ʾ
		 * 		����ģʽ��Ϊ��ͨ��һ����ר�Ź���һ���ӿ����ڶ��ʵ����Ĵ������̣�ͨ�����ר�Ŵ��������������ɸ��ݲ�����ƥ�䲻ͬʵ������������
		 * 	
		 * 
		 * �õ�SQLSessionFactory
		 * 		���ȶ�����������ļ�
		 * 		�������ļ����ص���������
		 * 		�õ�SQLSessionFactoryBuilder����
		 * 		ͨ��Builder��������������ݽ����SQLSessionFactory����
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
		 * ���������ݼ��ص�����
		 * 		ʹ����Դ��������м���
		 * �õ�Builder����
		 * �õ�SQLSession����
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
