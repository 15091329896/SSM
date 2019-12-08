package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.WorkCard;

public interface WorkCardMapper extends ManageSqlSessionAndMapper {
	/*
	 * 完成工作牌的增删改查
	 * 
	 */
	int addWorkCard(WorkCard workCard);

	int deleteWorkCard(int id);

	int updateWorkCard(WorkCard workCard);

	WorkCard getWorkCardByID(int id);

	List<WorkCard> getAllWorkCard();

	WorkCard getWorkCardByEmpId(int empId);
}
