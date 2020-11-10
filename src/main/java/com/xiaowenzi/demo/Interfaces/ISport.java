package com.xiaowenzi.demo.Interfaces;

/*
接口的继承
1.一个接口能继承另一个接口，和类之间的继承方式比较相似。接口的继承使用extends关键字，子接口继承父接口的方法
2.一个接口可以继承多个接口，方法如下：  PS:这个和类的继承是有区别的，一个类只能继承一个父类，但是可以实现多个接口
public interface 子接口名称  extends 接口名称1，接口名称2，接口名称3 ...
3.子接口继承父接口后，可以重写父接口的方法，也可以不重写
4.子接口继承父接口后，可以有自己的方法
 */

public interface ISport  extends IPlayGame{

    public void setHomeTeam(String name);        //子接口的方法

    public int setSportNum();                    //子接口的方法


}
