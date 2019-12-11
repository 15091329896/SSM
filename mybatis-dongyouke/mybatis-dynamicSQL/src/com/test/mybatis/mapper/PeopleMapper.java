package com.test.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.mybatis.modul.People;

public interface PeopleMapper extends ManageSqlSessionAndMapper{

	List<People> getAllPeople();

	List<People> getPeopleDynamic(@Param("name") String name);
	
	List<People> getPeopleDynamic2(People people);
	
	List<People> getPeopleDynamic3(@Param("peopleIds") List<Integer> peopleIds);
	
	People getPeopleByID(int id);

	int updatePeople(People people);

	int deletePeople(int id);

	int addPeople(People people);
	
	
}
