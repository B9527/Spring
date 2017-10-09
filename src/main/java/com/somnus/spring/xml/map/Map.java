package com.somnus.spring.xml.map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Map {
	
	private java.util.Map<String,String> username;
	
	private java.util.Map<String,Address> address;
	
	public java.util.Map<String, String> getUsername() {
		return username;
	}

	public void setUsername(java.util.Map<String, String> username) {
		this.username = username;
	}

	public java.util.Map<String, Address> getAddress() {
		return address;
	}

	public void setAddress(java.util.Map<String, Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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