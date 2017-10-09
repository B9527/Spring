package com.somnus.spring.annotation.autowired;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service
public class DogService implements AnimalService , BeanNameAware{
	
	private String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
	@Override
	public String getBeanName(){
		return beanName;
	}
}
