package com.test.mybatis.typehander;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.test.mybatis.dao.MaleHealthFormDao;
import com.test.mybatis.modul.MaleHealthForm;

public class EmpIdMappingToMaleHealthFormObject implements TypeHandler<MaleHealthForm>{
	private static MaleHealthFormDao maleHealthFormDao = null; 
	
	@Override
	public MaleHealthForm getResult(ResultSet resultSet, String columnName) throws SQLException {
		maleHealthFormDao = new MaleHealthFormDao();
		int empId = resultSet.getInt(columnName);
		MaleHealthForm maleHealthForm = maleHealthFormDao.getMaleHealthFormByEmpId(empId );
		return maleHealthForm;
	}

	@Override
	public MaleHealthForm getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaleHealthForm getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, MaleHealthForm arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}
