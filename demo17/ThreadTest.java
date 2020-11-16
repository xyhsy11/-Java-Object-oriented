package com.siyu.demo17;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/11 10:16
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        /*  mt.start();*/

        mt.setPriority(Thread.MAX_PRIORITY);
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
