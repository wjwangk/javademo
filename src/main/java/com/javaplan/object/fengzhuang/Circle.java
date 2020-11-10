package com.javaplan.object.fengzhuang;

import static java.lang.Math.PI;

/**
 * https://blog.csdn.net/lovejojo222/article/details/103610926
 * 题目要求：
 * （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 * public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值
 */

public class Circle {

    private double radius;    //代表半径

//    public Circle(){
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){

        double area = PI*radius*radius;
        return area;

     }


}
