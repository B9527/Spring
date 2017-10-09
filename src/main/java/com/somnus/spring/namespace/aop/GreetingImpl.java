package com.somnus.spring.namespace.aop;

/** 
 * @Title: GreetingImpl.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:39:06 
 * @version V1.0 
 */
public class GreetingImpl implements GreetingInterface {
    
    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }
    @Override
    public void goodMorning(String name) {  
        System.out.println("Good Morning! " + name);  
    }
    @Override
    public void goodNight(String name) {  
        System.out.println("Good Night! " + name);  
    }
}
