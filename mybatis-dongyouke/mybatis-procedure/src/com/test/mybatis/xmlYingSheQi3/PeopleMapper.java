package com.test.mybatis.xmlYingSheQi3;

import java.util.List;

import com.test.mybatis.parameter.ProcedureTest1Param;

public interface PeopleMapper {

	List<People> getAllPeople();

	People getPeopleByID(int id);

	int updatePeople(People people);

	int deletePeople(int id);

	int addPeople(People people);

	void figueAdd(ProcedureTest1Param procedureTest1Param);

}
