package com.xiaowenzi.demo.Interfaces;

/*
1.继承父类，并实现接口的写法：
[修饰符] class 类名 extends 父类名  implements 接口1，接口2...
注意：如果要继承父类，继承父类必须在实现接口之前,即extends关键字必须在implements关键字前

2.直接实现接口
... implements 接口名[,其他接口名1，其他接口名2...]
注意：
1.类使用implements关键字实现接口。在类声明中，Implements关键字放在class声明后面。
2.类实现接口时，必须实现所有接口中的所有方法
3.类实现有继承关系的子接口时，必须实现子接口对应的父接口的所有方法
 */
public class Phone extends Telephone implements  ISport , IPlayGame{

    String name;

    public  void call(){
        System.out.println("我重写了抽象类中的call方法");
    }
    public void call1(){System.out.println("我是子类中的普通方法call1");}

    /**
     * 1.当类实现接口的方法时，必须实现接口的所有方法。（若有接口继承关系，必须实现子接口和父接口中的所有方法）
     *   否则，类必须声明为抽象的类
     * 2.类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型
     */

    @Override
    public void paly(){
        System.out.println("我实现了IPlayGame接口的方法play");
    }

    public int team(){
        System.out.println("我实现了IPlayGame接口的方法team");
        return 1;}

    public void setHomeTeam(String names){

        System.out.println("我重写了ISport接口的方法setHomeTeam");
        }

     public int setSportNum(){
         System.out.println("我重写了ISport接口的方法setSportNum");
         return 2;
     };


}
