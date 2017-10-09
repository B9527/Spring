package com.somnus.spring.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.xml.constructor.Constructor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-constructor.xml")
public class ConstructorSpringTest{
	
	@Test
	public void load(){
		Constructor c1 = (Constructor)ApplicationContextHolder.getBean("c1");
		System.out.println(c1);
		
		Constructor c2 = (Constructor)ApplicationContextHolder.getBean("c2");
		System.out.println(c2);
	}
	
}
