package com.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.mapper.WorkCardMapper;
import com.test.mybatis.modul.WorkCard;
import com.test.mybatis.xmlYingSheQi3.SqlSessionUtil3;

public class WorkCardDao extends SqlSessionUtil3 implements WorkCardMapper{
	@Override
	public void closeAndCommit() {
		// TODO Auto-generated method stub
		
	}

	private static SqlSession sqlSession = null;
	private static WorkCardMapper mapper = null;
	
	
	@Override
	public void fillSqlSession() {
		if(sqlSession == null) {
			sqlSession = getSqlsession();
		}
	}

	@Override
	public void fillMapper() {
		if(mapper == null) {
			mapper = sqlSession.getMapper(WorkCardMapper.class);
		}
	}

	@Override
	public void commit() {
		sqlSession.commit();
	}

	@Override
	public int addWorkCard(WorkCard workCard) {
		fillSqlSession();
		fillMapper();
		int res = mapper.addWorkCard(workCard);
		if(res == 1) {
			System.out.println(workCard.toString() + "添加成功");
		}
		commit();
		closeMappper(mapper);
		return res;
	}

	@Override
	public int deleteWorkCard(int id) {
		fillSqlSession();
		fillMapper();
		int res = mapper.deleteWorkCard(id);
		if(res >= 1) {
			System.out.println(id + "删除成功");
		}
		commit();
		closeMappper(mapper);
		return res;
	}

	@Override
	public int updateWorkCard(WorkCard workCard) {
		fillSqlSession();
		fillMapper();
		int res = mapper.updateWorkCard(workCard);
		if(res >= 1) {
			System.out.println(workCard.toString() + "更新成功");
		}
		commit();
		closeMappper(mapper);
		return res;
	}

	@Override
	public WorkCard getWorkCardByID(int id) {
		fillSqlSession();
		fillMapper();
		WorkCard workCard = mapper.getWorkCardByID(id);
		System.out.println(workCard.toString());
		closeMappper(mapper);
		return workCard;
	}

	@Override
	public List<WorkCard> getAllWorkCard() {
		fillSqlSession();
		fillMapper();
		List<WorkCard> allWorks = mapper.getAllWorkCard();
		for (int i = 0; i < allWorks.size(); i++) {
			System.out.println(allWorks.get(i).toString());
		}
		closeMappper(mapper);
		return allWorks;
	}

	public void closeSession() {
		closeSqlSession(sqlSession);
	}

	@Override
	public void closeSqlsessionDao() {
		closeSqlSession(sqlSession);
	}

	@Override
	public void fill() {
		fillSqlSession();
		fillMapper();
	}

	@Override
	public void close() {
		
	}

	@Override
	public WorkCard getWorkCardByEmpId(int empId) {
		fill();
		WorkCard workCard = null;
		workCard = mapper.getWorkCardByEmpId(empId);
		if(workCard == null) {
			System.out.println("未找到" + empId  +"号员工的工卡");
			return null;
		}
		System.out.println(workCard.toString());
		close();
		return workCard;
	}
}
