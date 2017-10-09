package com.somnus.spring.xml.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.somnus.spring.xml.transaction.dao.LogDao;
import com.somnus.spring.xml.transaction.dao.UserDao;
import com.somnus.spring.xml.transaction.model.Log;
import com.somnus.spring.xml.transaction.model.User;

/**
 * A传播到B，A有事务，B也有事务
 * B最后抛出异常
 * 
 * A如果有事务，B就加入当前事务（方法B看到自己已经运行在 方法A的事务内部，就不再起新的事务，直接加入方法A）
 */
@Service
public class UserService01 {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LogService01 logService;
	/** 0 */
	@Transactional
    public void A() {
		userDao.insert(new User("admin","123456"));
		logService.B();
    }
}

@Service
class LogService01 {
	/** 0 */
	@Transactional
	public void B() {
		logDao.insert(new Log("abcdefghijklmn","192.168.1.1"));
    	System.out.println(1/0);
    }
	@Autowired
	private LogDao logDao;
}
