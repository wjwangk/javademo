package com.javaplan.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String args[]){

        Map<String,String > map = new HashMap<>();
        map.put("1","AA");
        map.put("2","BB");
        map.put("3","CC");
        map.put("4","DD");
        System.out.println(map);
        System.out.println("---------添加后----------------");
        /**
         * 使用For-Each 查询各 key-value 值
         * map.get(key)：返回指定 key 所映射的 values，没有时，为null
         * map.keySet(): 返回所有 key键的数组集合
         * map.entrySet(): 返回所有的key和对应的value值
         */
        for(String key: map.keySet()){
            System.out.println(key+","+map.get(key)+map.keySet()+map.entrySet());
        }
        //修改
        map.put("3","dd");
        System.out.println("-----------修改后-------------");
        /**
         * 使用 Map.EntrySet 遍历 key 和 value   （推荐使用这个方法查询）
         */
        for(Map.Entry<String,String> mes: map.entrySet()){
            System.out.println(mes.getKey()+","+mes.getValue());
        }
        //删除
        map.remove("1");      //注意：remove() 方法中的key是String类型，而不是int类型
        map.remove("5");     //删除时，如果没有，不会报错

        /**
         * 使用迭代器查询所有 kay-value 值
         */
        System.out.println("----------删除后---------");
        Iterator<Map.Entry<String,String>> ite= map.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry<String,String> entry=ite.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }


    }
}
