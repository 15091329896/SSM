package com.test.dynamicAgent.observer;

public class Test {
	public static void main(String[] args) {
		/*
		 * 观察者模式
		 * 		什么是观察者模式
		 * 		就是实现触发器的复用
		 * 		观察者模式实现同一个触发器触发多个被触发模块，同时实现多个被触发模块之间互不干扰
		 * 		为什么要使用观察者模式
		 * 		为了实现触发器的复用，观察者模式就是将原来混为一体的触发器，执行器分隔开，提高代码的复用性和维护的清晰性
		 * 		为了实现触发器之间和被触发模块之间的分离，将原来混为一体的触发器和被触发模块分开成两个模块，实现代码结构的清晰和易维护性
		 * 		
		 * 		如何实现一个触发器
		 * 		需要的元素：
		 * 			触发器（可被观察者）：必须     继承    可观察类 Observable
		 * 			至少两个观察者：    分别必须    实现      观察者接口 Observer
		 * 			测试类：指定观察者由那个触发器来触发
		 * 
		 * 
		 * 		实现观察者模式
		 * 			测试类
		 * 				分别得到触发器和观察者对象
		 * 				通过触发器对象将观察者添加到触发器上
		 * 				通过触发器对象执行触发函数
		 * 
		 * 			触发器 detonate
		 * 				继承可观察类
		 * 				使用构造函数私有模式，放弃触发器被篡改
		 * 				外部通过getInstance得到唯一的触发器对象
		 * 				完成下面两件事
		 * 					添加观察者
		 * 						内建函数addObserver
		 * 					定义触发函数
		 * 						实现业务逻辑
		 * 						设置当前触发器状态已经被修改 this.setChanged()
        						将触发器收到的信息传递给观察者this.notifyObservers(Object);
		 * 			观察者Observer
		 * 				实现观察者 接口  Observer
		 * 				实现update函数
		 * 					实现相应的业务逻辑
		 * */
		
		new Test().observerTest1();
		
		System.exit(0);
	}

	private void observerTest1() {
		/*
		 * 得到触发器和观察者对象
		 * 将观察者对象添加到触发器上
		 * 通过触发器对象调用触发函数
		 * 
		 * */
		Detonate detonate = Detonate.getInstance();  
		Observer1 observer1 = new Observer1(); 
		Observer2 observer2 = new Observer2();
		detonate.addDetonateObserver(observer2);
		detonate.addDetonateObserver(observer1);
		detonate.detonateMethod("触发器被触发");
		
	}
}
