package com.xiaowenzi.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 实现功能：利用Collections.sort()方法对泛型为String的List进行排序
 * 1.创建完List<String>之后，往其中添加十条随机字符串
 * 2.每条字符串的长度为10以内的随机整数
 * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
 * 4.每条随机字符串不可重复
 * @param args
 */

public class CollectionTestt {
    public String getRandomString(int length){
        //定义组成随机字符串的所有字符
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            //产生62以内的随机数，因为组成随机字符串的字符有62个
            int number=random.nextInt(62);
            //将str的第number个字符加到sb的末尾
            sb.append(str.charAt(number));
        }
        return sb.toString();

    }



    public void getRandomLengthString(){
//用一个String泛型的List来存放10个长度为10以内的随机整数的随机字符串
        List<String> stringList=new ArrayList<String>();
        Random random=new Random();
        int k;
        for(int i=0;i<10;i++){
            String str;
            //产生10以内的随机整数
            k=random.nextInt(10);
            //当stringList中没有该随机产生的字符串时把字符串加入到stringList中，避免stringList中有重复的随机字符串。
            do{
                str=getRandomString(k);
            }while((stringList.contains(getRandomString(k))) && (str!= null));
            stringList.add(str);
            System.out.println("成功添加字符串："+str);
        }

        System.out.println("-----------------排序前--------------------");
        for(String str:stringList){
            System.out.println("生成的字符串为："+str);
        }
        Collections.sort(stringList);
        System.out.println("-----------------排序后--------------------");
        for(String str:stringList){
            System.out.println("生成的字符串为："+str);
        }

    }

    public static void main(String[] args){
        CollectionTestt test=new CollectionTestt();
        test.getRandomLengthString();
    }
}

