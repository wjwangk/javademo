package com.faceobject.demo.constructionmethod.fengzhuang1;

public class Student extends Person {
    int studentId = 1;
    String name = "黎明";
    int age = 20;
    String sex= "男";
    String address = "浙江省杭州市";
    String phone = "1234567890";

    public void printInfo(){

        System.out.println("学号:"+studentId+" 学生:"+name+"  年龄:"+sex+"  家庭住址:"+address+"  手机号:"+phone);
    }
}
