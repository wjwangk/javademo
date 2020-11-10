package com.xiaowenzi.demo.Exception;

// 自定义异常
public class CustomException extends Exception {

    public CustomException(){
        System.out.println("这是自定义异常中的无参构造器");
    }

    public CustomException(String name){
        super(name);
        System.out.println("这是自定义异常中的有参构造器");
    }
}
