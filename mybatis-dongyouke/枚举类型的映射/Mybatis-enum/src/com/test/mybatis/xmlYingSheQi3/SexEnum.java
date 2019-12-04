package com.test.mybatis.xmlYingSheQi3;

public enum SexEnum {
	MALE(0, "ÄÐ"),
	FEMALE(1, "Å®");
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private SexEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SexEnum getSexById(int id) {
		SexEnum sex = null;
		SexEnum[] values = SexEnum.values();
		for (int i = 0; i < values.length; i++) {
			if(values[i].getId() == id) {
				sex = values[i];
				break;
			}
		}
		return sex;
	}
	
	
}
