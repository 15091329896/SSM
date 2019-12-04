package com.test.dynamicAgent.observer;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer{

	@Override
	public void update(Observable o, Object detonateInfo) {
		if(detonateInfo == null) {
			System.out.println("触发器1未收到触发信号");
			return;
		}
		System.out.println("触发器1收到触发信号--> " + detonateInfo.toString());
	}

}
