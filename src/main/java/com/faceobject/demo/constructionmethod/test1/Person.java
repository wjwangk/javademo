package com.faceobject.demo.constructionmethod.test1;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void workDog(Dog dog, Park park){
        System.out.println(name +"在"+park.park+"遛"+dog.name );}

        public void runs(Shoes name1, Shoes color1, Park park1){
        System.out.println(name +"穿着"+color1.color+name1.name+"在"+park1.park+park1.run());

    }
    public static void main(String args[]){
       Dog dog = new Dog("狗");
        /*  注释掉 dog 的有参构造方法后的赋值方法
        Dog dog = new Dog();
        dog.name = "狗";
        */
        Park park = new Park("公园");
        /* 注释掉 park 的有参构造方法后的赋值方法
        Park park = new Park();
        park.park = "公园";
        */

        /*
        小美在朝阳公园溜旺财【注：旺财是狗】
         */
        Person person = new Person("小美");
        person.workDog(dog,park);

        /*
        小明穿着白色的特步运动鞋在奥林匹克公园跑步
         */
        Person person1 = new Person("小明");
        Park park1 = new Park("奥林匹克公园");
        Shoes shoes = new Shoes("白色的","特步运动鞋");
        person1.runs(shoes,shoes,park1);
    }
}
