package com.test.dynamicAgent.agentChain;

public class Test {

	public static void main(String[] args) {
		/*
		 * 代理链或者责任链
		 * 		为什么要有责任链
		 * 		为了实现多套代理逻辑的灵活替换和灵活组合
		 * 		怎样实现多套代理逻辑的灵活替换
		 * 		直接替换拦截器的响应的实现类即可
		 * 		怎样实现多套代理逻辑之间的灵活组合
		 * 		将需要最后被执行的代理逻辑同真实对象直接绑定，将得到的这个代理对象作为新的真实对象
		 * 		将其绑定到倒数第二个需要被执行的代理逻辑上
		 * 		总体原则是前置处理步骤离真实对象越近，被执行的顺序越靠后，前置步骤离真实对象越远，被执行的顺序越靠前
		 * 		后置处理的执行顺序相反
		 * 		如果希望前置处理的步骤最先被执行，那这套代理逻辑所在的代理工具就应该放在最外层与真实对象进行绑定
		 * 		代理工具，拦截器接口，拦截器实现类，真实对象之间的关系
		 * 		代理工具和真实对象之间的关系是一对多，需要哪些对象被代理，只需要执行同一个代理工具的对象绑定函数即可
		 * 		代理工具和拦截器之间的关系是一对多，本次绑定需要使用哪个拦截器，只需要在绑定真实对象的同时传入具体的拦截器的全限定类名即可
		 * 		拦截器和拦截器接口之间的关系是多对一，代理只需要一个拦截器接口就够了，不同的代理逻辑在不同的拦截器实现类中定义即可，使用到哪个代理逻辑，在代理工具中传入即可
		 * 
		 * 
		 * 		实现请假单，首先被项目经理审批，再被部分经理，再被人事审批这样的代理顺序的责任链
		 * 
		 * 		需要定义
		 * 			一个拦截器接口
		 * 			三个拦截器接口的实现类
		 * 			一个请假单的接口
		 * 			一个请假单接口的实现类
		 * 			一个代理工具类
		 * 			一个运行主类，实现三个代理工具的顺序配合
		 * 			
		 * 		
		 * 		开始
		 * 		
		 * 		得到代理工具
		 * 		使用代理工具完成真实对象的绑定
		 * 		按照顺序，先绑定最后执行的人事代理逻辑到真实对象上，依次是部门经理，最后是项目经理
		 * 		然后通过最后的项目经理的代理对象来执行真实对象中的申请函数
		 * 
		 * 
		 * */
		new Test().chain();
//		new Test().inteceptorTest();
		
	}

	private void inteceptorTest() {
		/*
		 * 动态配置拦截器
		 * 		得到代理工具
		 * 		使用代理工具进行真实对象的绑定得到代理对象
		 * 		使用代理对象开始代理逻辑的函数调用
		 * 		
		 * 
		 * 
		 * */
		
		AgentTool agentTool = new AgentTool();
		MyRequest myRequest = (MyRequest) agentTool.bind(new RequestImpl(), "com.test.dynamicAgent.agentChain.InterceptorRenShi");
		
		myRequest.shen_qing();
		
		
		
	}

	private void chain() {
		/*
		 * 代理工具
		 * 绑定真实对象
		 * 执行真实对象的函数
		 * 
		 * 
*/		
		AgentTool agentTool = new AgentTool();
		MyRequest ren_shi = (MyRequest) agentTool.bind(new RequestImpl(), "com.test.dynamicAgent.agentChain.InterceptorRenShi");
		MyRequest bu_men = (MyRequest) agentTool.bind(ren_shi, "com.test.dynamicAgent.agentChain.InterceptorBuMenJingLi");
		bu_men.shen_qing();
		
	}

}
