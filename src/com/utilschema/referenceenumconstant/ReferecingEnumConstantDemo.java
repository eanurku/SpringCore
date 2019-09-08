package com.utilschema.referenceenumconstant;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferecingEnumConstantDemo {
    public static void main(String[] args) {

        ApplicationContext appcontext = new ClassPathXmlApplicationContext("resources/EnumConstants.xml");
        Student student1 = appcontext.getBean("student", Student.class);
        System.out.println(student1);


    }
}
