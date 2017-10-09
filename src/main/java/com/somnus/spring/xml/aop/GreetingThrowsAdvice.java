package com.somnus.spring.xml.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/** 
 * @Title: GreetingThrowsAdvice.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:36:05 
 * @version V1.0 
 */
public class GreetingThrowsAdvice implements ThrowsAdvice {

    void afterThrowing(Throwable throwable){
        
    }
    
    void afterThrowing(Method m,Object[] os,Object target,Throwable throwable){
        
    }

}
