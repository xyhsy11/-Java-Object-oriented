package com.siyu.demo4;

import java.util.ArrayList;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/19 11:26
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager" ,100);
        Member one = new Member("one", 0);
        Member two = new Member("two", 0);
        Member three = new Member("three", 0);



        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("--------------");

        ArrayList<Integer> redlist = manager.send(80,3);

        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);


        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
