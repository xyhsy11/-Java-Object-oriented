package com.siyu.demo10;

import java.util.Arrays;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/27 21:43
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("Tom", 10);
        Person p1 = new Person("Tom", 10);
        System.out.println(p.toString());
        int[] arr = {1, 23, 4, 5};

        System.out.println(Arrays.toString(arr));

        System.out.println(p.hashCode());

        System.out.println(p1.equals(p));

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if (s1 == s3) {
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 != s3");
        }
        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (s1.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int number = 100;
        String s4 =  String.valueOf(number);


        Integer i = Integer.valueOf(s4);
        int i1 = i.intValue();


    }
}
