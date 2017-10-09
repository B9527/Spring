package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.properties.PropertiesService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class PropertiesSpringTest{
	
	@Test
	public void say(){
		PropertiesService service = (PropertiesService)ApplicationContextHolder.getBean(PropertiesService.class);
		System.out.println(service.getClass());
		service.sayPort();
		service.sayIp();
		service.sayVersion();
		service.saySign();
		service.sayall();
	}
}
