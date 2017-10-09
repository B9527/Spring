package com.somnus.spring.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.xml.aop.Apology;
import com.somnus.spring.xml.aop.GreetingInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-aop-xml.xml")
public class AopSpringTest{
	@Test
	public void say(){
	    /**从 Context 中根据 id 获取 Bean 对象（其实就是一个代理）*/
	    GreetingInterface greeting = (GreetingInterface) ApplicationContextHolder.getBean("greetingProxy"); 
	    greeting.sayHello("Jack"); 
	}
	
	@Test
    public void say2(){
        /**从 Context 中根据 id 获取 Bean 对象（其实就是一个代理）*/
		GreetingInterface greeting = (GreetingInterface) ApplicationContextHolder.getBean("greetingProxy2"); 
		greeting.sayHello("Jack");
        
        /**将目标类强制向上转型为 Apology 接口（这是引入增强给我们带来的特性，也就是“接口动态实现”功能）*/
        Apology apology = (Apology) greeting;
        apology.saySorry("Jack");
        System.out.println(apology);
    }
	
	@Test
    public void say3(){
        /**从 Context 中根据 id 获取 Bean 对象（其实就是一个代理）*/
	    GreetingInterface greeting = (GreetingInterface) ApplicationContextHolder.getBean("greetingProxy3");
        greeting.sayHello("Jack");
        greeting.goodMorning("Jack");
    }
}
