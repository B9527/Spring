package com.somnus.spring.annotation.list;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.somnus.spring.annotation.autowired.HumanService;

@Service
public class ListService {
	
	@Autowired
	private List<HumanService> list;
	
	public void say() {
		System.out.println(list);
	}
	
}
