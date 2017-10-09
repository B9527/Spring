package com.somnus.spring.annotation.transaction;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	private String userSql = String.format("INSERT INTO T_USER VALUES ('%s','%s','%s')", "10000", "admin", "passw0rd");
	private String logSql  = String.format("INSERT INTO T_LOG VALUES ('%s','%s')", "10000", "first log");
	
	/* 
     * DEBUG [main] DataSourceTransactionManager :Acquired Connection [jdbc:mysql] for JDBC transaction
     * DEBUG [main] JdbcTemplate :Executing SQL update [INSERT INTO T_USER VALUES ('10000','admin','passw0rd')]
     * DEBUG [main] JdbcTemplate :SQL update affected 1 rows
     * DEBUG [main] JdbcTemplate :Executing SQL update [INSERT INTO T_LOG VALUES ('10000','first log')]
     * DEBUG [main] JdbcTemplate :SQL update affected 1 rows
     * DEBUG [main] DataSourceTransactionManager :Initiating transaction rollback
     * DEBUG [main] DataSourceTransactionManager :Rolling back JDBC transaction on Connection [jdbc:mysql]
     * DEBUG [main] DataSourceTransactionManager :Releasing JDBC Connection [jdbc:mysql] after transaction
     * DEBUG [main] DataSourceUtils :Returning JDBC Connection to DataSource
     */
	public void A() {
    	jdbcTemplate.update(logSql);
    	System.out.println(1/0);
    }
    @Transactional(propagation=Propagation.REQUIRED)
    public void B() {
    	jdbcTemplate.update(userSql);
    	A();
    }
    /**会全部插入，不会回滚*/
    /*@Transactional(propagation=Propagation.REQUIRED)
    public void B() {
    	jdbcTemplate.update(userSql);
    	try {
    		A();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
    }*/
    /********************************************************************/
    @Transactional
    public void A_() {
    	jdbcTemplate.update(logSql);
    }
    
    @Transactional(propagation=Propagation.REQUIRED)
    public void B_() {
    	jdbcTemplate.update(userSql);
    	A_();
    }
}
