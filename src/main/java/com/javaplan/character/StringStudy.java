package com.javaplan.character;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringStudy {
    String site = "hello string";
     int len = site.length();
    String str1 = " i am studing ";
    String str2 = "abcd1234dcba4321";
    String str3 = new String("aabbcckkmmjj987LLPP");

    private StringStudy(){
        System.out.println("构造函数");
    }
    public void getString(){

        /**
         * length（）  和 size（）区别：
         * length（）：是对字符串和数组来说的，取一个字符串或者数组的长度
         * size（）： 是对泛型集合来说的，想要知道集合中有多少个值，用 .size()方法
         */
        System.out.println("site字符串的长度为："+len);
        System.out.println("字符串拼接："+site+str1+" fighting");
        System.out.println("字符串拼接："+site.concat(str1));
        System.out.println("返回指定索引处的字符"+str2.charAt(3));          //返回指定所引处的 char 值
        System.out.println("转化为字符串并输出"+str3.toString());
        System.out.println("转化成大写"+str3.toUpperCase());     //转换成大写
        System.out.println("转化成小写"+str3.toLowerCase());     //转换成小写
        System.out.println(str1.trim());  //只能去除前后空格
        System.out.println(str1.replace(" ",""));
     //   str1.split("1",2);
        System.out.println(str1.hashCode());



    }

    /**
     * 获取字符串中某个字符的位置索引indexOf(int char)  ; 没有的话，返回-1
     * char 和 string 的区别是： char—一位字符，有 UNICODE编码
     */
    public void getIndexOf(){
        String str1 = "7aaa68987abc";
        String str2 = new String("abfgjksbsca123");
        //字符串中某个字符第一次出现的位置索引 indexOf(int char)   unicode: a-97,b-98,c-99
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf(97));
        System.out.println(str2.indexOf('b'));
        System.out.println(str2.indexOf(98));
        //从 fromIndex 开始，某个字符第一次出现的位置  indexOf(int char,int fromIndex)
        System.out.println(str1.indexOf('a',3));
        System.out.println(str2.indexOf('b',3));

        //字符串中某个字符第一次出现的位置索引 indexOf(String str)
        System.out.println(str1.indexOf("aa"));
        System.out.println(str2.indexOf("ab"));
        System.out.println(str2.indexOf(98));
        //从 fromIndex 开始，某个字符第一次出现的位置 indexOf(String str,int fromIndex)
        System.out.println(str1.indexOf("a1",3));
        System.out.println(str2.indexOf("b",3));

        //字符串中的某字符最后一次出现的位置索引
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str2.lastIndexOf("aa"));
        //从fromIndex 开始截取，某字符最后一次出现的位置索引
        System.out.println(str1.lastIndexOf('7',3));
        System.out.println(str2.lastIndexOf("b",3));

    }

    /**
     * 字符串格式化
     * @param
     */
    public void format() {
        String str1 = "hello world";
        int num = 2000;
        double sam = 3.1415926;
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("整数类型格式化："+String.format("%,d",num));
        System.out.println("双精度类型格式化："+String.format("%f",sam));
        System.out.println("日期格式化："+ sdf.format(date));
        System.out.println(String.format("%tc",date));

    }

    //字符串比较
    public void  compare(){
       String str1 = new String("abc098");
       String str2 = new String("abc");
       String str3 = str2 + "098";
       String str4 = "ABC098";
        System.out.println(str1 == str3);
        //str1.equals(str2):比较两个字符串的值是否相等，区分大小写
        System.out.println(str1.equals(str3));
        // str1.equalsIgnoreCase(str2):比较两个字符串的值是否相等，忽略大小写
        System.out.println(str1.equalsIgnoreCase(str4));
    }
    public static void main(String[] args){

        StringStudy ss = new StringStudy();
    //    System.out.println(ss.str2);
    //      ss.getString();
    //      ss.getIndexOf();
     //       ss.format();
     //       ss.compare();

    }
}
