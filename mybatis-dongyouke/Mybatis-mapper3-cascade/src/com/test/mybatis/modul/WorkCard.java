package com.test.mybatis.modul;

public class WorkCard {
	private long id;
	private long empId;
	private String realName;
	private String department;
	private String mobile;
	private String position;
	private String note;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public WorkCard(long id, long empId, String realName, String department, String mobile, String position,
			String note) {
		super();
		this.id = id;
		this.empId = empId;
		this.realName = realName;
		this.department = department;
		this.mobile = mobile;
		this.position = position;
		this.note = note;
	}

	public WorkCard() {
		super();
	}

	@Override
	public String toString() {
		return "WorkCard [id=" + id + ", empId=" + empId + ", realName=" + realName + ", department=" + department
				+ ", mobile=" + mobile + ", position=" + position + ", note=" + note + "]";
	}

}
