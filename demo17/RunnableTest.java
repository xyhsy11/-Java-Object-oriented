package com.siyu.demo17;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/11 10:51
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}
