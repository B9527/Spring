package com.somnus.spring.annotation.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanFactory {
	
	@Bean(name="user")
	public static User getInstance(Somnus somnus){
		System.out.println(somnus.say());
		return new User();
	}
	
	public static class User{
		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}