package com.xiaowenzi.demo.carrent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setId(1);
        car1.setName("奥迪A4");
        car1.setRent(500);
        car1.setPeopleCapacity(4);
        car1.setGoodsCapacity(0);
        car1.setType(1);
        Car car2 = new Car();
        car2.setId(2);
        car2.setName("马自达6");
        car2.setRent(400);
        car2.setPeopleCapacity(4);
        car2.setGoodsCapacity(0);
        car2.setType(1);
        Car car3 = new Car();
        car3.setId(3);
        car3.setName("皮卡雪6");
        car3.setRent(450);
        car3.setPeopleCapacity(4);
        car3.setGoodsCapacity(2);
        car3.setType(3);
        Car car4 = new Car();
        car4.setId(4);
        car4.setName("金龙");
        car4.setRent(800);
        car4.setPeopleCapacity(20);
        car4.setGoodsCapacity(0);
        car4.setType(1);
        Car car5 = new Car();
        car5.setId(5);
        car5.setName("松花江");
        car5.setRent(500);
        car5.setPeopleCapacity(0);
        car5.setGoodsCapacity(4);
        car5.setType(2);
        Car car6 = new Car();
        car6.setId(6);
        car6.setName("依维柯");
        car6.setRent(1000);
        car6.setPeopleCapacity(0);
        car6.setGoodsCapacity(20);
        car6.setType(2);


        Car[] cars = {car1, car2, car3, car4, car5, car6};

        System.out.println("欢迎使用达达租车系统");
        System.out.print("您是否要租车：1是 0否");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (1 == n) {
            System.out.println("请输入租车数量：");
            int num = input.nextInt();       //输入租车数量num
            int[] indexs = new int[num];
            for (int i = 0; i < num; i++) {
                System.out.println("请输入第" + (i + 1) + "辆租车序号：");
                indexs[i] = input.nextInt();
            }

            System.out.println("请输入租车天数：");
            int day = input.nextInt();


            System.out.println("您的账单：");
            People people = new People();
            people.getBill(indexs, cars, day);

        }
    }

}
