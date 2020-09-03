package com.siyu.demo;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

     int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("Student eat");
    }

}
