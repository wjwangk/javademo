package com.xiaowenzi.demo.controller;

import org.apache.tomcat.util.buf.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    /* 无参无返回
     public static void main(String arg[])
     {
         HelloWorld hello=new HelloWorld(); //定义一个对象
         hello.nums();                        //直接使用 对象.方法 调用
     }
     //定义一个无参无返回的方法
     public void nums()        //无返回值，用void ;无参：方法名（）  括号内没有参数
     {
         int a=5;
         System.out.println("无参无返回结果："+a);
     }
     */
   /*   无参有返回值
        public static void main(String arg[])
        {

            HelloWorld hello=new HelloWorld(); //定义一个对象
            double sum=hello.nums();           //调用方法并接受方法的返回值，保存在sum中
            System.out.println("无参有返回结果："+sum);                   //直接使用 对象.方法 调用
        }

//定义一个无参有返回值的方法
        public double nums()        //无返回值，用void ;无参：方法名（）  括号内没有参数
        {
            double a=5;
            return a;
        }
        */
    /* 有参无返回
    public static void main(String arg[])
    {

        HelloWorld hello=new HelloWorld(); //定义一个对象
        hello.nums(5);           //调用方法，传入和形参同类型的实参

    }

    //定义一个有参无返回值的方法，形参类型可以是int型，double型，string型，数组型等任意类型
    public void nums(int a)        //无返回值，用void ;无参：方法名（）  括号内没有参数
    {
        System.out.println("请输出a的值；"+a);
    }
  */

    public static void main(String arg[]) {

        HelloWorld hello = new HelloWorld(); //定义一个对象
        int[] a= {12,23,14,32};
        int count = hello.sort(a);           //调用方法，传入和形参同类型的实参
        System.out.println("数组a的长度为：" + count);
    }

    //定义一个有参无返回值的方法，形参类型可以是int型，double型，string型，数组型等任意类型
    public int sort(int[] a)        //无返回值，用void ;无参：方法名（）  括号内没有参数
    {
        Arrays.sort(a);    //对nums中的数据进行排序
        System.out.println(a);
        System.out.println("a数组排序后结果："+Arrays.toString(a));
        System.out.println("a数组排序后结果："+ Arrays.asList(a));

        return a.length;
    }
}

//  总结：无返回值的，直接new一个对象后，使用对象.方法（）调用；
//        有返回值的，new一个对象后，先定义一个和返回值同类型参数=对象.方法名（），再使用



/*


    public static void main(String[] args) throws ParseException {
        // 创建一个空的StringBuilder对象
        StringBuilder str = new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for (int i = str.length() - 3; i >= 0; i = i - 3)
            str.insert(i, ",");


        // 将StringBuilder对象转换为String对象并输出
        System.out.println(str.toString());

        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf1.format(d));
        String day = "2018年02月24日 16:45:23";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf2.parse(day));

    }
}
*/