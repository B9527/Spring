package com.somnus.spring.xml.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/** 
 * @Title: GreetingAroundAdvice.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:43:36 
 * @version V1.0 
 */
public class GreetingAroundAdvice implements MethodInterceptor {
 
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        before();
        Object result = invocation.proceed();
        after();
        return result;
    }
 
    private void before() {
        System.out.println("---->>>>Before");
    }
 
    private void after() {
        System.out.println("---->>>>After");
    }
}
