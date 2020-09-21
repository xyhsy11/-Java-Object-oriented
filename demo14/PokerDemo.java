package com.siyu.demo14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2020 2020/9/18 21:08
 */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //♦
        //♣
        //♥
        //♠
        //小王，大王
        String[] colours = new String[]{"♦","♣","♠","♥"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String colour: colours){
            for(String number: numbers){
                array.add(colour + number);
            }
        }

        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
        System.out.println("牌库");
        System.out.println(array);
        ArrayList<String> playerA = new ArrayList<>();
        ArrayList<String> playerB = new ArrayList<>();
        ArrayList<String> playerC = new ArrayList<>();
        ArrayList<String> handCard = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3 ){
                handCard.add(poker);
            }else if(i % 3 == 0){
                playerA.add(poker);
            }else if(i % 3 == 1){
                playerB.add(poker);
            }else if(i % 3 == 2){
                playerC.add(poker);
            }

        }

        lookCard("A",playerA);
        lookCard("B",playerB);
        lookCard("C",playerC);
        lookCard("底牌",handCard);
    }
    public static void lookCard(String name, ArrayList<String> card){
        System.out.print("name:" + name + "牌是: ");
        for (String poker: card) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
