package com.test.dynamicAgent.observer2;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer{

	@Override
	public void update(Observable o, Object detonateInfo) {
		if (detonateInfo == null) {
			System.out.println("�۲���1δ���յ�������Ϣ");
			return;
		}
		System.out.println("�۲���1�ѽ��յ�������Ϣ --> " + detonateInfo.toString());
		
	}

}
