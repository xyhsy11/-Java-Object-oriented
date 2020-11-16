package com.siyu.demo18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/24 9:52
 */
public class MyRunnable implements Runnable {



    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName());




    }
}