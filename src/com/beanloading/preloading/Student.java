package com.beanloading.preloading;


public class Student {
    String sname;
    int id;

    public Student(String sname, int id) {
        this.sname = sname;
        this.id = id;
        System.out.println(" preloading.Student object instantiated...");
    }

    public String getSname() {
        return sname;
    }

    public int getId() {
        return id;
    }

}
