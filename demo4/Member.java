package com.siyu.demo4;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/8/19 10:58
 */
public class Member extends User {


    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());

        int delta = list.remove(index);

        int money = super.getMoney();

        super.setMoney(money + delta);
    }
}
