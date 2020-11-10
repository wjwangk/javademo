package com.xiaowenzi.demo.fengzhuang.fangfaneibulei;

import com.sun.javafx.tk.TKPulseListener;

/*
方法内部类：内部类定义在外部类的方法中。方法内部类只在该方法的内部可见，即只在该方法的内部可以使用

notices:一定要注意哦：由于方法内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用访问控制符和 static 修饰符。
 */
public class MOuter {
     int a = 100;
     public void show(){
         final int b = 11;
         double c = 22.1;
         /*
         1.方法内部类，要使用方法内部类中的成员，必须先实例化一个对象
         2.一定要注意哦：由于方法内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用访问控制符和 static 修饰符。
          */
         class MInner{
             int d = 5;
             public void println(){
                 System.out.println("访问外部类中的变量a="+a);
                 System.out.println("访问外部类中的外部方法中的常量b="+b);
             //    System.out.println("访问外部类中的外部方法中的边量c="+c);
                 System.out.println("访问内部类中的边量d="+d);
             }
         }
         MInner mi = new MInner();
         mi.println();
     }

     public static void main(String args[]){
         MOuter mo = new MOuter();
         mo.show();
     }
}
