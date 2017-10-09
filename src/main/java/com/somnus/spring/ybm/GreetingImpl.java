package com.somnus.spring.ybm;

/** 
 * @Title: Greet.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:39:06 
 * @version V1.0 
 */
public class GreetingImpl implements GreetingInterface {
    
    @Override
    public String sayHello(String name) {
        System.out.println("Hello! " + name);
        return name;
    }
}
