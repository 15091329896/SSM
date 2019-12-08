package com.test.mybatis.xmlYingSheQi3;

public class Man extends People{
	private String manNote;

	public String getNote() {
		return manNote;
	}

	public void setNote(String note) {
		this.manNote = note;
	}

	@Override
	public String toString() {
		return "Man [manNote=" + manNote + ", getNote()=" + getNote() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public Man(int id, String name, String note) {
		super(id, name);
		this.manNote = note;
	}

	public Man() {
		super();
	}

	
	
	
}
