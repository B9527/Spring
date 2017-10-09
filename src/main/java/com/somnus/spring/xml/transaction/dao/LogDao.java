package com.somnus.spring.xml.transaction.dao;

import com.somnus.spring.xml.transaction.annotation.MyBatisRepository;
import com.somnus.spring.xml.transaction.model.Log;

@MyBatisRepository
public interface LogDao {

	void insert(Log log);

}
