package com.somnus.spring.ybm;

import org.springframework.aop.framework.ProxyFactory;

/** 
 * @Title: Client.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:37:49 
 * @version V1.0 
 */
public class BeforeAndAfterClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();     // 创建代理工厂
        proxyFactory.setTarget(new GreetingImpl());         // 射入目标类对象
        proxyFactory.addAdvice(new GreetingBeforeAdvice()); // 添加前置增强
        proxyFactory.addAdvice(new GreetingAfterAdvice());  // 添加后置增强 
 
        GreetingInterface greeting = (GreetingInterface) proxyFactory.getProxy(); // 从代理工厂中获取代理
        greeting.sayHello("Jack");                              // 调用代理的方法

    }

}
