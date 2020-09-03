package com.siyu.Demo05;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/18 21:40
 */
public interface Person {
    public abstract void getName();
    public abstract void getAge();
    public default void getAddress(){
        System.out.println("getAddress");
    }
}
