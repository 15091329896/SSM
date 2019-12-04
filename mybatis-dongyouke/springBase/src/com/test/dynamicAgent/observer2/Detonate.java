package com.test.dynamicAgent.observer2;

import java.util.Observable;
import java.util.Observer;

public class Detonate extends Observable {

	private static Detonate instance;

	private Detonate() {
	}

	public static Detonate getInstance() {
		if (instance == null) {
			instance = new Detonate();
		}
		return instance;
	}

	public void addDetonateObserver(Observer observer) {
		this.addObserver(observer);
	}

	public void detonateMethod(String string) {
		System.out.println(string);
		this.setChanged();
		this.notifyObservers(string);
	}

}
