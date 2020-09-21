package com.siyu.demo15;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/20 11:11
 */
public class TypeTest{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("dasd");
        arrayList.add("drq");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }
    }
}
