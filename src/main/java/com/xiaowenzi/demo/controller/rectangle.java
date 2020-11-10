package com.xiaowenzi.demo.controller;

import com.sun.deploy.security.WinDeployNTLMAuthCallback;

/**
 * 写一个矩形类，用构造方法中初始化长和宽，在成员方法中求面积
 */
public class rectangle {
    double length;
    double wide;

    /**
     * 构造方法：1.没有返回值，但不需要void修饰 2.方法名和类名相同
     */
    public rectangle() {
        length = 10.0;
        wide = 12.0;
    }

    /**
     * 下面的getArea方法只，可以不传参数，这样就可以用构造方法中已经初始化的参数
     * 也可以传形参，传形参后，使用时，必须要传入实参double  mm=s1.getArea(20,3);，否则报错，
     * 另外若传了形参，实参执行时，会覆盖掉初始化的值
     *
     * @param length
     * @param wide
     * @return
     */
    public double getArea(double length, double wide) {
        double areas = length * wide;
        return areas;
    }

    public static void main(String[] agrs) {
        rectangle s1 = new rectangle();

        double mm = s1.getArea(20, 3);
        System.out.println("矩形的面积为：" + mm);
    }
}
