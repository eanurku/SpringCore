package com.beanlifecycle.initanddestroybyannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAndDestroyByAnnotationsDemo1 {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("resources/BeanLifecycleAnnotations1.xml");
        Student st = appcxt.getBean("student", Student.class);
        System.out.println(st);
        ((ClassPathXmlApplicationContext) appcxt).close();

    }
}
