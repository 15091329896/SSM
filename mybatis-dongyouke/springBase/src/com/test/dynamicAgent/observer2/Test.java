package com.test.dynamicAgent.observer2;

public class Test {
	public static void main(String[] args) {
		/*
		 * 通过观察者模式实现触发器的复用，并实现被触发模块的互不干扰
		 * 实现
		 * 		测试类
		 * 			得到触发器对象
		 * 			得到观察者对象
		 * 			将观察者对象添加到触发器上
		 * 			使用触发器调用触发函数，触发函数自动执行观察者的被触发函数
		 * 		触发器
		 * 			必须继承可观察类 Observable
		 * 			保证触发器对象的唯一性（单例模式）
		 * 			为触发器对象添加观察者
		 * 			定义触发函数
		 * 				设置触发器对象的状态改变
		 * 				将触发器接收到的消息传递到观察者中
		 * 		观察者（被触发模块）
		 * 			必须实现观察者接口 Observer
		 * 			实现其中的update方法
		 * 			
		 * 
		 * 
		 * 
		 * */
		new Test().observerTest();
		
		System.exit(0);
	}

	private void observerTest() {
		/*
		 * 添加观察者到触发器
		 * 执行触发器函数
		 * */
		Detonate detonate = Detonate.getInstance();
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		detonate.addDetonateObserver(observer1);
		detonate.addDetonateObserver(observer2);
		detonate.detonateMethod("触发器被触发");
		
	}
}
