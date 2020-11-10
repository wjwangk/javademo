package com.xiaowenzi.demo.encapsulation;

// 封装
/**
 * 封装的优点：
 * 1.良好的封装能够减少耦合
 * 2.类内部的结构可以自由修改
 * 3.可以对成员变量进行更精确的控制
 * 4.隐藏信息，实现细节
 */

public class Encapsul {

    private String name;

//通常情况下，任何要访问类中的私有成员变量的类，都要通过getter 和 setter方法
    public void setName(String nameme){
        this.name = nameme;
        //name = nameme;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){

        Encapsul en = new Encapsul();
        en.setName("liming");
        System.out.println(en.getName());

    }
}
