package com.test.mybatis.typehander;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;
import com.test.mybatis.dao.TaskDao;
import com.test.mybatis.modul.Task;

public class TaskIDMappingToTaskObject implements TypeHandler<Task>{
	
	private static TaskDao taskDao = null;
	
	@Override
	public Task getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * ִ�в�ѯ֮���ָ���ֶεĴ���
	 * 
	 * */
	@Override
	public Task getResult(ResultSet resultSet, String columnName) throws SQLException {
		System.out.println("ʹ���Խ������ʹ��������и���taskID��task��������");
		taskDao = new TaskDao();
		int taskId = resultSet.getInt(columnName);
		return taskDao.getTaskById(taskId);
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Task arg2, JdbcType arg3) throws SQLException {
		
	}
	
}
