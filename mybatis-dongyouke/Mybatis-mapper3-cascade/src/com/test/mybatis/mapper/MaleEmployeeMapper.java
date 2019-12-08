package com.test.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.mybatis.modul.MaleEmployee;

public interface MaleEmployeeMapper extends ManageSqlSessionAndMapper {

	int addMaleEmployee(@Param("maleEmployee") MaleEmployee maleEmployee);

	int deleteMaleEmployee(int id);

	int updateMaleEmployee(@Param("maleEmployee") MaleEmployee maleEmployee);

	MaleEmployee getMaleEmployeeById(int id);

	List<MaleEmployee> getAllMaleEmployee();

}
