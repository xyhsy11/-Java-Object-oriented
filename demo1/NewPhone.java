package com.siyu.demo1;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/13 22:19
 */
public class NewPhone extends Phone {
    public NewPhone(int a) {
        /*super(1);*/
        super.call();
        super.send();
    }

    public void play() {

        System.out.println("play");
    }

    @Override
    public void send() {
        super.send();
    }
}
