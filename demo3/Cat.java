package com.siyu.demo3;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/16 22:00
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("sleep cat");
    }
}
