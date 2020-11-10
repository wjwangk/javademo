package com.xiaowenzi.demo.looptest;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;
/*
实现功能：输入商品编号和购买数量，计算金额并结账
**************************
编号  名称  单价
1      T恤   245.0
2     网球鞋 570.0
3     网球拍 150.0
**************************
请输入商品编号：
请输入购买数量：
是否继续（Y/N）:

结算：应付金额：
 */

public class Main {
    public static void main(String arg[]){

    Goods goods1 = new Goods();
    goods1.setId(1);
    goods1.setName("T恤");
    goods1.setPrice(245.0);
    Goods goods2 = new Goods();
    goods2.setId(2);
    goods2.setName("网球鞋");
    goods2.setPrice(570.0);
    Goods goods3 = new Goods();
    goods3.setId(3);
    goods3.setName("网球拍");
    goods3.setPrice(150.0);

    Goods goods[] = {goods1,goods2,goods3};

    Scanner input = new Scanner(System.in);
  //  for(int i=0;i<=goods.length;i++) {
        TotalPrice tp = new TotalPrice();
       double total= tp.getBill(goods);
        for(int i=0;i<goods.length-1;i++) {
            System.out.println("是否继续（Y/N）");
            char in = input.next().charAt(0);
            if (in == 'Y') {
                double total1 = tp.getBill(goods);
                total = total + total1;
            }
            else
            {
                break;
            }


        }
        System.out.println("您总共应付金额为：" + total);

    }
}
