package com.test.mybatis.xmlYingSheQi3;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Test {
	/*
	 * 使用mybatis完成单表的增删改查 得到sqlSession对象 通过 sqlSession 对象得到映射器接口的实例
	 * 通过映射器实例调用映射器接口中的函数进行增删改查
	 *		
	 *
	 */

	private static SqlSession sqlSession = null;
	private static PeopleMapper peopleMapper = null;
	private static ManMapper manMapper = null;
	
	
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
		Test test = new Test();
		long start1 = System.currentTimeMillis();
		
		test.getPeople();
		long end1 = System.currentTimeMillis();
		double res = (end1 - start1) * 1.0;
		
		String formatRes = formatRes(res);
		
		System.out.println("耗时：" + formatRes);
		sqlSession.commit();
		
//		Thread thread = new Thread();
//		try {
//			thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		long start2 = System.currentTimeMillis();
		
		test.getPeople();
		long end2 = System.currentTimeMillis();
		res = 1.0 * (end2 - start2);
		
		System.out.println("耗时：" + formatRes(res));
		
		
		test.getAllMan();
		
		
		
		
		
		
		
		
		
		
		
		test.closeSqlSession();
		sqlSession.clearCache();
		System.exit(0);
	}

	private static String formatRes(double res) {
		DecimalFormat format = new DecimalFormat("######.000000");
		
		String formatRes = format.format(res);
		return formatRes;
	}

	private void getAllMan() {
		getSqlSession();
		getManMapper(ManMapper.class);
		List<Man> allMan = manMapper.getAllMan();
		for (int i = 0; i < allMan.size(); i++) {
			System.out.println(allMan.get(i).toString());
		}
	}

	private void getManMapper(Class<ManMapper> class1) {
		if(manMapper == null) {
			manMapper = sqlSession.getMapper(ManMapper.class);
		}
	}

	private void getAllPeople() {
		getSqlSession();
		getPeopleMapper(PeopleMapper.class);
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

	private void getPeopleMapper(Class<PeopleMapper> class1) {
		if (peopleMapper == null) {
			peopleMapper = sqlSession.getMapper(class1);
		}

	}

	private void getPeople() {
		getSqlSession();
		getPeopleMapper(PeopleMapper.class);
		People people = peopleMapper.getPeopleByID(1);
		System.out.println(people.toString());
		closeMappper();
	}

	private void updatePeople() {
		getSqlSession();
		getPeopleMapper(PeopleMapper.class);
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
		getPeopleMapper(PeopleMapper.class);
		if (peopleMapper.deletePeople(1002) != -1) {
			System.out.println("删除成功");
		}
		commite();
		closeMappper();
		// closeSqlSession();
	}

	private void addPeople() {
		getSqlSession();
		getPeopleMapper(PeopleMapper.class);
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
