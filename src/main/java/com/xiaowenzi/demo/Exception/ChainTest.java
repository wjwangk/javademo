package com.xiaowenzi.demo.Exception;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
// 异常连
* test1():抛出"喝大了"异常
* test2():调用test1(),捕获“喝大了”异常，并且包装成运行时异常，基础抛出
* main()方法中，调用test2()，尝试捕获test2()方法抛出的异常
 */
public class ChainTest {
    public static void main(String[] args) {
        // 创建一个空的StringBuilder对象
        StringBuilder str = new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for (int i = str.length() - 3; i > 0; i = i - 3) {

            str.insert(i, ",");
        }

        // 将StringBuilder对象转换为String对象并输出
        System.out.println(str.toString());


        // 使用Date类无参的构造方法获取当前时间
        Date d = new Date();
        System.out.println(d);
        /* 1.使用 SimpleDateFormat 来对日期时间进行格式化，如可以将日期转换为指定格式的文本，
            也可将文本转换为日期。
            2.使用 format() 方法将日期转换为指定格式的文本
            3.使用 parse() 方法将文本转换为日期
         */
        // 使用 format() 方法将日期转换为指定格式的文本
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  ");
        String today = sdf.format(d);
        System.out.println(today);
       /* 使用 parse() 方法将文本转换为日期
       注意：调用 SimpleDateFormat 对象的 parse() 方法时可能会出现转换异常，
             即 ParseException ，因此需要进行异常处理
        */

        String day = "2019年8月4日 11时24分50秒";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        try {
            Date date = df.parse(day);
            System.out.println(date);
        } catch (Exception e) {
            System.out.println("您输入的格式不正确");
        }
        /*
        Math方法：
        1.Math 类位于 java.lang 包中
        2.Math 类的所有方法都是静态方法，所以使用该类中的方法时，可以直接使用类名.方法名，如： Math.round();
        3. 以下举例说明java中常见的方法

         */
        double a = 3.1415926;
        int b = (int)a;
        System.out.println("强制类型转换后b的值为："+b);
        double c = Math.round(a);
        System.out.println("四舍五入后c的值为："+c);
        double d1 = Math.floor(a);
        System.out.println("小于参数a 的最大整数值为："+d1);
        double d2 = Math.ceil(a);
        System.out.println("大于参数a 的最小整数值为："+d2);
        int  e = (int )Math.random()*10;
        System.out.println("产生[0,10)之间的随机浮点数为："+e);
        double f = Math.abs(a);
        System.out.println("参数a的绝对值为："+f);


    }

}