package com.siyu.demo07;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/20 21:44
 */
public abstract class Animal implements BehaviorInterface{
    public abstract void eat(String food);
    public void sleep(){
        System.out.println("sleep");
    }
}
