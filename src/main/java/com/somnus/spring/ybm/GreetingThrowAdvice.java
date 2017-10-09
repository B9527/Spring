package com.somnus.spring.ybm;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/** 
 * @Title: GreetingThrowAdvice.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午1:00:48 
 * @version V1.0 
 */
public class GreetingThrowAdvice implements ThrowsAdvice {
 
    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------- Throw Exception ----------");
        System.out.println("Target Class: " + target.getClass().getName());
        System.out.println("Method Name: " + method.getName());
        System.out.println("Exception Message: " + e.getMessage());
        System.out.println("-------------------------------------");
    }
}