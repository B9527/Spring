package com.somnus.spring.xml.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.somnus.spring.xml.transaction.dao.LogDao;
import com.somnus.spring.xml.transaction.dao.UserDao;
import com.somnus.spring.xml.transaction.model.Log;
import com.somnus.spring.xml.transaction.model.User;

/**
 * A传播到B，A没有事务，B有事务
 * B最后抛出异常
 * 
 * A如果没有事务，B就开启一个事务(方法B运行的时候发现自己没有在事务中，它就会为自己分配一个事务)；
 */
@Service
public class UserService13 {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LogService13 logService;
	/** 1 */
    public void A() {
		userDao.insert(new User("admin","123456"));
		logService.B();
    }
}

@Service
class LogService13 {
	/** 0 */
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void B() {
		logDao.insert(new Log("abcdefghijklmn","192.168.1.1"));
    	System.out.println(1/0);
    }
	@Autowired
	private LogDao logDao;
}
