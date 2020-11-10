package com.xiaowenzi.demo.Abstractt.abstract2;

public class TestDome {

    public static void main(String[] args) {

        // 非抽象子类实例化抽象父类
        Employee e = new Salary();
        e.test();         //实现非抽象子类方法
        e.getName("王红");  // 父类中的普通方法可以通过子类实例化后调用

    }
}
