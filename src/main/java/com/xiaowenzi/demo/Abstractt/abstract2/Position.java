package com.xiaowenzi.demo.Abstractt.abstract2;


// 抽象子类继承抽象父类
public abstract class Position extends Employee{


    // 抽象子类中的普通方法
    public String  test11(){

        System.out.println("这是一个抽象子类中的普通方法");
        return  "test11";
    }

    // 抽象子类的抽象方法可以和父类的抽象方法相同
    public abstract void test();


    //抽象子类中可以有static 方法，但是不能被abstract 修饰，否则报错
    public static void test22(){
        System.out.println("这是抽象子类中的静态方法");
    }


    //抽象子类中的抽象方法
    public abstract  void test33();


}
