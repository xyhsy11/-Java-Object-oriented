package com.siyu.demo17;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/11 10:51
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
    }
}
