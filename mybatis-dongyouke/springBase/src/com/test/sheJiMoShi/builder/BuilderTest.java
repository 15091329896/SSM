package com.test.sheJiMoShi.builder;

import java.util.ArrayList;

public class BuilderTest {

	private ArrayList<String> dispatchInfo;

	public ArrayList<String> getDispatchInfo() {
		return dispatchInfo;
	}

	public void setDispatchInfo(ArrayList<String> dispatchInfo) {
		this.dispatchInfo = dispatchInfo;
	}

	public void eat() {
		System.out.println("��ʼ�Է�");
	}

	public void sleep() {
		System.out.println("��ʼ��Ϣ");
	}

	public void sitDown() {
		System.out.println("����");
	}

	public void standUp() {
		System.out.println("վ����");
	}

	public void run() {
		System.out.println("��ʼ�ܲ�");
	}

	public void jump() {
		System.out.println("��ʼ��");
	}

	// ������ģʽ�ĺ��ĺ������������ĺ���
	public void dispatchCenter() {
		// ѭ��һ�飬˭��ǰ������ִ��˭
		for (int i = 0; i < this.dispatchInfo.size(); i++) {
			String actionName = this.dispatchInfo.get(i);
			if (actionName.equalsIgnoreCase("run")) {
				this.run();
			} else if (actionName.equalsIgnoreCase("sleep")) {
				this.sleep();
			} else if (actionName.equalsIgnoreCase("jump")) {
				this.jump();
			} else if (actionName.equalsIgnoreCase("sitdown")) {
				this.sitDown();
			} else if (actionName.equalsIgnoreCase("standup")) {
				this.standUp();
			} else if (actionName.equalsIgnoreCase("eat")) {
				this.eat();
			}
		}
	}

	// ���Ⱥ���2
	public void dispatchTest2() {
		/*
		 * ���Ⱥ��� ���ݵ�����Ϣ�����еĺ���ִ��˳������Ӧִ����Ӧ�ĺ��� ʲô�ǵ��Ⱥ��� ���Ǹ��ݼ����еĺ�����Ϣִ����Ӧ�ĺ���
		 * 
		 */
		ArrayList<String> dispatchInfo = this.dispatchInfo;
		for (int i = 0; i < dispatchInfo.size(); i++) {
			String methodName = dispatchInfo.get(i);
			switch (methodName) {
				case "eat":
					this.eat();
					break;
				case "sleep":
					this.sleep();
					break;
				case "jump":
					this.jump();
					break;
				case "sitDown":
					this.sitDown();
					break;
				case "standUp":
					this.standUp();
					break;
				case "run":
					this.run();
					break;
				default:
					break;
			}
		}
	}
	
	
	

}
