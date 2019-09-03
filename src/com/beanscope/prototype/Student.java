package com.beanscope.prototype;

public class Student {
    String sname;
    int id;

    public Student(String sname, int id) {
        this.sname = sname;
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", id=" + id +
                '}';
    }
}
