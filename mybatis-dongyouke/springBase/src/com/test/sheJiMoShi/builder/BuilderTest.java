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
		System.out.println("开始吃饭");
	}

	public void sleep() {
		System.out.println("开始休息");
	}

	public void sitDown() {
		System.out.println("坐下");
	}

	public void standUp() {
		System.out.println("站起来");
	}

	public void run() {
		System.out.println("开始跑步");
	}

	public void jump() {
		System.out.println("开始跳");
	}

	// 建造者模式的核心函数：调度中心函数
	public void dispatchCenter() {
		// 循环一遍，谁在前，就先执行谁
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

	// 调度函数2
	public void dispatchTest2() {
		/*
		 * 调度函数 根据调度信息集合中的函数执行顺序来对应执行相应的函数 什么是调度函数 就是根据集合中的函数信息执行相应的函数
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
