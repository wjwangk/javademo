package com.xiaowenzi.demo.cardgame;

import javax.smartcardio.Card;
import java.util.*;

public class TheGamer {
    int id;                     //玩家id
    String name;               //玩家姓名
    //  String handCard;      //手牌属性
    List<TheCard> cardList;
    List<TheGamer> playerList;

    public TheGamer() {
        this.id = id;
        this.name = name;
        this.cardList = new ArrayList<TheCard>();
    }

    String[] playerName = new String[2];
    int i = 0;

    public void getGamer() {
        Scanner input = new Scanner(System.in);

        for (int k = 1; k < 3; k++) {
            System.out.println("请输入第" + k + "位玩家的ID和姓名");
            System.out.println("输入ID:");
            id = input.nextInt();
            System.out.println("输入姓名:");
            name = input.next();
            playerName[i] = name;

            i++;
        }
    }

    public void createPlayers() {

        for (int i = 0; i < playerName.length; i++) {
            System.out.println("----欢迎玩家 :" + playerName[i]);
        }

    }

    public static void main(String[] args) {
        //发牌
        List<Player> player = new ArrayList<>();
        Player p1 = new Player();
        p1.setName("张三");
  //      p1.setNum(2);
        player.add(p1);

        Player p2 = new Player();
        p2.setName("李四");
    //    p2.setNum(2);
        player.add(p2);
//        for(Player p:player){
//            System.out.println(p.getName());
//        }

        TheCard card = new TheCard();
        List<String> cardList = card.xiCard();

        int n = 0;
        for (int i=0;i<4;i++){
            if (n+1 > player.size()){
                n = 0;
            }
            String str = cardList.get(i);
            List<String> var = player.get(n).getList();
            if (var == null){
                var = new ArrayList<>();
            }
            var.add(str);
            player.get(n).setList(var);
            n++;
        }

        for (Player p : player){
            System.out.println(p.getName()+"的牌為："+p.getList());
        }


     //   Collections.sort(p);
//        List<String> l1= p1.getList();
//        Collections.sort(l1);
//        for(String st1:l1){
//            System.out.println(st1);
//        }
//        List<String> l2= p2.getList();
//        Collections.sort(l2);
//        for(String st2:l2){
//            System.out.println(st2);
//        }

    }






}



