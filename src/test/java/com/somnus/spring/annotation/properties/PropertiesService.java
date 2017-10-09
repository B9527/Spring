package com.somnus.spring.annotation.properties;

import java.util.Enumeration;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesService {
	/*Spring 3 supports ${my.server.port:defaultValue}*/
	@Value("${system.port:80}")
	private String port;
	
	@Value("${system.ip}")
	private String ip;

	@Value("#{properties['system.version']}")
	private String version;
	
	@Value("#{properties['system.sign']?:'U29tbnVz572C57Kf6Iqx'}")
	private String sign;

	@Autowired
	private Properties properties;
	
	public void sayPort() {
		System.out.println("[******port*****]" + port);
	}

	public void sayIp() {
		System.out.println("[******IP*****]" + ip);
	}

	public void sayVersion() {
		System.out.println("[******version*****]" + version);
	}
	
	public void saySign() {
		System.out.println("[******sign*****]" + sign);
	}

	public void sayall() {
		Enumeration<?> en = properties.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String Property = properties.getProperty(key);
			System.out.println(key + "=" + Property);
		}
	}
}
