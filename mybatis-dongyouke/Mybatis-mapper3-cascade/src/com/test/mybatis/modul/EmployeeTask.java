package com.test.mybatis.modul;

public class EmployeeTask {
	private long id;
	private long empId;
	private Task task = null;
	private String taskName;
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

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public EmployeeTask(long id, long empId, Task task, String taskName, String note) {
		super();
		this.id = id;
		this.empId = empId;
		this.task = task;
		this.taskName = taskName;
		this.note = note;
	}
	
	

	public EmployeeTask(long empId, Task task, String taskName, String note) {
		super();
		this.empId = empId;
		this.task = task;
		this.taskName = taskName;
		this.note = note;
	}

	public EmployeeTask() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeTaskMapper [id=" + id + ", empId=" + empId + ", task=" + task + ", taskName=" + taskName + ", note="
				+ note + "]";
	}

}
