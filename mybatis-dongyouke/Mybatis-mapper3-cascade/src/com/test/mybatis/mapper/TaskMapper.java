package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.Task;

public interface TaskMapper extends ManageSqlSessionAndMapper{
	
	int addTask(Task task);
	
	int deleteTask(int id);
	
	int updateTask(Task task);
	
	Task getTaskById(int id);
	
	List<Task> getAllTask();
	
}
