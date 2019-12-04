package com.test.dynamicAgent.interceptor;

public class PrintImpl implements Print{

	@Override
	public void printString(String string) {
		System.out.println(string);
	}

}
