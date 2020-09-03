package com.siyu.demo10;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/30 9:01
 */
public class Age {
    public void age(int age) throws OutOfBoundException {
        if (age < 0 || age > 100) {
            throw new OutOfBoundException("You have entered the wrong data");

        } else {
            System.out.println("correct age");
        }
    }
}
