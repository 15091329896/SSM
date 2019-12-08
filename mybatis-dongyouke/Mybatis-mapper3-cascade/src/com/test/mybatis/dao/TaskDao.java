package com.test.mybatis.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.test.mybatis.mapper.TaskMapper;
import com.test.mybatis.modul.Task;
import com.test.mybatis.xmlYingSheQi3.SqlSessionUtil3;

public class TaskDao extends SqlSessionUtil3 implements TaskMapper{
	private static TaskMapper mapper = null;
	private static SqlSession sqlSession = null;
	
	@Override
	public int addTask(Task task) {
		fillSqlSession();
		fillMapper();
		if(mapper.addTask(task) == 1) {
			System.out.println(task.toString() + "添加成功");
		}
		commit();
		closeMappper(mapper);
		return 0;
	}
	@Override
	public void closeAndCommit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int deleteTask(int id) {
		fillSqlSession();
		fillMapper();
		if(mapper.deleteTask(id) >= 1) {
			System.out.println(id + "删除成功");
		}
		commit();
		closeMappper(mapper);
		return 0;
	}
	@Override
	public int updateTask(Task task) {
		fillSqlSession();
		fillMapper();
		if(mapper.updateTask(task) == 1) {
			System.out.println(task.toString() + "修改成功");
		}
		commit();
		closeMappper(mapper);
		return 0;
	}
	@Override
	public Task getTaskById(int id) {
		fillSqlSession();
		fillMapper();
		Task task = mapper.getTaskById(id);
		System.out.println(task.toString());
		closeMappper(mapper);
		return task;
	}
	@Override
	public List<Task> getAllTask() {
		fillSqlSession();
		fillMapper();
		List<Task> allTask = mapper.getAllTask();
		for (int i = 0; i < allTask.size(); i++) {
			System.out.println(allTask.get(i).toString());
		}
		closeMappper(mapper);
		return null;
	}
	@Override
	public void fillSqlSession() {
		if(sqlSession == null) {
			sqlSession = getSqlsession();
		}
	}
	@Override
	public void fillMapper() {
		if(mapper == null) {
			mapper = sqlSession.getMapper(TaskMapper.class);
		}
	}
	@Override
	public void commit() {
		sqlSession.commit();
	}
	@Override
	public void closeSqlsessionDao() {
		closeSqlSession(sqlSession);
	}
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}
