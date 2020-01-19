package com.spring.test.common;

public class Blender {
	/**
	 * 完成搅拌的动作 搅拌的动作 根据输入的原料进行搅拌
	 * 
	 * 
	 */

	public String mix(String water, String fruit, String sugar) {
		String juice = "这是一杯由：--> \n液体：" + water + "\n水果：" + fruit +
				"\n糖量：" + sugar + "\n组成的果汁";
		return juice;
	}

}
