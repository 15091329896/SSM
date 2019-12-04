package com.test.mybatis.jdbc连接数据库;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Test {
	
	
	public static void main(String[] args) {
		
//		new Test().getBookByID();
		new Test().changeBook();
		
		
	}

	private void changeBook() {
		String sql = "insert into book values(1003, '精神现象学');";
//		String sql = "delete from book where id = 1003;";
		int row = JDBCUtil.execute(sql);
		System.out.println(row + "行返回");
		
		
		
	}

	private void getBookByID() {
		String sql = "select * from book";
		ResultSet executeQuery = JDBCUtil.executeQuery(sql);
		Book book = null;
		try {
			while (executeQuery.next()) {
				int id = executeQuery.getInt("id");
				String name = executeQuery.getString("name");
				book = new Book(id, name);
				System.out.println(book.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		JDBCUtil.close();
	}
}
