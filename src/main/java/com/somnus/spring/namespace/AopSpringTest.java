package com.somnus.spring.namespace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.namespace.aop.Apology;
import com.somnus.spring.namespace.aop.GreetingInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-aop-namespace.xml")
public class AopSpringTest{
	@Test
	public void say(){
		GreetingInterface greeting = (GreetingInterface) ApplicationContextHolder.getBean("greetingImpl"); 
		greeting.sayHello("Jack");
        
        /**将目标类强制向上转型为 Apology 接口（这是引入增强给我们带来的特性，也就是“接口动态实现”功能）*/
        Apology apology = (Apology) greeting;
        apology.saySorry("Jack");
        System.out.println(apology);
	}
	
}
