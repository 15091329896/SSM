package com.test.dynamicAgent.observer;

import java.util.Observable;
import java.util.Observer;

public class Detonate extends Observable{
	/*
	 * ������
	 * 		������֤�����������Ψһ��
	 * 		��ӹ۲���
	 * 		���崥������
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
		//���������ı�־�����������ָ��
		this.setChanged();
		this.notifyObservers(detonateInfo);
	};
	
	
	
	
	
	
	
	
	
	
}
