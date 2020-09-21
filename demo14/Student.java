package com.siyu.demo14;

import java.util.Objects;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/12 10:48
 */
public class Student {
    private String name;
    private int age;


    public void getInfo(int... values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
