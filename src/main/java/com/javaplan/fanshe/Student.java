package com.javaplan.fanshe;

import java.lang.reflect.Constructor;

public class Student {

    //（默认的构造方法）
    Student(String str){
        System.out.println("默认的构造方法"+str);
    }
    //无参的构造方法
    public Student(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }
    //有一个参数的构造方法
    public Student(char name){
        System.out.println("姓名："+name);
    }
    //有多个参数的构造方法
    public Student(String name,int age){
        System.out.println("姓名："+name+"年龄："+ age);
    }
    //受保护的构造方法
    protected Student(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }
    //私有构造方法
    private Student(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }

    public static void main(String args[])throws Exception{
        //1.加载Class对象
        Class stuClazz = Class.forName("com.javaplan.fanshe.Student");

        //2.获取所有公有构造方法
        System.out.println("**********************所有公有构造方法***************************");
        Constructor[] conArry = stuClazz.getConstructors();
        for(Constructor con:conArry){
            System.out.println(con);
        }

        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        conArry = stuClazz.getDeclaredConstructors();
        for(Constructor con:conArry){
            System.out.println(con);
        }

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor conArray1 = stuClazz.getConstructor(null);
        System.out.println(conArray1);
        Object obj = conArray1.newInstance();

        System.out.println("******************获取私有构造方法，并调用*******************************");
        conArray1 = stuClazz.getDeclaredConstructor(char.class);
        System.out.println(conArray1);
        conArray1.setAccessible(true);
        obj = conArray1.newInstance('男');

    }
}
