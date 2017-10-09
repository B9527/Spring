package com.somnus.spring.annotation.autowired;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class ResourceService {
	
	@Resource(name="peopleService")
	private HumanService service1;
	
	@Resource(name="personService")
	private HumanService service2;
	
	@Resource
	private AnimalService service;
	
	public void say(){
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service + "-->" + service.getBeanName());
	}

}
