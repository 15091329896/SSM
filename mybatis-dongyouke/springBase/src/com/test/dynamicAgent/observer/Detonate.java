package com.test.dynamicAgent.observer;

import java.util.Observable;
import java.util.Observer;

public class Detonate extends Observable{
	/*
	 * 触发器
	 * 		单例保证触发器对象的唯一性
	 * 		添加观察者
	 * 		定义触发函数
	 * 
	 * */
	
	
	private static Detonate instance;
	
	private Detonate() {}

	public static Detonate getInstance() {
		if(instance == null) {
			instance = new Detonate();
		}
		return instance;
	}

	public void addDetonateObserver(Observer observer) {
		this.addObserver(observer);
	}

	public void detonateMethod(String detonateInfo) {
		System.out.println(detonateInfo);
		//触发函数的标志是下面的两条指令
		this.setChanged();
		this.notifyObservers(detonateInfo);
	};
	
	
	
	
	
	
	
	
	
	
}
