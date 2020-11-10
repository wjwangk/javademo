package com.javaplan.character;

import java.util.UUID;

import static java.lang.Math.PI;

/**
 * 实现功能：
 *1. math类 常用方法
 * 2. random类 随机生成数
 * 3. UUID 使用
 */

public class MathMethod {

    /**
     * 算数计算：
     * Math.sqrt() : 计算平方根
     * Math.cbrt() : 计算立方根
     * Math.pow(a, b) : 计算a的b次方
     * Math.max( , ) : 计算最大值
     * Math.min( , ) : 计算最小值
     * Math.abs() : 取绝对值
     */
    public void suanShu(){
        System.out.println("计算平方根"+Math.sqrt(100));
        System.out.println("计算立方根"+Math.cbrt(100));
        System.out.println("计算a的b次方"+Math.pow(9,4));
        System.out.println("计算最大值"+Math.max(201.0,201));
        System.out.println("计算最小值"+Math.min(-119.8,99.8));
        System.out.println("取绝对值"+Math.abs(-100.90));;
    }

    /**
     * 进位
     * Math.ceil(): 天花板的意思，就是逢余进一
     * Math.floor() : 地板的意思，就是逢余舍一
     * Math.rint(): 四舍五入，返回double值。注意.5的时候会取偶数
     * Math.round(): 四舍五入，float时返回int值，double时返回long值
     */
    public void jinWei(){
        System.out.println(Math.ceil(-102.8));
        System.out.println(Math.floor(190.8));
        System.out.println(Math.rint(208.5));   // 4以下舍去，5时，取偶数，5以上进位
        System.out.println(Math.rint(-209.5));
        System.out.println(Math.round(100.23));
    }

    /**
     * Math.random(): 取得一个[0, 1)范围内的随机数
     * @param
     */
    public void getRandom(){
        System.out.println(Math.random());    // [0, 1)的double类型的数
        System.out.println(Math.random()*3);   //[0,3)的double类型的数
        System.out.println(Math.random()*10+5);//[5,15)的double类型的数

    }
    // 获取UUID数，可以将其理解成当前时空下唯一的一串字符串。通常用在邮箱激活码或者是ID上
    public void getUuid(){
        System.out.println("随机生成的UUID："+UUID.randomUUID());
        System.out.println("转化为字符串的UUID："+UUID.randomUUID().toString());   //生成的码带有-，所以需要去掉-
        System.out.println("格式化后的UUID："+UUID.randomUUID().toString().replace("-",""));
    }

    //三角函数和角度问题
    public void triangleFunction(){
        System.out.println("sin(π/2)"+Math.sin(PI/2));
        System.out.println("弧度转角度:"+Math.toDegrees(PI/2));
        System.out.println("角度转弧度："+Math.toRadians(90));
    }

   // 对数运算
    public void duiShu(){
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));
    }

    public static void main(String[] args){

        MathMethod mm = new MathMethod();
    //    mm.suanShu();
    //    mm.jinWei();
    //    mm.getRandom();
    //    mm.getUuid();
        mm.triangleFunction();
        mm.duiShu();





    }

}
