package com.somnus.spring.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.somnus.ApplicationContextHolder;
import com.somnus.spring.xml.transaction.service.UserService01;
import com.somnus.spring.xml.transaction.service.UserService02;
import com.somnus.spring.xml.transaction.service.UserService03;
import com.somnus.spring.xml.transaction.service.UserService04;
import com.somnus.spring.xml.transaction.service.UserService11;
import com.somnus.spring.xml.transaction.service.UserService11_;
import com.somnus.spring.xml.transaction.service.UserService12;
import com.somnus.spring.xml.transaction.service.UserService13;
import com.somnus.spring.xml.transaction.service.UserService14;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-transaction.xml",
		"classpath:spring-mybatis.xml"})
public class TransactionSpringTest {
	
	@Test
	public void test01(){
		UserService01 service = ApplicationContextHolder.getBean(UserService01.class);
		System.out.println(service.getClass());
		service.A();
	}
	@Test
	public void test02(){
		UserService02 service = ApplicationContextHolder.getBean(UserService02.class);
		System.out.println(service.getClass());
		service.A();
	}
	
	@Test
	public void test03(){
		UserService03 service = ApplicationContextHolder.getBean(UserService03.class);
		System.out.println(service.getClass());
		service.A();
	}
	@Test
	public void test04(){
		UserService04 service = ApplicationContextHolder.getBean(UserService04.class);
		System.out.println(service.getClass());
		service.A();
	}
	
	///////////////////////////////////////////////////////////////////
	
	@Test
	public void test11(){
		UserService11 service = ApplicationContextHolder.getBean(UserService11.class);
		System.out.println(service.getClass());
		service.A();
	}
	@Test
	public void test11_(){
		UserService11_ service = ApplicationContextHolder.getBean(UserService11_.class);
		System.out.println(service.getClass());
		service.A();
	}
	@Test
	public void test12(){
		UserService12 service = ApplicationContextHolder.getBean(UserService12.class);
		System.out.println(service.getClass());
		service.A();
	}
	
	@Test
	public void test13(){
		UserService13 service = ApplicationContextHolder.getBean(UserService13.class);
		System.out.println(service.getClass());
		service.A();
	}
	@Test
	public void test14(){
		UserService14 service = ApplicationContextHolder.getBean(UserService14.class);
		System.out.println(service.getClass());
		service.A();
	}
	
}
