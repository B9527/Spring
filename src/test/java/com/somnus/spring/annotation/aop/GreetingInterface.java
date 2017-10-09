package com.somnus.spring.annotation.aop;

public interface GreetingInterface {
	
    void sayHello(String name);

    /**
     * @param name
     */
    String goodMorning(String name);

    /**
     * @param name
     */
    void goodNight(String name);
}
