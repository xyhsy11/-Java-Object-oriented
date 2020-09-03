package com.siyu.demo2;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/16 21:19
 */
public class B extends C{

    public B(){
        super.getMethod();
    }
    @Override
    public void cMethod(){
        System.out.println("I am bMethod");

    }
    @Override
    public void getMethod(){
        System.out.println("b");
    }
}
