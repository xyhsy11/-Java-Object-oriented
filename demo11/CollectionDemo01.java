package com.siyu.demo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/30 9:40
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
      Collection<Student> collection  = new ArrayList<>();
      collection.add(new Student("张三",2));
      collection.add(new Student("李四",2));
      collection.add(new Student("张三",2));

        Iterator<Student> i =  collection.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }



    }
}
