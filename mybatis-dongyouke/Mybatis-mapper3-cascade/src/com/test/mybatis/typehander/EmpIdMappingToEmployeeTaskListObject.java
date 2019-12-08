package com.test.mybatis.typehander;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.test.mybatis.dao.EmployeeTaskDao;
import com.test.mybatis.modul.EmployeeTask;

public class EmpIdMappingToEmployeeTaskListObject implements TypeHandler<List<EmployeeTask>>{
	private static EmployeeTaskDao employeeTaskDao = null;
	
	@Override
	public List<EmployeeTask> getResult(ResultSet resultSet, String columnName) throws SQLException {
		employeeTaskDao = new EmployeeTaskDao();
		int empId = resultSet.getInt(columnName);
		List<EmployeeTask> employeeTasks = employeeTaskDao.getEmployeeTaskByEmpId(empId );
		return employeeTasks;
	}

	@Override
	public List<EmployeeTask> getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeTask> getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, List<EmployeeTask> arg2, JdbcType arg3)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
