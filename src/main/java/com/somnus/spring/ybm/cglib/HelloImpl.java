package com.somnus.spring.ybm.cglib;

/**
 * 这个实现类是没有接口的，CGLib如何为它生成代理对象呢
 * @Title: HelloImpl.java 
 * @Package com.somnus.proxy.cglib 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月3日 下午2:06:04 
 * @version V1.0
 */
public class HelloImpl{

    public void say(String name) {
        System.out.println("Hello! " + name);
    }

}