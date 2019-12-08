package com.test.mybatis.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.test.mybatis.mapper.FemaleHealthFormMapper;
import com.test.mybatis.modul.FemaleHealthForm;
import com.test.mybatis.xmlYingSheQi3.SqlSessionUtil3;

public class FemaleHealthFormDao extends SqlSessionUtil3 implements  FemaleHealthFormMapper{
	private static FemaleHealthFormMapper mapper = null;
	private static SqlSession sqlSession = null;
	
	@Override
	public void fillSqlSession() {
		if(sqlSession == null) {
			sqlSession = getSqlsession();
		}
	}
	@Override
	public void fillMapper() {
		if(mapper == null) {
			mapper = sqlSession.getMapper(FemaleHealthFormMapper.class);
		}
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
	public int addFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
		fill();
		int res = mapper.addFemaleHealthForm(femaleHealthForm);
		if(res == 1) {
			System.out.println(femaleHealthForm.toString() + "添加成功");
		} else {
			System.out.println(femaleHealthForm.toString() + "添加失败");
		}
		closeAndCommit();
		return res;
	}

	@Override
	public int deleteFemaleHealthForm(int id) {
		fill();
		int res = mapper.deleteFemaleHealthForm(id);
		if(res >= 1) {
			System.out.println(id + "删除成功");
		} else {
			System.out.println(id + "删除失败");
		}
		closeAndCommit();
		return res;
	}

	@Override
	public int updateFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
		fill();
		int res = mapper.updateFemaleHealthForm(femaleHealthForm);
		if(res >= 1) {
			System.out.println(femaleHealthForm.toString() + "更新成功");
		} else {
			System.out.println(femaleHealthForm.toString() + "更新失败");
		}
		closeAndCommit();
		return 0;
	}

	@Override
	public void closeAndCommit() {
		commit();
		closeMappper(mapper);
	}
	@Override
	public FemaleHealthForm getFemaleHealthFormById(int id) {
		fill();
		FemaleHealthForm femaleHealthForm = mapper.getFemaleHealthFormById(id);
		System.out.println(femaleHealthForm.toString());
		close();		
		return femaleHealthForm;
	}

	@Override
	public List<FemaleHealthForm> getAllFemaleHealthForm() {
		fill();
		List<FemaleHealthForm> allFemaleHealth = mapper.getAllFemaleHealthForm();
		for (int i = 0; i < allFemaleHealth.size(); i++) {
			System.out.println(allFemaleHealth.get(i).toString());
		}
		close();
		return allFemaleHealth;
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
	public List<FemaleHealthForm> getFemaleHealthFormByEmpId(int empId) {
		fill();
		List<FemaleHealthForm> femaleHealthForms = mapper.getFemaleHealthFormByEmpId(empId);
		for (int i = 0; i < femaleHealthForms.size(); i++) {
			System.out.println(femaleHealthForms.get(i).toString());
		}
		close();
		return femaleHealthForms;
	}

}
