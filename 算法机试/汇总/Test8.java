package com.test.mybatis.test;

import java.util.ArrayList;
import java.util.List;

public class Test8<T> {
	
	
	public static void main(String[] args) {
//		Test8<? extends List> test8 = new Test8<>();
//		test8 = new Test8<ArrayList>();
		
		List<?> list = new ArrayList<>();
//		list.set(0, "nii");
		
		List<String> list2 = new ArrayList<>();
		list2.set(0, "");
	}
}
