package com.xiaowenzi.demo.domain;

public class Bus extends Vehicle {
    int doors = 1;
    int wheel = 3;

    public void transport() {

        System.out.println("公共汽车有：" + doors + "个门," + wheel + "个轮子" + "\n公共汽车可以载人");
    }
}
