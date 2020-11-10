package com.xiaowenzi.demo.Interfaces;


/*
接口的应用
 */
public class Run {
    public static void main(String args[]){
    Telephone tp1 = new Phone();       //用父类的引用指向子类的对象
         tp1.call();        //调用子类重写父类的方法
         ((Phone) tp1).call1();
          //   tp1.paly();          不可以这么操作，因为 paly 是接口的方法，而不是父类的方法
    IPlayGame ip = new Phone();     //用接口的引用指向子类的对象
         ip.paly();         //调用接口的方法
    System.out.println(ip.name);       //输出接口的常量

    ISport is = new Phone();
    is.setHomeTeam("姚明");
    is.setSportNum();
    is.paly();
  }
}