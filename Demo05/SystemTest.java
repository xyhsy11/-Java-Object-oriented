package com.siyu.Demo05;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/27 23:14
 */
public class SystemTest {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
