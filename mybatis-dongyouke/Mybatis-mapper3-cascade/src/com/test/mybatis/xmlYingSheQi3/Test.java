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
	 * 使用mybatis完成单表的增删改查 得到sqlSession对象 通过 sqlSession 对象得到映射器接口的实例
	 * 通过映射器实例调用映射器接口中的函数进行增删改查
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
		/** 获取当前系统时间*/
		long startTime =  System.currentTimeMillis();
		 
		
//		new Test().addPeople();
//		new Test().getAllPeople();
		// new Test().deletePeople();
		// new Test().updatePeople();
		// new Test().getPeople();
		// new Test().getAllPeople();
		
		/*
		 * 级联
		 * 		创建实体类
		 * 			员工
		 * 			员工任务
		 * 			
		 * 		创建数据表
		 * 			体检表父类
		 * 				男体检表
		 * 				女体检表
		 * 			员工
		 * 				男员工   男体检表属性
		 * 				女员工   女体检表属性
		 * 			工牌
		 * 				
		 * 			员工任务
		 * 			
		 * 
		 * 		创建映射器
		 * 			在映射器中定义级联
		 * 
		 * 		处理数据表和java对象的字段在数量和种类都不相同的情况
		 * 			使用类型处理器，在拿到数据表中的字段的之后，进行自定义的处理
		 * 		
		 * 			通过employee表映射出MaleEmployee和femaleEmployee
					对于java对象中的属性，数据表有的直接简单映射，
					没有的在类型处理器中根据数据表中的字段可以是任何字段，生成需要的java属性
					
					
					创建完全按照java类为基准的映射器
						接口
						sql文件
							在sql文件中，
							对于java对象中的属性，数据表有的直接简单映射，
							没有的在类型处理器中根据数据表中的字段可以是任何字段，生成需要的java属性
						
							定义类型处理器
								定义一个类型处理器类
								在全局配置文件中声明
								在sql配置文件中的resultMap里面使用
							
								
						
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
//		workCardDao = new WorkCardDao();
//		workCardDao.addWorkCard(new WorkCard(1, 1, "李白", "部门1", "15091329896", "地址1", "备注1"));
//		workCardDao.deleteWorkCard(3);
//		workCardDao.updateWorkCard(new WorkCard(1, 1, "李白", "部门1修改", "15091329896", "地址1", "备注1"));
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
////		employeeTask.setTaskName("任务名更新");
////		employeeTaskDao.updateEmployeeTask(employeeTask);
////		employeeTaskDao.getAllEmployeeTask();
////		femaleHealthFormDao = new FemaleHealthFormDao();
//		employeeTaskDao = new EmployeeTaskDao();
//		List<EmployeeTask> allEmployeeTask = employeeTaskDao.getAllEmployeeTask();
//		maleHealthFormDao = new MaleHealthFormDao();
////		FemaleHealthForm femaleHealthForm = new FemaleHealthForm(1, "心脏", "肝", "脾", "肺", "肾", "备注", "子宫");
////		femaleHealthFormDao.addFemaleHealthForm(femaleHealthForm );
////		femaleHealthFormDao.deleteFemaleHealthForm(4);
////		femaleHealthForm.setKidney("肾脏正常");
////		femaleHealthForm.setId(3);
////		femaleHealthFormDao.updateFemaleHealthForm(femaleHealthForm);
////		femaleHealthFormDao.getFemaleHealthFormById(3);
////		femaleHealthFormDao.getAllFemaleHealthForm();
////		femaleHealthFormDao.getFemaleHealthFormByEmpId(1);
//		
////		MaleHealthForm maleHealthForm = new MaleHealthForm(1, "心脏", "肝", "脾", "肺", "肾", "备注", "前列腺");
////		maleHealthFormDao.addMaleHealthForm(maleHealthForm );
////		maleHealthFormDao.deleteMaleHealthForm(id)
////		maleHealthForm.setId(4);
////		maleHealthForm.setHeart("心脏正常");
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
		
		/** 获取当前的系统时间，与初始时间相减就是程序运行的毫秒数，除以1000就是秒数*/
		long endTime =  System.currentTimeMillis();
		long usedTime = (endTime-startTime)/1000;
		System.out.println("耗时：" + usedTime + "秒");
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
		MaleEmployee maleEmployee = new MaleEmployee("李白", birthday, "15011112222", "email@qq.com", "位置", "备注", workCard, allEmployeeTask, maleHealthForm);
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
		if (peopleMapper.addPeople(people, people.getName()) == 1) {
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
