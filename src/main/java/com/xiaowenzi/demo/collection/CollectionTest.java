package com.xiaowenzi.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 将要完成：
 * 功能1：通过Collection.sort()方法，对Interger泛型的List进行排序
 * 功能2：
 */

public class CollectionTest {

    /**
     * 功能1：通过Collection.sort()方法，对Interger泛型的List进行排序
     * 1.创建一个Integer泛型的List对象
     * 2.创建10个100以内的随机数List，并插入到List对象中
     * 3.使用Collection.sort()方法进行排序
     */
    public void testSort1() {
        //定义Integer泛型
        List<Integer> intlist = new ArrayList<Integer>();

        Integer n;
        //插入10个100以内的不重复的随机整数
            for (int i = 0; i < 10; i++) {       //插入10个数
                do {

                    Random random = new Random();       //插入100以内的随机整数
                    n = random.nextInt(100);

            }while (intlist.contains(n));        //判断插入的整数不重复，即boolean 值为true
                intlist.add(n);          //把插入的数添加到intlist对象中
                System.out.println("成功添加整数："+n);       //打印添加的整数
        }
        System.out.println("...............排序前..................");
        for (Integer integer : intlist) {
            System.out.println("生成的字符串为：" + integer);
        }
        //使用collections.sort()方法对对象进行排序
        Collections.sort(intlist);
        System.out.println("...............排序后..................");
        for (Integer integer : intlist) {
            System.out.println("生成的字符串为：" + integer);
        }
    }


    /**
     * 实现功能：利用Collections.sort()方法对泛型为String的List进行排序
     * 1.创建完List<String>之后，往其中添加十条随机字符串
     * 2.每条字符串的长度为10以内的随机整数
     * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
     * 4.每条随机字符串不可重复
     * @param args
     */
    //第一步：使用下面方法首先生成一个随机的字符串
    public String testSort2(int length) {
        StringBuffer sb = new StringBuffer();
        String str1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                    for (int i = 0; i <length ; i++) {
                        Random random = new Random();
                        int n2 = random.nextInt(str1.length());
                        sb.append(str1.charAt(n2));     //
                    }
                System.out.println("长度为10的随机整数为："+sb);
                String str = sb.toString();
                return str;
            }
            //第二步:使用以下方法生成10个不重复的字符串，并且对字符串进行排序
    public void testSort3 () {
        List<String> strlist = new ArrayList<String>();
        String str1;
        int k;
        for (int j = 0; j < 10; j++) {
            Random random = new Random();
            k=random.nextInt(10);
            do {
                str1 = testSort2(k);
            } while (strlist.contains(str1));
            strlist.add(str1);          //把插入的数添加到intlist对象中
            System.out.println("成功添加整数：" + str1);       //打印添加的整数
        }
        System.out.println("...............排序前..................");
        for (String str : strlist) {
            System.out.println("生成的字符串为：" + str);
        }
        Collections.sort(strlist);
        System.out.println("...............排序后..................");
        for (String str : strlist) {
            System.out.println("生成的字符串为：" + str);
        }
    }



    public static void main(String[] args) {
        CollectionTest ct = new CollectionTest();

        //  ct.testSort1();
        //    ct.testSort2();
        ct.testSort3();

    }


    }

