package com.spring.test.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="TestAnnoIOCBean")
//@Component(value="TestAnnoIOCBean" )
public class TestAnnoIOCBean {
	@Value("1001")
	private int id;
	@Value("IOCTESTName")
	private String name;
	
	
	public TestAnnoIOCBean() {
		super();
	}


	public TestAnnoIOCBean(int id, String name) {
		this.id = id;
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


	@Override
	public String toString() {
		return "TestAnnoIOCBean [id=" + id + ", name=" + name + "]";
	}
	
}
