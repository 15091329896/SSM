package com.spring.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Book {
	private int id;
	private String name;

	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Book() {
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

	public void init() {
		System.out.println("执行自定义初始化方法");
	}

	public void destory() {
		System.out.println("执行自定义销毁方法");
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@Bean(name = "book2", initMethod = "init", destroyMethod = "destory")
	public Book fillBook() {
		Book book = new Book(1002, "《明哲言行录》");
		return book;
	}

	@Bean(name = "book3")
	public Book fillBook3() {
		Book book = new Book(1003, "《柏拉图对话集》");
		return book;
	}

}
