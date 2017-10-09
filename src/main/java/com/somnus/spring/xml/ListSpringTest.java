package com.somnus.spring.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.xml.list.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-list.xml")
public class ListSpringTest{
	
	@Test
	public void load(){
		List l1 = (List)ApplicationContextHolder.getBean("l1");
		System.out.println(l1);
		
		List l2 = (List)ApplicationContextHolder.getBean("l2");
		System.out.println(l2);
	}
	
}
