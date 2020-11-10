package com.faceobject.demo.constructionmethod.test3;

import java.lang.annotation.Retention;
/*
编写程序，添加一个Add类——方法的重载练习
1)  添加一个方法sum()，返回类型为int，有两个int类型参数，该方法计算两个参数的和
2)  添加方法sum()的重载方法，返回类型为double，有三个参数double类型，该方法计算三个参数的和。
 */

public class Add {

    public int sum(int a,int b){
      int   sum = a+b;
        System.out.println(sum);
        return sum;

    }

    public double sum(double a,double b,double c){
     double   sum = a + b + c;
        System.out.println(sum);
     return  sum;

    }

    public static void main(String args[]){
        Add add = new Add();
        add.sum(10,11);
        add.sum(10,11,12);
    }
}
