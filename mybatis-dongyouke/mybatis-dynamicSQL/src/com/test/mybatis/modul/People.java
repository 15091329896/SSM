package com.test.mybatis.modul;

//@Alias("people")
public class People {
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

	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public People() {
		super();
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}

}
