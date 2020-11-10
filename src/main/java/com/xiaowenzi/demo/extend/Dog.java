package com.xiaowenzi.demo.extend;

public class Dog extends Animal {

   public   Dog(){
       System.out.println("这是Dog的构造方法");}
       //这里会隐式调用父类的构造器，但是父类构造器没有，为啥不报错？？
    /*
    *  答：是不是因为当父类没有构造方法时，会默认自动创建一个无参构造器，无返回结果，是这样吗？
    * */
    public void move(){
        System.out.println("狗可以跑和走");

    }

    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
