package com.somnus.spring.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.annotation.transaction.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-basic.xml")
public class TransactionSpringTest{
	@Test
	public void saveFailure(){
		UserService service = ApplicationContextHolder.getBean(UserService.class);
		System.out.println(service.getClass());
		service.B();
	}
	@Test
	public void saveSuccess(){
		UserService service = ApplicationContextHolder.getBean(UserService.class);
		System.out.println(service.getClass());
		service.B_();
	}
}
