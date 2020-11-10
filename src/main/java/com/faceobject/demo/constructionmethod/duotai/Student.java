package com.faceobject.demo.constructionmethod.duotai;

public class Student extends Person{
    String sex = "男";
/*
   public Student(){
        System.out.println("子类的无参构造方法");
    }
    */



    public Student(String name,int age){
        super("wanghong",10);
        System.out.println("子类的有参构造方法");
    }


    public void showInfo(String name,int age){
        System.out.println("姓名:"+name +" "+"年龄:"+age+" "+"性别:"+sex);
    }
}
