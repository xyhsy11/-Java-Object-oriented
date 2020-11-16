package com.siyu.demo15;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/1 9:47
 */
public class GenericClass<E> {
    private E name;


    public GenericClass(E name) {
        this.name = name;
    }

    public E getName() {

        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    public <E> void method(E e){
        System.out.println(e);
    }
    public static <Ss> void method2(Ss s){
        System.out.println(s);
    }
}
