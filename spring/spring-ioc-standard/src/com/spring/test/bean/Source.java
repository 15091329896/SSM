package com.spring.test.bean;

public class Source {
	private String fruit;
	private String sugar;
	private String size;

	public Source(String fruit, String sugar, String size) {
		this.fruit = fruit;
		this.sugar = sugar;
		this.size = size;
	}

	public Source() {
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Source [fruit=" + fruit + ", sugar=" + sugar + ", size=" + size + "]";
	}

}
