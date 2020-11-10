package com.xiaowenzi.demo.duotai;

public class Intital {
    public static void main(String[] args) {
        TranSport air = new AirPlane();
        TranSport bus1 = new Bus1();
        TranSport ship = new Ship();   //多态要用到继承的父类TranSport作为类名//
        air.sport();
        bus1.sport();
        ship.sport();

    }
}
