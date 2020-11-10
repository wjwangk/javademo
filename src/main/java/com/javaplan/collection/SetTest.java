package com.javaplan.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//元素无序，不重复
public class SetTest {

    public static void main(String args[]){

        Set<String> set = new HashSet<>();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        set.add("DD");

        /**
         * 使用 迭代器查询 SET
         */
        Iterator<String> ite = set.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

        //删除
        set.remove("dd");
        set.remove("DD");
        System.out.println("------------删除后-------------");
        /**
         * 使用for-Each循环查询 set
         */
        for(String str: set){
            System.out.println(str);
        }




    }
}
