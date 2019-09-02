package com.beancreation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreationDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt = new ClassPathXmlApplicationContext("BeanCreation.xml");
        Student studentobj = (Student) appcxt.getBean("student");

        System.out.println(studentobj.toString());
        studentobj.setSname("monu");
        studentobj.setRegno("123");
        System.out.println(studentobj.toString());

    }
}
