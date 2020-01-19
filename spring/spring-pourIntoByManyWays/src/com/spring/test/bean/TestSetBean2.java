package com.spring.test.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestSetBean2 {
	private int id;
	private String name;
	private Set<User> set;
	private Map<Role, User> map;
	private List<Role> list;
	private Role[] array;

	public TestSetBean2() {
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

	public Set<User> getSet() {
		return set;
	}

	public void setSet(Set<User> set) {
		this.set = set;
	}

	public Map<Role, User> getMap() {
		return map;
	}

	public void setMap(Map<Role, User> map) {
		this.map = map;
	}

	public List<Role> getList() {
		return list;
	}

	public void setList(List<Role> list) {
		this.list = list;
	}

	public Role[] getArray() {
		return array;
	}

	public void setArray(Role[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "TestSetBean2 [id=" + id + ", name=" + name + ", set=" + set + ", map=" + map + ", list=" + list
				+ ", array=" + Arrays.toString(array) + "]";
	}

}
