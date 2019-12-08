package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.MaleHealthForm;

public interface MaleHealthFormMapper extends ManageSqlSessionAndMapper{
	
	int addMaleHealthForm(MaleHealthForm maleHealthForm);
	
	int deleteMaleHealthForm(int id);
	
	int updateMaleHealthForm(MaleHealthForm maleHealthForm);
	
	MaleHealthForm getMaleHealthFormById(int id);
	
	MaleHealthForm getMaleHealthFormByEmpId(int empId);
	
	List<MaleHealthForm> getAllMaleHealthForm();
	
}
