package com.siyu.demo8;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/23 21:33
 */
public class Test {
    public static void main(String[] args) {
/*        Body.Heart1 heart1 = new Body().new Heart1();
        heart1.getAge();*/

        MyInterface myInterface1 = new MyInterfaceImpl();
        myInterface1.getTime();
        myInterface1.method(1);
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method(int age) {
                System.out.println("我的年龄是:" + age);
            }

            @Override
            public void getTime() {
                System.out.println(new Date().getDate());
            }
        };
        myInterface.method(11);
        myInterface.getTime();

        new MyAbs() {
            @Override
            public void getName() {
                System.out.println("name");
            }
        }.getName();


    }
}
