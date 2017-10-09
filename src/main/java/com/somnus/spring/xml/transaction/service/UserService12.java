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
 * A传播到B，A有事务，B也有事务
 * A最后抛出异常
 * 
 * A如果有事务，B就将当前事务挂起（方法A所在的事务就会挂起，方法B会起一个新的事务，等待方法B的事务完成以后，方法A才继续执行）。
 * 这就是 RROPAGATION_REQUIRES_NEW，意思就是创建了一个新事务，它和原来的事务没有任何关系了。
 * 【RROPAGATION_REQUIRES_NEW与 PROPAGATION_REQUIRED 的事务区别在于事务的回滚程度了。
 * 因为 方法B是新起一个事务，那么就是存在两个不同的事务。如果方法B已经提交，那么 方法A失败回滚，方法B是不会回滚的。
 * 如果方法B失败回滚，如果它抛出的异常被方法A捕获，方法A的事务仍然可能提交(主要看方法B抛出的异常是不是方法A会回滚的异常)】
 */
@Service
public class UserService12 {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LogService12 logService;
	/** 0 */
	@Transactional
    public void A() {
		userDao.insert(new User("admin","123456"));
		logService.B();
		System.out.println(1/0);
    }
}

@Service
class LogService12 {
	/** 1 */
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void B() {
		logDao.insert(new Log("abcdefghijklmn","192.168.1.1"));
    }
	@Autowired
	private LogDao logDao;
}
