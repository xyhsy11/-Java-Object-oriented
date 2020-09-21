package com.siyu.demo14;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/19 10:10
 */
public class Demo03 implements Comparator{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(155);
        treeSet.add(75);
        treeSet.add(49);
        treeSet.add(155);
        treeSet.add(75);
        treeSet.add(49);
        treeSet.add(100);
        treeSet.add(100);
        for (Integer i: treeSet) {
            System.out.println(i);
        }

    }


    @Override
    public int compare(Object o1, Object o2) {

        return 0;
    }

    @Override
    public Comparator reversed() {
        return null;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return null;
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return null;
    }
}
