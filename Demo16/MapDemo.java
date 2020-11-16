package com.siyu.Demo16;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/2 10:03
 */
public class MapDemo {
    public static void main(String[] args) {
        //show1();
        //show2();
        //show3();
        //show4();
        show5();
    }

    private static void show5() {
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put(null, null);
        System.out.println(hashtable);
    }

    private static void show4() {
        HashMap<String, Object> map = new HashMap<>();
        map.put(null, null);
        System.out.println(map);
        map.put("null", null);
        System.out.println(map);
    }

    private static void show3() {

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + value);

        }


    }


    private static void show2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        boolean flag = map.containsKey("c");
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


    private static void show1() {
        Map<String, String> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();
        String v1 = map.put("key", "value");
        String v2 = map.put("key", "value");
        System.out.println(v2);

    }
}

