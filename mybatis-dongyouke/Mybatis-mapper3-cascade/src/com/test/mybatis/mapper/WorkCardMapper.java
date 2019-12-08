package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.WorkCard;

public interface WorkCardMapper extends ManageSqlSessionAndMapper {
	/*
	 * ��ɹ����Ƶ���ɾ�Ĳ�
	 * 
	 */
	int addWorkCard(WorkCard workCard);

	int deleteWorkCard(int id);

	int updateWorkCard(WorkCard workCard);

	WorkCard getWorkCardByID(int id);

	List<WorkCard> getAllWorkCard();

	WorkCard getWorkCardByEmpId(int empId);
}
