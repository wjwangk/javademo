package com.xiaowenzi.demo.Interfaces;

/*
定义接口：在JAVA编程语言中是一个抽象类型，是抽象方法的集合，接口通常以interface来声明。
格式如下：
[修饰符] [abstract] interface 接口名 [extends父接口1,2....]（多继承）{
0…n常量 (public static final)
0…n 抽象方法(public abstract)
}

1、其中[]里表示可选项，可写可不写
2、接口中的属性都是常量，即使定义时不添加public static final 修饰符，系统也会自动加上
3.接口中的方法都是抽象方法，即使定义时不添加public abstract修饰符，系统也会自动加上。
4.通常我们在命名一个接口时，经常以I开头，用来区分普通的类。如：IPlayGame
 */
public interface IPlayGame {
    public void paly();    //接口中的方法没有方法体，abstract 关键字可以省略，系统会自动加上
    int team();            //接口中的方法没有方法体，可以直接省略 public abstract 关键字，系统会自动加上

    /*
    1.static final关键字可以省略，系统会自动加上
    2.定义接口的成员变量时只能是 public static final类型，且必须有初值，
      所以实现类中不能重新定义，也不能改变其值
     */
    public static final String name="游戏名字";//必须给出初值
    int id = 1;        //接口中的变量，被隐式的指定为 public static final ，即为常量，所以必须要赋初值
}
