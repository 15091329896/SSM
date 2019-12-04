package com.test.mybatis.xmlYingSheQi3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Test {
	/*
	 * ʹ��mybatis��ɵ������ɾ�Ĳ� �õ�sqlSession���� ͨ�� sqlSession ����õ�ӳ�����ӿڵ�ʵ��
	 * ͨ��ӳ����ʵ������ӳ�����ӿ��еĺ���������ɾ�Ĳ�
	 *
	 */

	private static SqlSession sqlSession = null;
	private static PeopleMapper peopleMapper = null;

	public static void main(String[] args) {

		// new Test().addPeople();
		new Test().getAllPeople();
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		new Test().closeSqlSession();
		System.exit(0);
	}

	private void getAllPeople() {
		getSqlSession();
		getMapper(PeopleMapper.class);
		List<People> list = peopleMapper.getAllPeople();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		closeMappper();
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
		getSqlSession();
		getMapper(PeopleMapper.class);
		People people = peopleMapper.getPeopleByID(1001);
		System.out.println(people.toString());
		closeMappper();
	}

	private void updatePeople() {
		getSqlSession();
		getMapper(PeopleMapper.class);
		People people = peopleMapper.getPeopleByID(1001);
		people.setName("�޸Ĳ���");
		if (peopleMapper.updatePeople(people) == 1) {
			System.out.println(people.toString() + "�޸ĳɹ�");
		}
		commite();
		closeMappper();
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
		// TODO Auto-generated method stub
		getSqlSession();
		getMapper(PeopleMapper.class);
		if (peopleMapper.deletePeople(1002) != -1) {
			System.out.println("ɾ���ɹ�");
		}
		commite();
		closeMappper();
		// closeSqlSession();
	}

	private void addPeople() {
		getSqlSession();
		getMapper(PeopleMapper.class);
		People people = new People(1001, "���ʯ");
		if (peopleMapper.addPeople(people) == 1) {
			System.out.println(people.toString() + "��ӳɹ�");
		}
		commite();
		closeMappper();

	}

	private void closeSqlSession() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}
}
