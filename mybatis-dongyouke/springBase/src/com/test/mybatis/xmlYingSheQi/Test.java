package com.test.mybatis.xmlYingSheQi;

import org.apache.ibatis.session.SqlSession;

public class Test {
	public static void main(String[] args) {
		/*
		 * 得到SQLSession
		 * 		得到SQLSessionFactory
		 * 			
		 * 
		 * 
		 * 通过SQLSession得到BookMapper的实例
		 * 然后执行查询
		 * 
		 * */
		SqlSession sqlSession = SQLSessionUtil.getSqlSession();
		BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
		Book book = bookMapper.getBook(1001);
		System.out.println(book.toString());
		
	}
}
