package com.javaplan.collection;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 元素有序且可以重复
 */
public class ListTest {

    public static void main(String args[]){

        // 增
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(2,"DD");   //索引地址为2的位置加上DD，注意：索引地址从0开始
        list.add("DD");      //list 元素可以重复，并且有序，所以能通过索引地址找到
        list.add("DD");
        System.out.println(list);   //这样打印出来的是一个数组

        /**
         * 查
         */
        // 使用 for-Each 遍历 list，这样打印出来是
        System.out.println("------这是for-Each遍历得到的结果------");
        for (String str : list) {
            System.out.println(str);
        }


        /**
         * 删除 —— remove() 方法
         */
        list.remove(2);
        //使用 迭代器查询
        System.out.println("------这是迭代器得到的结果------");
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){               //检测是否还有下一个单词，以空格作为分隔符，返回true or false
            System.out.println(ite.next());   //返回下一个单次
        }

        /**
         * 修改——set() 方法
         */
        list.set(3,"ee");
        list.set(3,"DD");
        System.out.println("------这是for 循环得到的结果------");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));       //可以通过 get()方法取到list数组中的值，因为list数组有序
        }





    }

}
