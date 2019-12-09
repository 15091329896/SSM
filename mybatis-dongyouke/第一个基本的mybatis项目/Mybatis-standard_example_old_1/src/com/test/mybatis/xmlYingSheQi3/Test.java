package com.test.mybatis.xmlYingSheQi3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Test {
	/*
	 * 使用mybatis完成单表的增删改查 得到sqlSession对象 通过 sqlSession 对象得到映射器接口的实例
	 * 通过映射器实例调用映射器接口中的函数进行增删改查
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
		people.setName("修改测试");
		if (peopleMapper.updatePeople(people) == 1) {
			System.out.println(people.toString() + "修改成功");
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
			System.out.println("提交失败");
			return;
		}
		sqlSession.commit();
	}

	private void deletePeople() {
		// TODO Auto-generated method stub
		getSqlSession();
		getMapper(PeopleMapper.class);
		if (peopleMapper.deletePeople(1002) != -1) {
			System.out.println("删除成功");
		}
		commite();
		closeMappper();
		// closeSqlSession();
	}

	private void addPeople() {
		getSqlSession();
		getMapper(PeopleMapper.class);
		People people = new People(1001, "齐白石");
		if (peopleMapper.addPeople(people) == 1) {
			System.out.println(people.toString() + "添加成功");
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
