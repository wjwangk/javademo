package com.xiaowenzi.demo.looptest;

import java.util.Scanner;
/*

 */

public class TotalPrice {

    public double getBill(Goods goods[]) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入商品编号：" );
        int id = input.nextInt();
        System.out.print("请输入购买数量：" );
        int num = input.nextInt();

        for (int i = 0; i <= goods.length; i++) {
            if (id == (i + 1)) {
                sum = goods[i].getPrice() * num;
                System.out.println("商品" + goods[i].getName() + "  单价(￥)" + goods[i].getPrice() + "  购买数量为：" + num + "  合计：" + sum + "人民币");

            }
        }
        return sum;
    }

}
