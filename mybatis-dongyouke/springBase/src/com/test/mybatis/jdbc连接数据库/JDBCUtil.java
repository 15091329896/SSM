package com.test.mybatis.jdbc连接数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	/*
	 * 连接数据库 执行sql
	 * 
	 */

	private static String url = "jdbc:mysql://localhost:3306/tmptest?serverTimezone=UTC";
	private static String username = "root";
	private static String password = "root";
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	private JDBCUtil() {
	}

	public static Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(url, username, password);// 连接数据库
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return connection;
	}

	public static Statement getStatement(Connection connection) {
		if (statement == null) {
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return statement;
	}

	public static ResultSet executeQuery(String sql) {
		connection = getConnection();
		statement = getStatement(connection);
		try {
			resultSet = statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return resultSet;
	}
	
	
	
	public static int execute(String sql) {
		connection = getConnection();
		statement = getStatement(connection);
		try {
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return -1;
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 关闭执行方法
	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 关闭连接
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		closeConnection(connection);
		closeResultSet(resultSet);
		closeStatement(statement);
	}

}
