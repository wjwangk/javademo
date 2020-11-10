package com.xiaowenzi.demo.controller;


import ch.qos.logback.core.joran.conditional.ElseAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;     //下面对应的代码已被注释
import java.util.Date;    //下面对应的代码已被注释
import java.util.Scanner;

public class Test11 {


    // 日期和 a++ 以及 ++a
    /*
    public static void main(String[] args) {

        int a = 2;
        int b;
        int c;
       b = a++;

        System.out.println("a++: " + b);
        System.out.println("++a " + a);
      //  c = ++a;
      //  System.out.println("c =" + c);
     //   System.out.println("a =" + a);
        Date date = new Date();
        System.out.println(date.toString());
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));

    }
    */

/*
// IO流
public static void main(String args[]) throws IOException {
    char c;
    // 使用 System.in 创建 BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("输入字符, 按下 'q' 键退出。");
    // 读取字符
    do {
        c = (char) br.read();
        System.out.println(c);
    } while (c != 'q');
}
*/


// 使用 scanner 获取键盘输入，并输出
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);     //从键盘接受数据
    int i = 0;
    float j = 0.0f;
    int sum = 0;
    // 整数i的输入值
    System.out.println("请输入整数：");
    //判断输入的是否为整数
    while (scan.hasNextInt()){

        i = scan.nextInt();   //如果是整数，把输入值赋给i
        System.out.println("您输入的整数是："+i);
        sum = sum + i;

    }
    System.out.println("您输入的整数值的和是："+sum);
    /*
  //整数i的输入值
    //整数j的输入值
    System.out.println("请输入小数：");
    //判断输入值是否为小数
    if(scan.hasNextFloat()){
        j = scan.nextFloat();   //输入值是小数，就赋值给j
        System.out.println("您输入的小数是："+j);      //输出输入的小数
    }
    else{
        System.out.println("您输入的不是小数");
    }
*/

}

}



