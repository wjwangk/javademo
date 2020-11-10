package com.xiaowenzi.demo.cardgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheTest {

    static List<TheGamer> playerList;

    public TheTest() {
//        this.cardStartList= new ArrayList<Card>();
//        this.cardEndList = new  ArrayList<Card>();
        this.playerList = new ArrayList<TheGamer>();
    }


    public static void main(String[] args) {
        TheCard tc = new TheCard();
        TheGamer tg = new TheGamer();
        tc.creatCard();

        tg.getGamer();
        tg.createPlayers();
        // 发牌
        int n = 0;
        String[] Player = new String[2];
        for (int i = 0; i < 4; i++) {
            if (n >= 2) {
                n = 0;
            }
            {
                Player[n] = tc.xiCard().get(i);
                List<String> list = new ArrayList();
                list.add(Player[n]);
                n++;
            }
            for (String list : Player) {
                System.out.println("玩家：" + list);
            }

        }


    }
}
