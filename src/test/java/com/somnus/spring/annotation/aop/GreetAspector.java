package com.somnus.spring.annotation.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect  
@Component 
public class GreetAspector {
    /**@前置通知
     * 方法开始之前执行一段代码
     * @param joinPoint
     */
    @Before("execution(* com.somnus.spring.annotation.aop.GreetingImpl.*(..))")
    public void before(JoinPoint point) {
        String methodName = point.getSignature().getName();
        Method method = ((MethodSignature) point.getSignature()).getMethod();
        System.out.println(method.getName());
        Object[] args = point.getArgs();
        System.out.println("The method 【" + methodName + "】 begins with " + Arrays.asList(args));
    }
    
    /**@后置最终通知
     * 方法执行之后执行一段代码
     * 无论该方法是否出现异常
     * @param joinPoint
     */
    @After("execution(* com.somnus.spring.annotation.aop.GreetingImpl.*(..))")
    public void after(JoinPoint point) {
        String methodName = point.getSignature().getName();
        Object[] args = point.getArgs();
        System.out.println("The method 【" + methodName + "】 ends with " + Arrays.asList(args));
    }
    
    /**@后置返回通知
     * 方法正常结束后执行的代码，不包括抛出异常的情况
     * 返回通知是可以访问到方法的返回值的
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value="execution(* com.somnus.spring.annotation.aop.GreetingImpl.*(..))",returning="result")
    public void afterReturning(JoinPoint point,Object result) {
        String methodName = point.getSignature().getName();
        System.out.println("The method 【" + methodName + "】 return with " + result);
    }
    
    /**@后置异常通知
     * 在方法出现异常时会执行的代码
     * 可以访问到异常对象，可以指定在出现特定异常时在执行通知代码
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value="execution(* com.somnus.spring.annotation.aop.GreetingImpl.*(..))", throwing="ex")
    public void afterThrowing(JoinPoint point, Exception ex) {
        String methodName = point.getSignature().getName();
        System.out.println("The method " + methodName + " occurs exception: " + ex);
    }
    
    /**@环绕通知
     * 环绕通知需要携带ProceedingJoinPoint类型的参数
     * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
     * 而且环绕通知必须有返回值，返回值即为目标方法的返回值
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.somnus.spring.annotation.aop.GreetingImpl.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        System.out.println("target:" + point.getTarget());
        Method method = ((MethodSignature) point.getSignature()).getMethod();
        System.out.println(method.getName());
        String methodName = point.getSignature().getName();
        //执行目标方法
        try {
            //前置通知
            System.out.println("ARROUND-->The method 【" + methodName + "】 begins with 【" + Arrays.asList(point.getArgs()) +"】");
            result = point.proceed();
        } catch (Throwable e) {
            //后置异常通知【在方法出现异常时会执行的代码】
            System.out.println("ARROUND-->The method 【" + methodName + "】 occurs expection : 【" + e +"】");
            throw new RuntimeException(e);
        }
        //后置返回通知【方法正常结束后执行的代码，不包括抛出异常的情况】
        System.out.println("ARROUND-->The method 【" + methodName + "】 return with 【" + result +"】");
        return result;
    }
    
    /**
     * 用 AOP 的行话来讲，对方法的增强叫做 Weaving（织入），
     * 而对类的增强叫做 Introduction（引入）。
     * 而 Introduction Advice（引入增强）就是对类的功能增强，
     * 它也是 Spring AOP 提供的最后一种增强
     */
    @DeclareParents(value = "com.somnus.spring.annotation.aop.GreetingImpl", defaultImpl = ApologyImpl.class)  
    private Apology apology;
}




class GreetAspector2 {
	
	@Pointcut("execution(* com.somnus.spring.annotation.aop.GreetingImpl.*(..))")
	private void accountDataAccessOperation() {}
	
    /**@前置通知
     * 方法开始之前执行一段代码
     * @param joinPoint
     */
    @Before("accountDataAccessOperation()")
    public void before(JoinPoint point) {
        String methodName = point.getSignature().getName();
        Method method = ((MethodSignature) point.getSignature()).getMethod();
        System.out.println(method.getName());
        Object[] args = point.getArgs();
        System.out.println("The method 【" + methodName + "】 begins with " + Arrays.asList(args));
    }
    
    /**@后置最终通知
     * 方法执行之后执行一段代码
     * 无论该方法是否出现异常
     * @param joinPoint
     */
    @After("accountDataAccessOperation()")
    public void after(JoinPoint point) {
        String methodName = point.getSignature().getName();
        Object[] args = point.getArgs();
        System.out.println("The method 【" + methodName + "】 ends with " + Arrays.asList(args));
    }
    
    /**@后置返回通知
     * 方法正常结束后执行的代码，不包括抛出异常的情况
     * 返回通知是可以访问到方法的返回值的
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value="accountDataAccessOperation()",returning="result")
    public void afterReturning(JoinPoint point,Object result) {
        String methodName = point.getSignature().getName();
        System.out.println("The method 【" + methodName + "】 return with " + result);
    }
    
    /**@后置异常通知
     * 在方法出现异常时会执行的代码
     * 可以访问到异常对象，可以指定在出现特定异常时在执行通知代码
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value="accountDataAccessOperation()", throwing="ex")
    public void afterThrowing(JoinPoint point, Exception ex) {
        String methodName = point.getSignature().getName();
        System.out.println("The method " + methodName + " occurs exception: " + ex);
    }
    
    /**@环绕通知
     * 环绕通知需要携带ProceedingJoinPoint类型的参数
     * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
     * 而且环绕通知必须有返回值，返回值即为目标方法的返回值
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("accountDataAccessOperation()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        System.out.println("target:" + point.getTarget());
        Method method = ((MethodSignature) point.getSignature()).getMethod();
        System.out.println(method.getName());
        String methodName = point.getSignature().getName();
        //执行目标方法
        try {
            //前置通知
            System.out.println("ARROUND-->The method 【" + methodName + "】 begins with 【" + Arrays.asList(point.getArgs()) +"】");
            result = point.proceed();
        } catch (Throwable e) {
            //后置异常通知【在方法出现异常时会执行的代码】
            System.out.println("ARROUND-->The method 【" + methodName + "】 occurs expection : 【" + e +"】");
            throw new RuntimeException(e);
        }
        //后置返回通知【方法正常结束后执行的代码，不包括抛出异常的情况】
        System.out.println("ARROUND-->The method 【" + methodName + "】 return with 【" + result +"】");
        return result;
    }
    
    /**
     * 用 AOP 的行话来讲，对方法的增强叫做 Weaving（织入），
     * 而对类的增强叫做 Introduction（引入）。
     * 而 Introduction Advice（引入增强）就是对类的功能增强，
     * 它也是 Spring AOP 提供的最后一种增强
     */
    @DeclareParents(value = "com.somnus.spring.annotation.aop.GreetingImpl", defaultImpl = ApologyImpl.class)  
    private Apology apology;
}

