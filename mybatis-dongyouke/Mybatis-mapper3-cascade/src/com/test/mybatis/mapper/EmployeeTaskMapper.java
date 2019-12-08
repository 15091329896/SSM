package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.EmployeeTask;

public interface EmployeeTaskMapper extends ManageSqlSessionAndMapper {

	int addEmployeeTask(EmployeeTask EmployeeTask);

	int deleteEmployeeTask(int id);

	int updateEmployeeTask(EmployeeTask EmployeeTask);

	EmployeeTask getEmployeeTaskById(int id);

	List<EmployeeTask> getEmployeeTaskByEmpId(int empId);
	
	List<EmployeeTask> getAllEmployeeTask();

}
