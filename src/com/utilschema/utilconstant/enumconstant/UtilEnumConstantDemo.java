package com.utilschema.utilconstant.enumconstant;

import com.utilschema.utilconstant.enumconstant.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilEnumConstantDemo {
    public static void main(String[] args) {
        ApplicationContext appcontext = new ClassPathXmlApplicationContext("resources/UtilEnumConstant.xml");
        Student student = appcontext.getBean("student", Student.class);
        System.out.println(student);
    }
}
