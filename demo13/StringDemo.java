package com.siyu.demo13;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/5 15:22
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        System.out.println(change(s1, s2));


        System.out.println(s1);
        System.out.println(s2);

    }

    public static String change(String s1, String s2) {

        s1 = s2;

        return s1;
    }


}
