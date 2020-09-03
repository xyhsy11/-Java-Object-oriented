package com.siyu.demo10;

import java.util.Date;
import java.text.SimpleDateFormat;

public class NowString {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy");//设置日期格式
        System.out.println(new Date());
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        int a = 1;
        int b = 0;
        try {
            int c = a / b;

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }

        /* System.out.println(c);*/
    }
}