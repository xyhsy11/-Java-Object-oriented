package com.siyu.demo15;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/1 9:48
 */
public class Test {
    public static void main(String[] args) {
        args = new String[3];
        args[0] = "1";
        args[1] = "2";
        args[2] = "3";
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
   /*     GenericClass<String> genericClass = new GenericClass<>("12");
        String name = genericClass.getName();
       *//* GenericClass<Integer> genericClass1 = new GenericClass<>(1);
        int a = genericClass1.getName();
        System.out.println(name + a);*//*
        genericClass.method(10);
        GenericClass.method2("q");
        GenericInterfaceImpl<String> genericInterface = new GenericInterfaceImpl<>();
        String sum = genericInterface.getSum("a", "b");
        System.out.println(sum);*/


    }
    public static void main(String[] args,int a){
        System.out.println();

    }
}
