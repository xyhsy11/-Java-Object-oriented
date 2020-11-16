package com.siyu.demo18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/24 9:57
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());



        executorService.shutdown();



    }

}
