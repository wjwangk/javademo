package com.xiaowenzi.demo.Test;

public class Animal {

    String name;         //定义了一个成员变量

    /**
     * 构造方法：方法名和类名相同，没有返回值void
     * 类中必定有默认的构造方法，如果没有，系统会默认生成一个不可见的无参的构造方法。
     * 也可以直接定义出来
     */

    public Animal() {
        System.out.println("这是一个无参的父类构造函数");
    }

    /**
     * 方法的重载，再次定义一个和类名相同的方法，跟构造方法的区别是传入的参数个数和类型不同。注意无返回值
     *
     * @param
     */
    public Animal(String name) {
        this.name = name;
        System.out.println(name+"说：这是一个有参的父类构造函数");

    }

    // 下面这三个eat（）方法是方法的重载，即方法名相同，参数类型不同，返回类型也可不同
    public String eat(String food) {
        System.out.println(name + "吃:" + food);
        return "";
    }

    public String eat(int food) {
        System.out.println(name + "吃:" + food);
        return "啦啦";
    }

    public void eat() {
        System.out.println("这是一个无参无返回的普通父类方法");
    }
}