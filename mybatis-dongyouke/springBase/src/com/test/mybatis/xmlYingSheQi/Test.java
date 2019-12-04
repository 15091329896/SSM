package com.test.mybatis.xmlYingSheQi;

import org.apache.ibatis.session.SqlSession;

public class Test {
	public static void main(String[] args) {
		/*
		 * �õ�SQLSession
		 * 		�õ�SQLSessionFactory
		 * 			
		 * 
		 * 
		 * ͨ��SQLSession�õ�BookMapper��ʵ��
		 * Ȼ��ִ�в�ѯ
		 * 
		 * */
		SqlSession sqlSession = SQLSessionUtil.getSqlSession();
		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		Book book = bookMapper.getBook(1001);
		System.out.println(book.toString());
		
	}
}
