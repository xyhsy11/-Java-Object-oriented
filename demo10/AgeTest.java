package com.siyu.demo10;

import java.util.Scanner;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/30 9:05
 */
public class AgeTest {
    public static void main(String[] args) {


        System.out.println("please enter your age");
        try{
            new Age().age(new Scanner(System.in).nextInt());
        }catch(OutOfBoundException e){
           /* System.out.println(e.getMessage());*/
            e.printStackTrace();
           /* System.out.println(e.toString());*/
        }
    }
}
