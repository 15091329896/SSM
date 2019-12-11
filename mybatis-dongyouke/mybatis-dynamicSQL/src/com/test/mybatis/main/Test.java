package com.test.mybatis.main;

import java.util.ArrayList;
import java.util.List;

import com.test.mybatis.dao.PeopleDao;
import com.test.mybatis.modul.People;

public class Test {

	private static PeopleDao peopleDao = null;

	public static void main(String[] args) {
		peopleDao = new PeopleDao();

		// peopleDao.getAllPeople();
//		 peopleDao.getPeopleDynamic("李白");
//		List<Integer> peopleIds = new ArrayList<Integer>();
//		peopleIds.add(56);
//		peopleIds.add(57);
//		peopleIds.add(58);
//		peopleIds.add(59);
		// peopleDao.addPeople(new People(1001, "张三"));
		// peopleDao.getAllPeople();
//		peopleDao.getPeopleDynamic3(peopleIds);
//		People people = new People();
//		people.setId(45);
//		people.setName("李白白");
		// peopleDao.getPeopleDynamic2(people);
//		peopleDao.updatePeople(people);
//		peopleDao.addPeople(new People(102, "新增测试"));
		peopleDao.getAllPeople();
		peopleDao.closeSqlsessionDao();

		System.exit(0);
	}

}
