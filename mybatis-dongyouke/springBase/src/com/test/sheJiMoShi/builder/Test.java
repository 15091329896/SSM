package com.test.sheJiMoShi.builder;

import java.util.ArrayList;

public class Test {
	/*
	 * 建造者模式
	 * 		什么是建造者模式
	 * 		就是实现对象中的函数的灵活调度的一种的设计方法
	 * 		如果没有建造者模式，函数的执行顺序是固定的，无法动态配置
	 * 		什么是建造者模式
	 * 		就是动态配置对象中函数的执行顺序
	 * 		建造者模式的核心是必须要有调度函数
	 * 		调度函数就是根据调度信息决定其他函数执行顺序的函数
	 * 		为什么要有建造者模式
	 * 		为了实现对象中函数执行顺序的动态配置
	 * 		
	 * 实现一个通过建造者模式实现对象中函数执行顺序动态配置的实例
	 * 		要素：测试类，普通类
	 * 		测试类传入调度信息，就是执行哪些函数以及执行顺序是什么
	 * 		普通类：就是一个拥有多个函数动作的执行类
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		BuilderTest builderTest = new BuilderTest();
		ArrayList<String> dispatchInfo = new ArrayList<>();
		dispatchInfo.add("sleep");
		dispatchInfo.add("sitDown");
		dispatchInfo.add("run");
		dispatchInfo.add("standUp");
		dispatchInfo.add("jump");
		builderTest.setDispatchInfo(dispatchInfo);
		builderTest.dispatchTest2();
		
	}
	
	
	
	
	
}
