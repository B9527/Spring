package com.somnus.spring.xml.transaction.dao;

import com.somnus.spring.xml.transaction.annotation.MyBatisRepository;
import com.somnus.spring.xml.transaction.model.User;

@MyBatisRepository
public interface UserDao {

	void insert(User user);

}
