package com.siyu.demo17;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/11 10:16
 */
public class MyThread extends Thread{
    @Override
    public void run() {

        Thread t = Thread.currentThread();
        System.out.println(t);
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }
}
