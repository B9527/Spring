package com.somnus.spring.xml.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

/** 
 * @Title: GreetingBeforeAdvice.java 
 * @Package com.somnus.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午12:33:22 
 * @version V1.0 
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{

    /* (non-Javadoc)
     * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("===========================Before Start===========================");
        System.out.println("Method Name: " + method.getName());
        System.out.println("args:" + Arrays.toString(args));
        System.out.println("Target : " + target.getClass().getName());
        System.out.println("===========================Before  End===========================");
    }

}
