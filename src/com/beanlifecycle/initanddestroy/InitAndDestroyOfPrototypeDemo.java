package com.beanlifecycle.initanddestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyOfPrototypeDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("resources/BeanLifecycleOfPrototype.xml");

        appcxt.getBean("student",Student.class);
        ((ClassPathXmlApplicationContext) appcxt).close();
    }
}
