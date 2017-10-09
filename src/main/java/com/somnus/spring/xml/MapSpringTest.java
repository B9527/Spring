package com.somnus.spring.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.xml.map.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-map.xml")
public class MapSpringTest{
	
	@Test
	public void load(){
		Map m1 = (Map)ApplicationContextHolder.getBean("m1");
		System.out.println(m1);
		
		Map m2 = (Map)ApplicationContextHolder.getBean("m2");
		System.out.println(m2);
	}
	
}
