package com.xiaowenzi.demo.overload;

/**
 * 1.方法的重载：同一个类中，方法名相同，传参的个数或者顺序不同，返回值可以修改的方法
 * 2.方法的重写：子类继承父类的方法，方法的返回值和参数均相同，内容不同
 */

public class OverLoading1 {
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    public String test(int i,String name){
        System.out.println("test3");
        return "return test3";
    }

    public String test(String name,int i){
        System.out.println("test4");
        return "return test4";
    }

    public static void main(String[] args){

        OverLoading1 o = new OverLoading1();
       System.out.println(o.test());
       o.test(1);
       System.out.println(o.test(2,"liming"));
       System.out.println(o.test("xiaohua",3)) ;
    }
}
