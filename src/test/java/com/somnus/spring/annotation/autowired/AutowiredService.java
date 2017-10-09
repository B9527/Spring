package com.somnus.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AutowiredService {
	
	@Autowired
	@Qualifier("peopleService")  
	private HumanService service1;
	
	@Qualifier("personService")  
	@Autowired
	private HumanService service2;
	
	@Autowired
	private AnimalService service;
	
	public void say(){
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service + "-->" + service.getBeanName());
	}

}
