package com.xiaowenzi.demo.Abstractt.abstract2;



// 非抽象子类继承抽象父类
public class Salary extends Employee {


    // 必须实现抽象父类的抽象方法的方法体
    public void  test(){

        System.out.println("非抽象子类实现抽象父类的抽象方法");
    }
}
