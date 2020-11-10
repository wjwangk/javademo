package com.xiaowenzi.demo.Test;

public class Cat extends Animal {
    int food;
    public Cat() {

        System.out.println("这是一个无参的子类构造函数");

    }

    /**
     * 方法的重写：子类继承父类时，定义一个和父类形参相同的方法，方法名等于类名
     *
     * @param name
     */
    public Cat(String name) {
        super(name);           //这里的super是调用父类有参的构造器，若父类构造器无参，则自动调用，无需super
        System.out.println(name+"说：这是一个有参的子类构造函数");
    }

    /**
     * eat为父类方法的重写
     *
     * @param food
     * @return
     */
    @Override
    public String eat(String food) {

        System.out.println("子类Cat继承父类方法，并重写父类的传参为String类型的eat方法，值为"+food);
        return "传参为String类型的方法";
    }
    @Override
    public String eat(int food) {
        super.eat(300);
        this.food = food ;
        System.out.println("子类Cat继承父类方法，并重写父类的传参为int类型的eat方法，值为"+food);

        return "传参为int类型的方法";

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("这是一个无参无返回的普通子类方法");

    }
}
