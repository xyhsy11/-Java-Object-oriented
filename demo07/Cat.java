package com.siyu.demo07;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/20 21:44
 */
public final class Cat extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("猫吃" + food);
    }


    @Override
    public void catchMouse(){
        System.out.println("catchMouse");
    }
}
