package com.somnus.spring.ybm;

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
        Object result = null;
		try {
			before();
			result = invocation.proceed();
			after();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			result = "我瞎造的数据";
		}
        return result;
    }
 
    private void before() {
        System.out.println(">>>>Before");
        System.out.println(1/0);
    }
 
    private void after() {
        System.out.println(">>>>After");
    }
}
