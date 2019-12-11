package com.test.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	private static SqlSessionFactoryBuilder builder = null;
	private static SqlSessionFactory factory = null;
	private static SqlSession sqlSession = null;

	public SqlSessionUtil() {
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

	public void closeMappper(Object mapper) {
		if(mapper != null) {
			mapper = null;
		}
	}
	
	public void closeSqlSession(SqlSession sqlSession) {
		if(sqlSession != null) {
			sqlSession.close();
		}
	}
}
