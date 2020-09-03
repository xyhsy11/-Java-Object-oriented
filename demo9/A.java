package com.siyu.demo9;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/27 21:04
 */
public class A {
    public void getMethod() {
        final int num = 9;
        class B {
            public void getNum() {
                System.out.println(num);
            }
        }
        B b = new B();
        b.getNum();
    }
}
