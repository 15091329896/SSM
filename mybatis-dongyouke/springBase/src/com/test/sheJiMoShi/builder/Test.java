package com.test.sheJiMoShi.builder;

import java.util.ArrayList;

public class Test {
	/*
	 * ������ģʽ
	 * 		ʲô�ǽ�����ģʽ
	 * 		����ʵ�ֶ����еĺ����������ȵ�һ�ֵ���Ʒ���
	 * 		���û�н�����ģʽ��������ִ��˳���ǹ̶��ģ��޷���̬����
	 * 		ʲô�ǽ�����ģʽ
	 * 		���Ƕ�̬���ö����к�����ִ��˳��
	 * 		������ģʽ�ĺ����Ǳ���Ҫ�е��Ⱥ���
	 * 		���Ⱥ������Ǹ��ݵ�����Ϣ������������ִ��˳��ĺ���
	 * 		ΪʲôҪ�н�����ģʽ
	 * 		Ϊ��ʵ�ֶ����к���ִ��˳��Ķ�̬����
	 * 		
	 * ʵ��һ��ͨ��������ģʽʵ�ֶ����к���ִ��˳��̬���õ�ʵ��
	 * 		Ҫ�أ������࣬��ͨ��
	 * 		�����ഫ�������Ϣ������ִ����Щ�����Լ�ִ��˳����ʲô
	 * 		��ͨ�ࣺ����һ��ӵ�ж������������ִ����
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
