package com.somnus.spring.namespace.aop;

public class ApologyImpl implements Apology {  
   
    @Override  
    public void saySorry(String name) {  
        System.out.println("Sorry! " + name);  
    }  
}  
