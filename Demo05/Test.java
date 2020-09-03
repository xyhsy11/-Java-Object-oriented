package com.siyu.Demo05;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/18 21:43
 */
public class Test {
    public static void main(String[] args) {
/*        PersonImpl person = new PersonImpl();
        person.getAge();
        person.getName();*/
        Person person = new PersonImpl();
        person.getAge();
        person.getName();
        final int a = 10;
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.getA1();

    }
}
