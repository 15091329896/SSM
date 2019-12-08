package com.test.mybatis.modul;

import java.sql.Date;
import java.util.List;

public class MaleEmployee extends Employee{
	private MaleHealthForm maleHealthForm = null;

	public MaleHealthForm getMaleHealthForm() {
		return maleHealthForm;
	}

	public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
		this.maleHealthForm = maleHealthForm;
	}

	public MaleEmployee(long id, String realName, Date birthday, String mobile, String email, String position,
			String note, WorkCard workCard, List<EmployeeTask> employeeTasks, MaleHealthForm maleHealthForm) {
		super(id, realName, birthday, mobile, email, position, note, workCard, employeeTasks);
		this.maleHealthForm = maleHealthForm;
	}

	public MaleEmployee(String realName, Date birthday, String mobile, String email, String position, String note,
			WorkCard workCard, List<EmployeeTask> employeeTasks, MaleHealthForm maleHealthForm) {
		super(realName, birthday, mobile, email, position, note, workCard, employeeTasks);
		this.maleHealthForm = maleHealthForm;
	}

	public MaleEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "MaleEmployee [maleHealthForm=" + maleHealthForm + ", getMaleHealthForm()=" + getMaleHealthForm()
				+ ", getId()=" + getId() + ", getRealName()=" + getRealName() + ", getBirthday()=" + getBirthday()
				+ ", getMobile()=" + getMobile() + ", getEmail()=" + getEmail() + ", getPosition()=" + getPosition()
				+ ", getNote()=" + getNote() + ", getWorkCard()=" + getWorkCard() + ", getEmployeeTasks()="
				+ getEmployeeTasks() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
