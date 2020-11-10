package com.xiaowenzi.demo.fengzhuang.jingtaineibulei;

/*
静态内部类就是 用 static 修饰的内部类
 */
public class SOuter {
    private  int a = 99;
    private static double b = 100.0;
    public static int c = 105;
    public static class SInner{
        private  int a = 996;
        private static double b = 111.0;

        private  static void test(){
            System.out.println("访问外部类中的非静态成员变量a:"+new SOuter().a); //访问外部类中的非静态成员变量，使用 new 外部类().成员
            System.out.println("访问外部类中的静态成员变量b:"+SOuter.b);    //内外部类有相同成员时，访问外部类中的静态成员变量，使用 外部类.成员
            System.out.println("访问外部类中的静态成员变量c:"+c);           //内外部类无相同成员时，直接使用 成员名 访问静态成员变量
         //   System.out.println("访问内部类中的非静态成员变量a:"+a);    此语句不成立，因为静态方法中不能访问非静态成员
            System.out.println("访问内部类中的静态成员变量b:"+b);    //内外部类有相同成员时，访问内部类中的静态成员变量，直接使用 成员
        }
    }

    /*
    主方法
     */
    public static void main(String args[]){
        SInner si = new SInner();     //创建内部类对象，直接使用 内部类 对象 = new 内部类();
        si.test();
    }
}
