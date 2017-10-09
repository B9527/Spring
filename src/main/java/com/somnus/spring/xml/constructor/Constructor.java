package com.somnus.spring.xml.constructor;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Constructor {
	
	private String username;
	
	private Address address;

	public Constructor(String username, Address address) {
		super();
		this.username = username;
		this.address = address;
	}

	@Override
	public String toString() {
		return username + ToStringBuilder.reflectionToString(address, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
class Address{
	
	private String city;

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
}