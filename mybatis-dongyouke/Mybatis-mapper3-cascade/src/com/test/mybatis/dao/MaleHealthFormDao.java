package com.test.mybatis.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.test.mybatis.mapper.MaleHealthFormMapper;
import com.test.mybatis.modul.MaleHealthForm;
import com.test.mybatis.xmlYingSheQi3.SqlSessionUtil3;

public class MaleHealthFormDao extends SqlSessionUtil3 implements MaleHealthFormMapper {
	private static MaleHealthFormMapper mapper = null;
	private static SqlSession sqlSession = null;

	@Override
	public void fillSqlSession() {
		if (sqlSession == null) {
			sqlSession = getSqlsession();
		}
	}

	@Override
	public void fillMapper() {
		if (mapper == null) {
			mapper = sqlSession.getMapper(MaleHealthFormMapper.class);
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
	public int addMaleHealthForm(MaleHealthForm maleHealthForm) {
		fill();
		int res = mapper.addMaleHealthForm(maleHealthForm);
		if (res == 1) {
			System.out.println(maleHealthForm.toString() + "添加成功");
		} else {
			System.out.println(maleHealthForm.toString() + "添加失败");
		}
		closeAndCommit();
		return res;
	}

	@Override
	public int deleteMaleHealthForm(int id) {
		fill();
		int res = mapper.deleteMaleHealthForm(id);
		if (res >= 1) {
			System.out.println(id + "删除成功");
		} else {
			System.out.println(id + "删除失败");
		}
		closeAndCommit();
		return res;
	}

	@Override
	public int updateMaleHealthForm(MaleHealthForm maleHealthForm) {
		fill();
		int res = mapper.updateMaleHealthForm(maleHealthForm);
		if (res >= 1) {
			System.out.println(maleHealthForm.toString() + "更新成功");
		} else {
			System.out.println(maleHealthForm.toString() + "更新失败");
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
	public MaleHealthForm getMaleHealthFormById(int id) {
		fill();
		MaleHealthForm maleHealthForm = mapper.getMaleHealthFormById(id);
		if(maleHealthForm == null) {
			System.out.println(id + "号MaleHealthForm未找到");
			return null;
		}
		System.out.println(maleHealthForm.toString());
		close();
		return maleHealthForm;
	}

	@Override
	public List<MaleHealthForm> getAllMaleHealthForm() {
		fill();
		List<MaleHealthForm> allMaleHealth = mapper.getAllMaleHealthForm();
		for (int i = 0; i < allMaleHealth.size(); i++) {
			System.out.println(allMaleHealth.get(i).toString());
		}
		close();
		return allMaleHealth;
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
	public MaleHealthForm getMaleHealthFormByEmpId(int empId) {
		fill();
		MaleHealthForm maleHealthForm = mapper.getMaleHealthFormByEmpId(empId);
		System.out.println(maleHealthForm.toString());
		close();
		return maleHealthForm;
	}
}
