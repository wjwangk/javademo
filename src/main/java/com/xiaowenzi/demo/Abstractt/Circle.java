package com.xiaowenzi.demo.Abstractt;

public class Circle extends Shape {

    double r;

    public void length() {
        System.out.println("圆形的周长为：" + "2*3.14*r");
    }

    public void are() {
        System.out.println("圆形的面积为：" + "3.14*(r*r)");
    }
}
