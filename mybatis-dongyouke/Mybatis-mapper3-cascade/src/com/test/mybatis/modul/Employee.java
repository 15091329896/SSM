package com.test.mybatis.modul;

import java.sql.Date;
import java.util.List;

public class Employee {
	private long id;
	private String realName;
	private Date birthday;
	private String mobile;
	private String email;
	private String position;
	private String note;
	private WorkCard workCard;
	private List<EmployeeTask> employeeTasks = null;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public WorkCard getWorkCard() {
		return workCard;
	}

	public void setWorkCard(WorkCard workCard) {
		this.workCard = workCard;
	}

	public List<EmployeeTask> getEmployeeTasks() {
		return employeeTasks;
	}

	public void setEmployeeTasks(List<EmployeeTask> employeeTasks) {
		this.employeeTasks = employeeTasks;
	}

	public Employee(long id, String realName, Date birthday, String mobile, String email, String position, String note,
			WorkCard workCard, List<EmployeeTask> employeeTasks) {
		super();
		this.id = id;
		this.realName = realName;
		this.birthday = birthday;
		this.mobile = mobile;
		this.email = email;
		this.position = position;
		this.note = note;
		this.workCard = workCard;
		this.employeeTasks = employeeTasks;
	}

	public Employee(String realName, Date birthday, String mobile, String email, String position, String note,
			WorkCard workCard, List<EmployeeTask> employeeTasks) {
		super();
		this.realName = realName;
		this.birthday = birthday;
		this.mobile = mobile;
		this.email = email;
		this.position = position;
		this.note = note;
		this.workCard = workCard;
		this.employeeTasks = employeeTasks;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", realName=" + realName + ", birthday=" + birthday + ", mobile=" + mobile
				+ ", email=" + email + ", position=" + position + ", note=" + note + ", workCard=" + workCard
				+ ", employeeTasks=" + employeeTasks + "]";
	}

}
