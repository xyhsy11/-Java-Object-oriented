package com.siyu.demo07;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/20 21:46
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat("fish");
        animal.sleep();
        animal.catchMouse();

        if (animal instanceof Cat) {

        } else if (1 > 2) {
            
        }

    }
}
