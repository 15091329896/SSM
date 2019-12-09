package com.test.mybatis.main;

import com.test.mybatis.dao.PeopleDao;

public class Test {

	private static PeopleDao peopleDao = null;

	public static void main(String[] args) {
		peopleDao = new PeopleDao();
		
		peopleDao.getAllPeople();
		
		peopleDao.closeSqlsessionDao();
	}

	

}
