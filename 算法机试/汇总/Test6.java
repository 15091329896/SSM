package com.test.mybatis.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Test6<K, V> {
	Map<K, V> map = new HashMap<K, V>();

	public void put(K k, V v) {
		map.put(k, v);
	}

	public V get(K k) {
		return map.get(k);
	}

	public Map<K, V> getMap() {
		return map;
	}

	public void setMap(Map<K, V> map) {
		this.map = map;
	}
	
	public static void main(String[] args) {
//		Test6<Integer, String> test6 = new Test6<>();
//		for (int i = 0; i < 6; i++) {
//			test6.put(i, "我是泛型类对象" + i);
//		}
//		for (int i = 0; i < test6.getMap().size(); i++) {
//			System.out.println(test6.get(i));
//		}
		
		Vector<String> vector = new Vector<>();
		for (int i = 0; i < 5; i++) {
			vector.addElement("vector元素" + i);
		}
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		
		
	}

}
