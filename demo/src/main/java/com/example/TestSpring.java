package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean tb = context.getBean("TestBean", TestBean.class);
        System.out.println(tb.getName());
        context.close();
    }
    
}
