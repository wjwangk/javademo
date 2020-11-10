package com.xiaowenzi.demo.domain;

public class Initail {
    public static void main(String[] args) {
        Bus bus = new Bus();      //继承用的是子类Bus作为类名//
        bus.wheel = 8;
        bus.doors = 2;
        bus.transport();
    }
}
