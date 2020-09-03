package com.siyu.demo10;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/30 8:58
 */
public class OutOfBoundException extends RuntimeException{

    public OutOfBoundException() {
    }

    public OutOfBoundException(String message) {
        super(message);
    }
}
