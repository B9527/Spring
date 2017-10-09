package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.aop.Apology;
import com.somnus.spring.annotation.aop.GreetingInterface;
import com.somnus.spring.annotation.aop.GreetingImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class AopSpringTest{
	
    @Test
    public void say1(){
        GreetingInterface greet = (GreetingInterface)ApplicationContextHolder.getBean(GreetingImpl.class);
        greet.goodMorning("Jack");
    }
    
    @Test
    public void say2(){
        GreetingInterface greet = (GreetingInterface) ApplicationContextHolder.getBean(GreetingImpl.class);
        greet.sayHello("Jack");  
   
        Apology apology = (Apology) greet; // 强制转型为 Apology 接口  
        apology.saySorry("Jack");
    }
}
