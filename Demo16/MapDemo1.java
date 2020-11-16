package com.siyu.Demo16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/11 8:48
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<Character,Integer> map= new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(chars[i])){
                Integer value = map.get(chars[i]);
                value++;
                map.put(chars[i],value);
            }else{
                map.put(chars[i],1);
            }
        }
        System.out.println("请输入要查的字符" );

        Integer integer = map.get(sc.next().toCharArray()[0]);
        if (integer == null){
            System.out.println("不存在");
        }else{
            System.out.println("次数为" + integer);
        }

    }
}
