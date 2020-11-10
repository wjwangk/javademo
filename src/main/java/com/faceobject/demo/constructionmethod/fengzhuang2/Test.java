package com.faceobject.demo.constructionmethod.fengzhuang2;

/*
一、定义一个计算器工具类
    1.求两个数的和
    2.求两数之差
    3.求两数取余
    4.求两数之积
二、定义一个测试类进行验证
 */
public class Test extends Calculator {
    double a =100;
    double b =100;
    public void sum(){
        double sum=a+b;
        System.out.println("两数相加结果为："+sum);
    }

    public void sub(){
        double sub = a-b;
        System.out.println("两数相减结果为："+sub);
    }

    public void pro(){
        double pro = a*b;
        System.out.println("两数想成结果为："+pro);
    }

    public void div(){
        if(b ==0){
            System.out.println("除数不能为0");
        }else {
        double div = a/b;
        System.out.println("两数相除结果为："+div);
        }
    }
    public static void main(String args[]){
        Calculator calculator = new Test();
        calculator.sum();
        calculator.sub();
        calculator.pro();
        calculator.div();
    }

}
