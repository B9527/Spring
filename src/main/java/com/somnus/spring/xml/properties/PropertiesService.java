package com.somnus.spring.xml.properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesService {
	
	private String ip;

	private String version;

	private Properties properties;

	public void sayIp() {
		System.out.println("[******IP*****]" + ip);
	}

	public void sayVersion() {
		System.out.println("[******version*****]" + version);
	}

	public void sayall() {
		Enumeration<?> en = properties.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String Property = properties.getProperty(key);
			System.out.println(key + "=" + Property);
		}
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
