package com.xiaowenzi.demo.DadaRental;

import java.util.Scanner;

public class Intial {
    public static void main(String[] args) {
        System.out.println("欢迎使用达达租车系统");
        Scanner input = new Scanner(System.in);
        System.out.print("您是否要租车：1是 0否");
        int n = input.nextInt();
        System.out.println(n);
        if (n != 1) {
            return;
        }
        System.out.println("您可租车的类型及其价目表：");
       /* if(n==1){
            PassengerCar car=new Car();
            car.BigCar();
            car.SmallCar();
            CarryFreight truck=new Truck();
             truck.SmallTruck();
             truck.BigTruck(); */
        {
            int id;     //车辆序号
            String name;    //车辆名字
            double rent;    //租金
            String capacity;    //载重
            for (id = 1; id <= 6; id++) {
                if (id == 1) {
                    name = "奥迪A4";
                    rent = 500;
                    capacity = "载人：4人";
                    System.out.println("车辆序号:" + id + "车辆名称：" + name + "租金：" + rent + "容量：" + capacity);
                } else if (id == 2) {
                    name = "马自达6";
                    rent = 400;
                    capacity = "载人：4人";
                    System.out.println("车辆序号:" + id + "车辆名称：" + name + "租金：" + rent + "容量：" + capacity);
                } else if (id == 3) {
                    name = "皮卡雪6";
                    rent = 450;
                    capacity = "载人：4人 载货：2吨";
                    System.out.println("车辆序号:" + id + "车辆名称：" + name + "租金：" + rent + "容量：" + capacity);
                } else if (id == 4) {
                    name = "金龙";
                    rent = 800;
                    capacity = "载人：20人";
                    System.out.println("车辆序号:" + id + "车辆名称：" + name + "租金：" + rent + "容量：" + capacity);
                } else if (id == 5) {
                    name = "松花江";
                    rent = 400;
                    capacity = "载货：4吨";
                    System.out.println("车辆序号:" + id + "车辆名称：" + name + "租金：" + rent + "容量：" + capacity);
                } else if (id == 6) {
                    name = "依维柯";
                    rent = 1000;
                    capacity = "载货：20吨";
                    System.out.println("车辆序号:" + id + "车辆名称：" + name + "租金：" + rent + "容量：" + capacity);
                }
            }
        }
        System.out.print("请输入您要租汽车的数量：\n");
        int num = input.nextInt();
        System.out.println(num);
        for (int i = 1; i <= num; i++) {

            System.out.println("请输入第" + i + "辆车的序号：");
            i = input.nextInt();
            System.out.println(i);
        }
        System.out.print("请输入租车天数：\n");
        int datas = input.nextInt();
        System.out.println(datas);

    }


}

