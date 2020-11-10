package com.xiaowenzi.demo.Abstractt;

public class Rectangle extends Shape {
    double a;
    double b;

    public void length() {
        System.out.println("矩形的周长为：" + "2*（a+b）");
    }

    public void are() {
        System.out.println("矩形的面积为：" + "a*b");
    }
}
