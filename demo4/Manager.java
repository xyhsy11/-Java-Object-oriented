package com.siyu.demo4;

import java.util.ArrayList;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/17 10:04
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("You do not have enough money");
            return redlist;
        }
        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        redlist.add(avg + mod);
        return redlist;
    }



}
