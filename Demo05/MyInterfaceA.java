package com.siyu.Demo05;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/18 22:32
 */
public interface MyInterfaceA {
    public abstract void getA();

    public default void getA1() {
        System.out.println("A");
    }
}
