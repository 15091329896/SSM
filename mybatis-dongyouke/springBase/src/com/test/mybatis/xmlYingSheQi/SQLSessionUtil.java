package com.test.mybatis.xmlYingSheQi;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionUtil {
	/*
	 * �õ�SQLSession �õ�SQLSessionFactory �õ�SQLSession
	 */

	private static SqlSession sqlSession = null;

	private SQLSessionUtil() {

	}

	public static SqlSession getSqlSession(){
		if(sqlSession == null) {
			SqlSessionFactory factory = getSqlSessionFactory();
			sqlSession = factory.openSession();
		}
		return sqlSession;
	}

	private static SqlSessionFactory getSqlSessionFactory() {
		/*
		 * ���������ļ�
		 * ͨ��Builder���󴴽�factory
		 * 
		 * */
		
		try {
			String configFilePath = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(configFilePath);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(inputStream);
			return factory;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
