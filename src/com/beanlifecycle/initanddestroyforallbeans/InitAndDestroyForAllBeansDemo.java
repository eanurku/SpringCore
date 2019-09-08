package com.beanlifecycle.initanddestroyforallbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyForAllBeansDemo {
    public static void main(String[] args) {
        ApplicationContext appcxt = new ClassPathXmlApplicationContext("resources/BeanLifecycleDefaultsMethods.xml");

        ((ClassPathXmlApplicationContext) appcxt).close();
    }
}
