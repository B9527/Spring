package com.somnus.spring.xml.transaction.model;

public class Log {
	
	private Integer id;
	
	private String content;
	
	private String ip;
	
	public Log(String content, String ip) {
		super();
		this.content = content;
		this.ip = ip;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
