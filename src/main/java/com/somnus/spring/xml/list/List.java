package com.somnus.spring.xml.list;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class List {
	
	private java.util.List<String> username;
	
	private java.util.List<Address> address;

	public java.util.List<String> getUsername() {
		return username;
	}

	public void setUsername(java.util.List<String> username) {
		this.username = username;
	}

	public java.util.List<Address> getAddress() {
		return address;
	}

	public void setAddress(java.util.List<Address> address) {
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