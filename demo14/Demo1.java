package com.siyu.demo14;

import java.util.Arrays;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/11 17:30
 */
public class Demo1 {
    public static void main(String[] args) {
        char a = 'a';
        char A = Character.toUpperCase(a);
        System.out.println(A);
        String qq = "032123";
        System.out.println(check2(qq));
        System.out.println("\\");

        String age = "18-24";
        String[] srr =age.split("-");

        String str = "78 98 12 34";
        System.out.println(Arrays.toString(sort(str)));

        str.replaceAll("\\d+",null);
    }

    public static boolean checkQQ(String qq) {

        if (qq.length() >= 5 && qq.length() <= 15) {
            if (qq.startsWith("0")) {
                return false;
            } else {
                char[] a = qq.toCharArray();
                for (int i = 0; i < a.length; i++) {
                    if (!Character.isDigit(a[i])) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
    public static boolean check2(String qq){
        String regex = "[1-9][0-9]{4,14}";
        boolean flag = qq.matches(regex);
        return flag;
    }
    public static int[] sort (String str){
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length ; i++) {
            arr[i] = Integer.parseInt(strArr[i]);

        }
        Arrays.sort(arr);

        return arr;
    }
}
