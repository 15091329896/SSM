package com.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.mapper.EmployeeTaskMapper;
import com.test.mybatis.modul.EmployeeTask;
import com.test.mybatis.xmlYingSheQi3.SqlSessionUtil3;

import sun.util.calendar.JulianCalendar;

public class EmployeeTaskDao extends SqlSessionUtil3 implements EmployeeTaskMapper {
	private static EmployeeTaskMapper mapper = null;
	private static SqlSession sqlSession = null;
	
	
	@Override
	public void fillSqlSession() {
		if(sqlSession == null) {
			sqlSession = getSqlsession();
		}
	}
	@Override
	public void fillMapper() {
		if(mapper == null) {
			mapper = sqlSession.getMapper(EmployeeTaskMapper.class);
		}
	}
	@Override
	public void commit() {
		sqlSession.commit();
	}

	@Override
	public int addEmployeeTask(EmployeeTask EmployeeTask) {
		fill();
		int res = mapper.addEmployeeTask(EmployeeTask);
		if(res == 1) {
			System.out.println(EmployeeTask.toString() + "添加成功");
		}
		commit();
		close();
		return res;
	}
	
	@Override
	public void closeAndCommit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void close() {
		closeMappper(mapper);
	}
	
	@Override
	public void fill() {
		fillSqlSession();
		fillMapper();
	}

	@Override
	public int deleteEmployeeTask(int id) {
		fill();
		int res = mapper.deleteEmployeeTask(id);
		if(res >= 1) {
			System.out.println(id + "删除成功");
		} else {
			System.out.println(id + "删除失败");
		}
		commit();
		close();
		return res;
	}

	@Override
	public int updateEmployeeTask(EmployeeTask EmployeeTask) {
		fill();
		int res = mapper.updateEmployeeTask(EmployeeTask);
		if(res == 1) {
			System.out.println(EmployeeTask.toString() + "更新成功");
		}
		commit();
		close();
		return res;
	}

	@Override
	public EmployeeTask getEmployeeTaskById(int id) {
		fill();
		EmployeeTask employeeTask = mapper.getEmployeeTaskById(id);
		System.out.println(employeeTask.toString());
		close();
		return employeeTask;
	}

	@Override
	public List<EmployeeTask> getAllEmployeeTask() {
		fill();
		List<EmployeeTask> allEmployeeTask = mapper.getAllEmployeeTask();
		for (int i = 0; i < allEmployeeTask.size(); i++) {
			System.out.println(allEmployeeTask.get(i).toString());
		}
		close();
		return allEmployeeTask;
	}
	@Override
	public void closeSqlsessionDao() {
		closeSqlSession(sqlSession);
	}
	@Override
	public List<EmployeeTask> getEmployeeTaskByEmpId(int empId) {
		fill();
		List<EmployeeTask> employeeTasks = mapper.getEmployeeTaskByEmpId(empId);
		for (int i = 0; i < employeeTasks.size(); i++) {
			System.out.println(employeeTasks.get(i).toString());
		}
		close();
		return null;
	}
	
	
	
}
