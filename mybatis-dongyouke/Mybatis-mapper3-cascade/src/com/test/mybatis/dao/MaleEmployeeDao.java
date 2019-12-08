package com.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.mapper.MaleEmployeeMapper;
import com.test.mybatis.modul.MaleEmployee;
import com.test.mybatis.xmlYingSheQi3.SqlSessionUtil3;

public class MaleEmployeeDao extends SqlSessionUtil3 implements MaleEmployeeMapper{
	private static MaleEmployeeMapper mapper = null;
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
			mapper = sqlSession.getMapper(MaleEmployeeMapper.class);
		}
		
	}

	@Override
	public void fill() {
		fillSqlSession();
		fillMapper();
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
	public void close() {
		closeMappper(mapper);
	}

	@Override
	public void closeAndCommit() {
		commit();
		closeMappper(mapper);
	}

	@Override
	public int addMaleEmployee(MaleEmployee maleEmployee) {
		fill();
		int res = mapper.addMaleEmployee(maleEmployee);
		if(res == 1) {
			System.out.println("��ӳɹ�" + maleEmployee.toString() + "��ӳɹ�");
		} else {
			System.out.println("���ʧ��");
		}
		closeAndCommit();
		return res;
	}

	@Override
	public int deleteMaleEmployee(int id) {
		fill();
		int res = mapper.deleteMaleEmployee(id);
		if(res > 0) {
			System.out.println(id + "ɾ���ɹ�");
		} else {
			System.out.println(id + "ɾ��ʧ��");
		}
		closeAndCommit();		
		return res;
	}

	@Override
	public int updateMaleEmployee(MaleEmployee maleEmployee) {
		fill();
		int res = mapper.updateMaleEmployee(maleEmployee);
		if(res == 1) {
			System.out.println("�޸ĳɹ�" + maleEmployee.toString() + "�޸ĳɹ�");
		} else {
			System.out.println("�޸�ʧ��" + maleEmployee.toString());
		}
		
		closeAndCommit();		
		return res;
	}

	@Override
	public MaleEmployee getMaleEmployeeById(int id) {
		fill();
		MaleEmployee maleEmployee = mapper.getMaleEmployeeById(id);
		System.out.println(maleEmployee.toString());
		close();
		return maleEmployee;
	}

	@Override
	public List<MaleEmployee> getAllMaleEmployee() {
		fill();
		List<MaleEmployee> allMaleEmployee = mapper.getAllMaleEmployee();
		for (int i = 0; i < allMaleEmployee.size(); i++) {
			System.out.println(allMaleEmployee.get(i).toString());
		}
		close();
		return allMaleEmployee;
	}

}
