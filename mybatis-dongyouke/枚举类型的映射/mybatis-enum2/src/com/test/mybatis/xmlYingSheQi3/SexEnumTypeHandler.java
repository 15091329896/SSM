package com.test.mybatis.xmlYingSheQi3;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class SexEnumTypeHandler implements TypeHandler<SexEnum>{

	@Override
	public SexEnum getResult(ResultSet resultSet, String columnName) throws SQLException {
		String sexString = resultSet.getString(columnName);
		System.out.println("自建的SexEnumTypeHandler");
		return SexEnum.valueOf(sexString);
	}

	@Override
	public SexEnum getResult(ResultSet resultSet, int columnIndex) throws SQLException {
		String sexString = resultSet.getString(columnIndex);
		System.out.println("自建的SexEnumTypeHandler");
		return SexEnum.valueOf(sexString);
	}

	@Override
	public SexEnum getResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
		String sexString = callableStatement.getString(columnIndex);
		System.out.println("自建的SexEnumTypeHandler");
		return SexEnum.valueOf(sexString);
	}

	@Override
	public void setParameter(PreparedStatement preparedStatement, int parameterIndex, SexEnum sex, JdbcType jdbcType) throws SQLException {
		System.out.println("自建的SexEnumTypeHandler");
		preparedStatement.setString(parameterIndex, sex.getName());
	}
	
}
