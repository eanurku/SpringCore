package com.beancreation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreationDemo {
    public static void main(String[] args) {

        ApplicationContext appcxt1 = new ClassPathXmlApplicationContext("resources/BeanCreation.xml");
        Student studentobj = (Student) appcxt1.getBean("student");

        System.out.println(studentobj.toString());
        studentobj.setSname("monu");
        studentobj.setRegno("123");
        System.out.println(studentobj.toString());


        ApplicationContext appcxt2 = new ClassPathXmlApplicationContext("BeanCreation.xml");
        Student student = appcxt2.getBean("student", Student.class);
        System.out.println(student.toString());



    }
}
