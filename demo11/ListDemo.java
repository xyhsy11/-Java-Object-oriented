package com.siyu.demo11;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/30 10:34
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("vdsdwd");

        int[] arr  = {1,2,3};
        System.out.println(arr[1]);

        list.iterator();

        System.out.println(list.toArray()[1]);
    }
}
