package com.siyu.demo8;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/27 21:21
 */
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method(int age) {
        System.out.println(age);
    }

    @Override
    public void getTime() {
        System.out.println("time");
    }
}
