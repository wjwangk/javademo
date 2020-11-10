package com.faceobject.demo.constructionmethod.test2;
/*
构造方法和方法的重载练习：
给SE类添加属性：基本工资、考核工资
给PM类添加属性：基本工资、项目奖金、分红
添加构造方法分别对SE与PM中属性进行赋值
编写薪水计算类salary，实现重载pay()方法
 */
public class Salary {
    double sum;
    public void getpay(SE basepay1,SE checkpay1){
        sum = basepay1.basepay + checkpay1.checkpay;         //这里为什么是这样显示的
        System.out.println("员工的总工资为："+sum);

    }

    public void getpay(PM basepay,PM projectpay,PM sharepay){
        sum = basepay.basepay + projectpay.projectpay+sharepay.sharepay;
        System.out.println("管理层的总工资为："+sum);
    }

    public static void main(String args[]){
    SE se = new SE(500,100);
    PM pm = new PM(1000,100,200);
    Salary salary = new Salary();
    salary.getpay(se,se);
    salary.getpay(pm,pm,pm);
 }
}