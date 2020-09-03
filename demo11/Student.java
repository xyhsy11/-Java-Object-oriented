package com.siyu.demo11;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/30 10:25
 */
public class Student {
    private String name;
    private int age;

    private Student() {

    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
