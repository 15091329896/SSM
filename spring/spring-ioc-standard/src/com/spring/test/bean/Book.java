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
		System.out.println("ִ���Զ����ʼ������");
	}

	public void destory() {
		System.out.println("ִ���Զ������ٷ���");
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@Bean(name = "book2", initMethod = "init", destroyMethod = "destory")
	public Book fillBook() {
		Book book = new Book(1002, "����������¼��");
		return book;
	}

	@Bean(name = "book3")
	public Book fillBook3() {
		Book book = new Book(1003, "������ͼ�Ի�����");
		return book;
	}

}
