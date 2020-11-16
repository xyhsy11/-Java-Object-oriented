package com.siyu.demo15;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/1 10:13
 */
public class GenericInterfaceImpl<E> implements GenericInterface<E> {

    @Override
    public E getSum(E a, E b) {

        return (E) (a.toString()+b);
    }
}
