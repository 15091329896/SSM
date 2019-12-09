package com.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.mapper.PeopleMapper;
import com.test.mybatis.modul.People;
import com.test.mybatis.util.SqlSessionUtil;

public class PeopleDao extends SqlSessionUtil implements PeopleMapper {
	private SqlSession sqlSession = null;
	private PeopleMapper mapper = null;

	@Override
	public List<People> getAllPeople() {
		fill();
		List<People> allPeople = mapper.getAllPeople();
		if(allPeople == null) {
			System.out.println("数据库没有的people的数据");
			return null;
		}
		for (int i = 0; i < allPeople.size(); i++) {
			System.out.println(allPeople.get(i).toString());
		}
		close();
		return allPeople;
	}

	@Override
	public People getPeopleByID(int id) {
		fill();
		
		People people = mapper.getPeopleByID(id);
		if(people == null) {
			System.out.println(id + "的people不存在");
			return null;
		}
		System.out.println(people.toString());
		close();
		return null;
	}

	@Override
	public int updatePeople(People people) {
		fill();
		if(people == null) {
			System.out.println("更新的数据为空，请检查");
			return -1;
		}
		int res = mapper.updatePeople(people);
		if(res >= 1) {
			System.out.println("更新成功" + people.toString());
		} else {
			System.out.println("更新失败" + people.toString());
		}
		closeAndCommit();
		return res;
	}

	@Override
	public int deletePeople(int id) {
		fill();
		int res = mapper.deletePeople(id);
		if(res >= 1) {
			System.out.println(id + "删除成功");
		} else {
			System.out.println(id + "删除失败");
		}
		close();
		return res;
	}

	@Override
	public int addPeople(People people) {
		fill();
		if(people == null) {
			System.out.println("添加的数据为空，请检查");
			return -1;
		}
		int res = mapper.addPeople(people);
		if(res == 1) {
			System.out.println("添加成功");
			
		} else {
			System.out.println("添加失败");
		}
		closeAndCommit();
		return res;
	}

	@Override
	public void fillSqlSession() {
		if(sqlSession == null) {
			sqlSession = getSqlsession();
		}
	}
	@Override
	public void fillMapper() {
		if(mapper == null) {
			mapper = sqlSession.getMapper(PeopleMapper.class);
		}
	}
	
	@Override
	public void fill() {
		fillSqlSession();
		fillMapper();
	}
	
	@Override
	public void close() {
		closeMappper(mapper);
	}
	
	

	@Override
	public void commit() {
		sqlSession.commit();
	}

	@Override
	public void closeSqlsessionDao() {
		closeSqlSession(sqlSession);
	}
	
	

	@Override
	public void closeAndCommit() {
		commit();
		closeMappper(mapper);
	}

}
