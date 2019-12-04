package com.test.modul;

public class Book {
	private int id;
	private String name;
	private int age;

	public Book() {
		super();
	}

	
	
	public Book(Integer id) {
		super();
		this.id = id;
	}

	public Book(String name) {
		super();
		this.name = name;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", age=" + age + "]";
		
	}

	public void printHello() {
		System.out.println("hello2");
	}
	
	public void printString(String string) {
		System.out.println(string);
	}
	
}
