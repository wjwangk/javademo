package com.xiaowenzi.demo.duotai.duotai1;

/**
 * 多态：
 * 1. 多态存在的3个必要条件：继承，重写，父类引用指向子类对象（Parent p = new Child();）
 * 2. 如果子类中重写了父类中的一个方法，那么在调用这个方法的时候，将会调用子类中的这个方法；
 *   （动态连接、动态调用）
 *3. 多态的实现方法：方式一：重写   方式二：接口  方式三：抽象类和抽象方法
 */

public class TestDome {

    public static void main(String [] args) {
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
    }
}
