package com.test.dynamicAgent.observer;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer{

	@Override
	public void update(Observable o, Object detonateInfo) {
		if(detonateInfo == null) {
			System.out.println("������2δ�յ������ź�");
			return;
		}
		System.out.println("������2�յ������ź�--> " + detonateInfo.toString());
	}

}
