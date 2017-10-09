package com.somnus.spring.ybm.cglib;

/** 
 * @description: TODO 
 * @author Somnus
 * @date 2015年3月9日 上午9:05:41  
 */
public class CglibClient {
	public static void main(String[] args) {
	    CglibProxy cglib = new CglibProxy();
	    
	    HelloImpl proxy = (HelloImpl)cglib.getProxy(new HelloImpl());
		proxy.say("Somnus");
		/**-->>com.somnus.aop.framework.HelloImpl$$EnhancerByCGLIB$$76ef73d9@2bd8e0f3*/
		/*System.out.println("-->>"+proxy);*/
		
		System.out.println("*****************************************************************");
		
		HelloImpl proxy2 = (HelloImpl)cglib.getProxy(HelloImpl.class);
		proxy2.say("Somnus");
	}
}
