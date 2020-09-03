package com.siyu.demo1;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/13 22:21
 */
public class DemoObject02 {
    public static void main(String[] args) {
        Phone phone = new Phone();

        NewPhone newPhone = new NewPhone(1);
        newPhone.play();
        newPhone.send();
    }
}
