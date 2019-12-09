package com.test.mybatis.xmlYingSheQi3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil3 {

	private static SqlSessionFactoryBuilder builder = null;
	private static SqlSessionFactory factory = null;
	private static SqlSession sqlSession = null;

	private SqlSessionUtil3() {
	}

	public static SqlSession getSqlsession() {
		if (sqlSession == null) {
			getFactory();
			sqlSession = factory.openSession();
		}
		return sqlSession;
	}

	private static void getFactory() {
		try {
			if (factory == null) {
				getBuilder();
				String congifPath = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(congifPath);
				factory = builder.build(inputStream);
				closeBuilder();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private static void closeBuilder() {
		if (builder != null) {
			builder = null;
		}
	}

	private static void getBuilder() {
		if (builder == null) {
			builder = new SqlSessionFactoryBuilder();
		}
	}

}
