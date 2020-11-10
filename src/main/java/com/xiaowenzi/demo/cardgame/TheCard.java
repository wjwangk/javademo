package com.xiaowenzi.demo.cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 一、创建一副扑克牌
 * 包括四种花色：黑桃、红桃、梅花、方片
 * 十三种点数：2-10，J、Q、K、A，先不考虑大小王
 * 二、创建两名玩家：
 * 玩家至少有：ID，姓名和手牌属性，手牌为扑克牌的集合
 * 三、洗牌
 * 将之前创建的“一副扑克牌”的“顺序”打乱
 * 四、发牌
 * 将洗牌之后的扑克牌集合，从第一张开始，发给两名玩家，按照一人一张的方式，每人发两张
 * 五、游戏：
 * 比较两名玩家手中的扑克牌，规则为：取两人各自手中点数最大的牌进行比较，点数大的赢；若两人各自的点数
 * 最大的牌相等，则再按花色比较（黑>红>梅>方）
 *
 * * */
public class TheCard {
    String[] cards = new String[52];
 static String[] huaSe = new String[]{"黑桃","红桃","方片","梅花"};
 static String[] daXiao = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

 public TheCard(){}
    public TheCard(String huaSe,String num){

    }

 public void copareCard(){

 }




 //
 public void creatCard(){
     System.out.println("-----------创建扑克牌---------------");
      int n =0;

      for(int i=0;i<huaSe.length;i++){
          for(int j=0;j<daXiao.length;j++){
          cards[n] =huaSe[i]+daXiao[j];
          n++;
          }
      }
      System.out.println("创建的扑克牌为："+Arrays.toString(cards));
     System.out.println("---------扑克牌创建成功--------------");
 }



 public List<String> xiCard(){
     System.out.println("--------开始洗牌-------------");
    List<String> list = new ArrayList<>();
    creatCard();
  //  list.add(Arrays.toString(cards));
     list=Arrays.asList(cards);
  //   System.out.println("--------排序前-------------");
 //    for(String str:list){
 //        System.out.println("洗牌前的结果为："+str);
 //    }
     Collections.shuffle(list);
     System.out.println("--------排序后-------------");
     for(String str:list){
         System.out.println("洗牌后的结果为："+str);
    }
     System.out.println("-----------洗牌结束---------------");
   //  return list.toString();
     return list;
 }

    public void faCard(){
    }


//  public static void main(String[] args){
//    TheCard tc = new TheCard();
   // tc.creatCard();
 //   String mm =tc.xiCard();
  //  System.out.println(mm);



}
