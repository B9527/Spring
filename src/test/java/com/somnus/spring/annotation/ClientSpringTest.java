package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.autowired.AutowiredService;
import com.somnus.spring.annotation.autowired.ResourceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class ClientSpringTest{
	
	@Test
	public void resource(){
		ResourceService service = (ResourceService)ApplicationContextHolder.getBean(ResourceService.class);
		service.say();
	}
	
	@Test
	public void autowired(){
		AutowiredService service = (AutowiredService)ApplicationContextHolder.getBean(AutowiredService.class);
		service.say();
	}
}
