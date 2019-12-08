package com.test.mybatis.xmlYingSheQi3;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.mybatis.dao.EmployeeTaskDao;
import com.test.mybatis.dao.FemaleHealthFormDao;
import com.test.mybatis.dao.MaleEmployeeDao;
import com.test.mybatis.dao.MaleHealthFormDao;
import com.test.mybatis.dao.TaskDao;
import com.test.mybatis.dao.WorkCardDao;
import com.test.mybatis.modul.EmployeeTask;
import com.test.mybatis.modul.MaleEmployee;
import com.test.mybatis.modul.MaleHealthForm;
import com.test.mybatis.modul.WorkCard;

public class Test {
	/*
	 * ʹ��mybatis��ɵ������ɾ�Ĳ� �õ�sqlSession���� ͨ�� sqlSession ����õ�ӳ�����ӿڵ�ʵ��
	 * ͨ��ӳ����ʵ������ӳ�����ӿ��еĺ���������ɾ�Ĳ�
	 *
	 */

	private static SqlSession sqlSession = null;
	private static PeopleMapper peopleMapper = null;
	
	private static TaskDao taskDao = null;
	private static WorkCardDao workCardDao = null;
	private static EmployeeTaskDao employeeTaskDao = null;
	private static FemaleHealthFormDao femaleHealthFormDao = null;
	private static MaleHealthFormDao maleHealthFormDao = null;
	private static MaleEmployeeDao maleEmployeeDao = null;
	
