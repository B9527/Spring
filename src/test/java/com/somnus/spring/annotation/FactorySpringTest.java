package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.factory.BeanFactory.User;
import com.somnus.spring.annotation.factory.BeanFactory2.Info;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class FactorySpringTest{
	
	@Test
	public void load(){
		User user = (User)ApplicationContextHolder.getBean("user");
		System.out.println(user);
		User user2 = (User)ApplicationContextHolder.getBean("user");
		System.out.println(user2);
	}
	
	@Test
	public void load2(){
		Info user = (Info)ApplicationContextHolder.getBean("info");
		System.out.println(user);
	}
}
