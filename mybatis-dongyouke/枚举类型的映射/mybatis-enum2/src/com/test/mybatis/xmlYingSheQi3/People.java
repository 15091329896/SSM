package com.test.mybatis.xmlYingSheQi3;

//@Alias("people")
public class People {
	private int id;
	private String name;
	private SexEnum sex;

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

	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	public People(int id, String name, SexEnum sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public People() {
		super();
	}

	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sex=" + sex.getName() + "]";
	}
}
