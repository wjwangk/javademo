package com.xiaowenzi.demo.extend;

public class TestDog {

    public static void main(String[] args){

        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();

       // ((Dog) b).bark();
        ((Dog) b).bark();
        /* 1.注意这种写法，若写成 b.bark() 则编译器报错
           2.这种写法可以直接由编译器索引出来
        */
    }
}
