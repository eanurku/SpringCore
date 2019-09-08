package com.utilschema.utilconstant.staticconstant;

public class Student {
    String sname;
    int id;
    int studentType;
    String depprefix;

    public Student(String sname, int id, int studentType) {
        this.sname = sname;
        this.id = id;
        this.studentType = studentType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", id=" + id +
                ", studentType=" + studentType +
                '}';
    }
}
