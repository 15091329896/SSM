package com.test.mybatis.modul;

import java.sql.Date;
import java.util.List;

public class FemaleEmployee extends Employee {

	private FemaleHealthForm femaleHealthForm = null;

	public FemaleHealthForm getFemaleHealthFrom() {
		return femaleHealthForm;
	}

	public void setFemaleHealthFrom(FemaleHealthForm femaleHealthForm) {
		this.femaleHealthForm = femaleHealthForm;
	}

	public FemaleEmployee(long id, String realName, Date birthday, String mobile, String email, String position,
			String note, WorkCard workCard, List<EmployeeTask> employeeTasks, FemaleHealthForm femaleHealthForm) {
		super(id, realName, birthday, mobile, email, position, note, workCard, employeeTasks);
		this.femaleHealthForm = femaleHealthForm;
	}

	public FemaleEmployee() {
		super();
	}

	@Override
	public String toString() {
		return "FemaleEmployee [femaleHealthForm=" + femaleHealthForm + ", getFemaleHealthFrom()="
				+ getFemaleHealthFrom() + ", getId()=" + getId() + ", getRealName()=" + getRealName()
				+ ", getBirthday()=" + getBirthday() + ", getMobile()=" + getMobile() + ", getEmail()=" + getEmail()
				+ ", getPosition()=" + getPosition() + ", getNote()=" + getNote() + ", getWorkCard()=" + getWorkCard()
				+ ", getEmployeeTasks()=" + getEmployeeTasks() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
