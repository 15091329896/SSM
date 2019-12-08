package com.test.mybatis.xmlYingSheQi3;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {

	List<People> getAllPeople();

	People getPeopleByID(int id);

	int updatePeople(People people);

	int deletePeople(int id);
	
	int addPeople(@Param("people") People people, @Param("nameTest") String name);
}
