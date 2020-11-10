package com.xiaowenzi.demo.Abstractt;


/*
多态中的抽象类
 */
public class Initail {
    public static void main(String[] args) {
    //    Shape shape = new Shape();     //抽象类不能直接创建，所以这样写编译器会报错
        Shape rectangle = new Rectangle();
        rectangle.length();
        rectangle.are();
        rectangle.test();
        Shape circle = new Circle();     //定义抽象类中的子类对象
        circle.length();
        circle.are();
        circle.test();         //抽象类中的普通方法也只能通过子类对象来定义和引用
        // 8. 抽象父类中的普通方法可以通过非抽象子类实例化后直接调用，如下TestDome 类中的 e.getName（）方法

    }
}
