package com.siyu.demo17;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/10/17 7:55
 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;
    Integer a = 1;
    String s = "123";


    public void test(){
        String.valueOf(a);
        s = null;
    }
    @Override
    public  void run() {
        while(true){
           /* synchronized (a){*/
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"票");
                    ticket --;

                }else{
                    break;
                }
            //}


        }
    }
}
