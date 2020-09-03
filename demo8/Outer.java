package com.siyu.demo8;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/23 21:47
 */
public class Outer {

    public void methodOuter(){
         class Inner{

             int num = 10;

             public void methodInner(){
                 System.out.println(this.num);

             }
        }

        Inner inner = new Inner();


    /*
        return inner;
*/

    }
}
