package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.list.ListService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class ListSpringTest{
	
	@Test
	public void say(){
		ListService service = (ListService)ApplicationContextHolder.getBean(ListService.class);
		service.say();
	}
}
