package com.xiaowenzi.demo.fengzhuang.chengyuanneibulei;

/*
成员内部类：在外部类的成员变量下新增一个内部类，这个内部类相当与是外部类的成员变量
 */
public class Outer {
    private  int a = 10;   //外部类的私有变量a
    private  int c = 88;
    public  class Inner{       //内部的Inner 类
        private int a = 66;   //内部类中的私有变量a
        private  int b = 99;       //内部类的私有变量，内部类可以使用任意访问控制符，如public、private/protected
        /*
        内部类的私有方法
        1.如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法
        2.如果内部类想要访问外部类的成员变量和方法,需要使用this关键字
         */
        private void show(){

            System.out.println("访问外部类中的c:"+c);
            System.out.println("访问内部类中的b:"+b);
            System.out.println("用this访问内部类中的a:"+this.a);
            System.out.println("用this访问外部类中的a:"+ Outer.this.a);
        }
    }

    /*
    主函数入口
    使用内部类必须：
    1.先创建一个外部类对象
    2.使用 外部类对象.new 来创建一个内部类对象
    3.内部类对象.内部类方法
    即：内部类 对象名 = 外部类对象.new 内部类( );
    4.外部类不能直接使用内部类的成员和方法，只能通过以上方法使用
     */
    public static void main(String args[]){
        Outer o = new Outer();
        Inner i = o.new Inner();
        i.show();
    }
}


