package com.siyu.demo10;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/29 10:40
 */
public class ExceptionTest {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        /*try {
            method();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException1");
        }*/
   /*     method();*/


    }

    public static void method() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[4]);
    }
}
