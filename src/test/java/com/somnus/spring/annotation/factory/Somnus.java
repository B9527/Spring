package com.somnus.spring.annotation.factory;

import org.springframework.stereotype.Component;

@Component
public class Somnus{
	public String say(){
		return "静态工厂中的方法被执行！！!";
	}
}