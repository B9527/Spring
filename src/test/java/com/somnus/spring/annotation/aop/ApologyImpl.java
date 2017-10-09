package com.somnus.spring.annotation.aop;

public class ApologyImpl implements Apology {  
   
    @Override  
    public void saySorry(String name) {  
        System.out.println("Sorry! " + name);  
    }  
}  
