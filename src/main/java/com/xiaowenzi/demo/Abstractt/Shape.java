package com.xiaowenzi.demo.Abstractt;

public abstract class Shape {

    /*
    抽象类中的抽象方法
     */
    public abstract void length();    //不需要写方法内容//

    public abstract void are();

    /*
    抽象类中可以包含普通的方法，也可以没有抽象方法
     */
    public void test(){
        System.out.println("抽象方法中可以包含普通方法");
    }

}
