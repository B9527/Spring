package com.somnus.spring.ybm;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

/** 
 * @Title: GreetingAfterAdvice.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:36:05 
 * @version V1.0 
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

    /* (non-Javadoc)
     * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(">>>>>>>>>>>>>>>>After Start>>>>>>>>>>>>>>>>>>>>");
        System.out.println("returnValue:" + returnValue);
        System.out.println("Method Name: " + method.getName());
        System.out.println("args:" + Arrays.toString(args));
        System.out.println("Target : " + target.getClass().getName());
        System.out.println("<<<<<<<<<<<<<<<<<After End<<<<<<<<<<<<<<<<<<<<<<");
    }

}
