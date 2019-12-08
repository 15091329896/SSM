package com.test.mybatis.mapper;

public interface ManageSqlSessionAndMapper {
	void fillSqlSession();
	
	void fillMapper();
	
	void fill();
	
	void commit();
	
	void closeSqlsessionDao();
	
	void close();
	
	void closeAndCommit();
	
}
