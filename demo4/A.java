package com.siyu.demo4;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/18 21:08
 */
public class A extends B{

    public A(){

        super.getNum();
    }

    @Override
    public void getName() {
        System.out.println("A getName ============");
        super.getNum();
    }

}
