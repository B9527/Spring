package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.map.MapService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class MapSpringTest{
	
	@Test
	public void say(){
		MapService service = (MapService)ApplicationContextHolder.getBean(MapService.class);
		service.say();
	}
}
