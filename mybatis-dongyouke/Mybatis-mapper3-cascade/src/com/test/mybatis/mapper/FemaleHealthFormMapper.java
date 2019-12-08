package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.FemaleHealthForm;

public interface FemaleHealthFormMapper extends ManageSqlSessionAndMapper {
	/*
	 * ÔöÉ¾¸Ä²é
	 */

	int addFemaleHealthForm(FemaleHealthForm femaleHealthForm);

	int deleteFemaleHealthForm(int id);

	int updateFemaleHealthForm(FemaleHealthForm femaleHealthForm);

	FemaleHealthForm getFemaleHealthFormById(int id);

	List<FemaleHealthForm> getFemaleHealthFormByEmpId(int empId);

	List<FemaleHealthForm> getAllFemaleHealthForm();

}
