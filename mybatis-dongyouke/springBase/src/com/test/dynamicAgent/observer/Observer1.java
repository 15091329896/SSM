package com.test.dynamicAgent.observer;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer{

	@Override
	public void update(Observable o, Object detonateInfo) {
		if(detonateInfo == null) {
			System.out.println("������1δ�յ������ź�");
			return;
		}
		System.out.println("������1�յ������ź�--> " + detonateInfo.toString());
	}

}
