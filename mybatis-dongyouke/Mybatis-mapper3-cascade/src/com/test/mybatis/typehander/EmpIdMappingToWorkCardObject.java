package com.test.mybatis.typehander;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.test.mybatis.dao.WorkCardDao;
import com.test.mybatis.modul.WorkCard;

public class EmpIdMappingToWorkCardObject implements TypeHandler<WorkCard>{
	private static WorkCardDao workCardDao = null; 
	
	@Override
	public WorkCard getResult(ResultSet resultSet, String columnName) throws SQLException {
		/*
		 * 通过WorkCardId得到WorkCardObject
		 *		 
		 * 
		 * 
		 * */
		workCardDao = new WorkCardDao();
		int empId = resultSet.getInt(columnName);
		WorkCard workCard =  workCardDao.getWorkCardByEmpId(empId);
		return workCard;
	}

	@Override
	public WorkCard getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkCard getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, WorkCard arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
