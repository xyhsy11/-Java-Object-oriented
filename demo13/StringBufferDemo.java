package com.siyu.demo13;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/5 13:49
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        String str = "Hello";
        String str1 = new String("Hello");


        System.out.println(sb.equals(str));
        System.out.println(str == str1);

        System.out.println(sb.hashCode());
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        Dog dog = new Dog("3");
        if(dog instanceof Animal){}

        Dog[] dogs = {(Dog)new Animal(),new Dog("2")};

     /*   sb.append("Hello");
        sb.append("world");
        sb.append("java");


        sb.replace(5,10,"123");
        sb.reverse();
        sb.substring(5);
        System.out.println(sb);*/
      /*  System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBufferDemo demo = new StringBufferDemo();
        StringBufferDemo demo1 = demo.getThis();

        System.out.println("demo:" + demo);
        System.out.println("demo1" + demo1);
        demo.getAge();

        sb.insert(4,"world");

        System.out.println(sb);*/
    }

    public StringBufferDemo getThis() {


        return this;
    }

    public String getAge() {
        return "Hello";
    }
}