	public static void main(String[] args) {
		/** ��ȡ��ǰϵͳʱ��*/
		long startTime =  System.currentTimeMillis();
		 
		
//		new Test().addPeople();
//		new Test().getAllPeople();
		// new Test().deletePeople();
		// new Test().updatePeople();
		// new Test().getPeople();
		// new Test().getAllPeople();
		
		/*
		 * ����
		 * 		����ʵ����
		 * 			Ա��
		 * 			Ա������
		 * 			
		 * 		�������ݱ�
		 * 			������
		 * 				������
		 * 				Ů����
		 * 			Ա��
		 * 				��Ա��   ����������
		 * 				ŮԱ��   Ů��������
		 * 			����
		 * 				
		 * 			Ա������
		 * 			
		 * 
		 * 		����ӳ����
		 * 			��ӳ�����ж��弶��
		 * 
		 * 		�������ݱ��java������ֶ������������඼����ͬ�����
		 * 			ʹ�����ʹ����������õ����ݱ��е��ֶε�֮�󣬽����Զ���Ĵ���
		 * 		
		 * 			ͨ��employee��ӳ���MaleEmployee��femaleEmployee
					����java�����е����ԣ����ݱ��е�ֱ�Ӽ�ӳ�䣬
					û�е������ʹ������и������ݱ��е��ֶο������κ��ֶΣ�������Ҫ��java����
					
					
					������ȫ����java��Ϊ��׼��ӳ����
						�ӿ�
						sql�ļ�
							��sql�ļ��У�
							����java�����е����ԣ����ݱ��е�ֱ�Ӽ�ӳ�䣬
							û�е������ʹ������и������ݱ��е��ֶο������κ��ֶΣ�������Ҫ��java����
						
							�������ʹ�����
								����һ�����ʹ�������
								��ȫ�������ļ�������
								��sql�����ļ��е�resultMap����ʹ��
							
								
						
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
//		workCardDao = new WorkCardDao();
//		workCardDao.addWorkCard(new WorkCard(1, 1, "���", "����1", "15091329896", "��ַ1", "��ע1"));
//		workCardDao.deleteWorkCard(3);
//		workCardDao.updateWorkCard(new WorkCard(1, 1, "���", "����1�޸�", "15091329896", "��ַ1", "��ע1"));
//		workCardDao.getWorkCardByID(2);
//		workCardDao.getAllWorkCard();
//		taskDao = new TaskDao();
//		employeeTaskDao = new EmployeeTaskDao();
//		List<EmployeeTask> allEmployeeTask = employeeTaskDao.getAllEmployeeTask();
////		System.out.println(employeeTaskDao.getEmployeeTaskById(4).getTask().toString());
////		employeeTaskDao.getEmployeeTaskByEmpId(2);
////		employeeTaskDao.getAllEmployeeTask();
////		Task task = taskDao.getTaskById(2);
////		System.out.println(task);
////		EmployeeTask employeeTask = new EmployeeTask(2, task,
////				task.getTitle(), task.getNote());
////		employeeTaskDao.addEmployeeTask(employeeTask);
//////		employeeTaskDao.getAllEmployeeTask();
//////		employeeTaskDao.deleteEmployeeTask(3);
////		employeeTaskDao.getAllEmployeeTask();
////		employeeTask.setId(1);
////		employeeTask.setTaskName("����������");
////		employeeTaskDao.updateEmployeeTask(employeeTask);
////		employeeTaskDao.getAllEmployeeTask();
////		femaleHealthFormDao = new FemaleHealthFormDao();
//		employeeTaskDao = new EmployeeTaskDao();
//		List<EmployeeTask> allEmployeeTask = employeeTaskDao.getAllEmployeeTask();
//		maleHealthFormDao = new MaleHealthFormDao();
////		FemaleHealthForm femaleHealthForm = new FemaleHealthForm(1, "����", "��", "Ƣ", "��", "��", "��ע", "�ӹ�");
////		femaleHealthFormDao.addFemaleHealthForm(femaleHealthForm );
////		femaleHealthFormDao.deleteFemaleHealthForm(4);
////		femaleHealthForm.setKidney("��������");
////		femaleHealthForm.setId(3);
////		femaleHealthFormDao.updateFemaleHealthForm(femaleHealthForm);
////		femaleHealthFormDao.getFemaleHealthFormById(3);
////		femaleHealthFormDao.getAllFemaleHealthForm();
////		femaleHealthFormDao.getFemaleHealthFormByEmpId(1);
//		
////		MaleHealthForm maleHealthForm = new MaleHealthForm(1, "����", "��", "Ƣ", "��", "��", "��ע", "ǰ����");
////		maleHealthFormDao.addMaleHealthForm(maleHealthForm );
////		maleHealthFormDao.deleteMaleHealthForm(id)
////		maleHealthForm.setId(4);
////		maleHealthForm.setHeart("��������");
//		employeeTaskDao = new EmployeeTaskDao();
//		List<EmployeeTask> allEmployeeTask = employeeTaskDao.getAllEmployeeTask();
//		maleHealthFormDao = new MaleHealthFormDao();
//		MaleHealthForm maleHealthForm = maleHealthFormDao.getMaleHealthFormById(1);
////		maleHealthFormDao.updateMaleHealthForm(maleHealthForm);
////		maleHealthFormDao.getMaleHealthFormById(4);
////		maleHealthFormDao.getAllMaleHealthForm();
////		maleHealthFormDao.getMaleHealthFormByEmpId(1);
//		employeeTaskDao = new EmployeeTaskDao();
//		List<EmployeeTask> allEmployeeTask = employeeTaskDao.getAllEmployeeTask();
//		maleHealthFormDao = new MaleHealthFormDao();
//		MaleHealthForm maleHealthForm = maleHealthFormDao.getMaleHealthFormById(1);
//		workCardDao = new WorkCardDao();
//		WorkCard workCard = workCardDao.getWorkCardByEmpId(1);
//		maleHealthFormDao = new MaleHealthFormDao();
//		maleHealthFormDao.getMaleHealthFormByEmpId(1);
		testMaleEmpolyee();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		maleHealthFormDao.closeSqlsessionDao();
//		employeeTaskDao.closeSqlsessionDao();
		//		workCardDao.closeSession();
		new Test().closeSqlSession();
		
		/** ��ȡ��ǰ��ϵͳʱ�䣬���ʼʱ��������ǳ������еĺ�����������1000��������*/
		long endTime =  System.currentTimeMillis();
		long usedTime = (endTime-startTime)/1000;
		System.out.println("��ʱ��" + usedTime + "��");
		System.exit(0);
	}

	private static void testMaleEmpolyee() {
		employeeTaskDao = new EmployeeTaskDao();
		List<EmployeeTask> allEmployeeTask = employeeTaskDao.getAllEmployeeTask();
		maleHealthFormDao = new MaleHealthFormDao();
		MaleHealthForm maleHealthForm = maleHealthFormDao.getMaleHealthFormById(1);
		workCardDao = new WorkCardDao();
		WorkCard workCard = workCardDao.getWorkCardByEmpId(1);
		maleEmployeeDao = new MaleEmployeeDao();
		java.sql.Date birthday = new java.sql.Date(new java.util.Date().getTime());
		MaleEmployee maleEmployee = new MaleEmployee("���", birthday, "15011112222", "email@qq.com", "λ��", "��ע", workCard, allEmployeeTask, maleHealthForm);
//		maleEmployeeDao.addMaleEmployee(maleEmployee);
		
		maleEmployeeDao.getAllMaleEmployee();
		
//		maleEmployeeDao.getMaleEmployeeById(1);
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
		if (peopleMapper.addPeople(people, people.getName()) == 1) {
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
