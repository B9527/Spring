package com.somnus.spring.annotation.aop;

import org.springframework.stereotype.Component;

/** 
 * @Title: GreetingImpl.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:39:06 
 * @version V1.0 
 */
@Component
public class GreetingImpl implements GreetingInterface {
    
    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }
    
    @Override
    public String goodMorning(String name) {  
        System.out.println("Good Morning! " + name);  
        return name.concat(" Good Morning! ");
    }
    
    @Override
    public void goodNight(String name) {  
        System.out.println("Good Night! " + name);  
    }
}
