package com.test.mybatis.xmlYingSheQi3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.parameter.ProcedureTest1Param;

public class Test {
	

	private static SqlSession sqlSession = null;
	private static PeopleMapper peopleMapper = null;

	public static void main(String[] args) {

		// new Test().addPeople();
//		new Test().getAllPeople();
		// new Test().deletePeople();
		// new Test().updatePeople();
		// new Test().getPeople();
		// new Test().getAllPeople();
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		new Test().useProcedureFigueAdd();
		
		
		
		
		
		
		
		
		
		
		
		
		closeSession();
		System.exit(0);
	}

	private static void closeSession() {
		new Test().closeSqlSession();
	}

	private void useProcedureFigueAdd() {
		fill();
		int res = 0;
		ProcedureTest1Param procedureTest1Param = new ProcedureTest1Param(12, 45, res);
		peopleMapper.figueAdd(procedureTest1Param);
		System.out.println("结果是：" + procedureTest1Param.getRes());
		close();
	}

	private void getAllPeople() {
		fill();
		List<People> list = peopleMapper.getAllPeople();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		closeSession();
	}

	private void close() {
		closeMappper();
	}

	private void fill() {
		getSqlSession();
		getMapper(PeopleMapper.class);
	}

	private void getSqlSession() {
		if (sqlSession == null) {
			sqlSession = SqlSessionUtil3.getSqlsession();
		}
	}

	private void getMapper(Class<PeopleMapper> class1) {
		if (peopleMapper == null) {
			peopleMapper = sqlSession.getMapper(class1);
		}

	}

	private void getPeople() {
		fill();
		People people = peopleMapper.getPeopleByID(1001);
		System.out.println(people.toString());
		closeSession();
	}

	private void updatePeople() {
		fill();
		People people = peopleMapper.getPeopleByID(1001);
		people.setName("�޸Ĳ���");
		if (peopleMapper.updatePeople(people) == 1) {
			System.out.println(people.toString() + "�޸ĳɹ�");
		}
		commite();
		closeSession();
	}

	private void closeMappper() {
		if (peopleMapper != null) {
			peopleMapper = null;
		}
	}

	private void commite() {
		if (sqlSession == null) {
			System.out.println("�ύʧ��");
			return;
		}
		sqlSession.commit();
	}

	private void deletePeople() {
		fill();
		if (peopleMapper.deletePeople(1002) != -1) {
			System.out.println("ɾ���ɹ�");
		}
		commite();
		closeSession();
	}

	private void addPeople() {
		fill();
		People people = new People(1001, "���ʯ");
		if (peopleMapper.addPeople(people) == 1) {
			System.out.println(people.toString() + "��ӳɹ�");
		}
		commite();
		closeSession();

	}

	private void closeSqlSession() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}
}
