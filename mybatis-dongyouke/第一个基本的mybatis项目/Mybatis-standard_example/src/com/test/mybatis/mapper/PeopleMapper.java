package com.test.mybatis.mapper;

import java.util.List;

import com.test.mybatis.modul.People;

public interface PeopleMapper extends ManageSqlSessionAndMapper{

	List<People> getAllPeople();

	People getPeopleByID(int id);

	int updatePeople(People people);

	int deletePeople(int id);

	int addPeople(People people);

}
