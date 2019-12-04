package com.test.dynamicAgent.observer2;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer {

	@Override
	public void update(Observable o, Object detonateInfo) {
		if (detonateInfo == null) {
			System.out.println("观察者2未接收到触发消息");
			return;
		}
		System.out.println("观察者2已接收到触发消息 --> " + detonateInfo.toString());
	}

}
