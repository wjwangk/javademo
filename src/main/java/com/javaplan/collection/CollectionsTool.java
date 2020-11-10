package com.javaplan.collection;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTool {

    public static void main(String args[]) {

    CollectionsTool ct = new CollectionsTool();
   // ct.paixu();
    ct.replace();

    }

    /**
     * 排序操作
     */
    public void paixu(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("d");

        System.out.println("原数组:"+list);
        Collections.sort(list);
        System.out.println("自然排序后："+list);
        Collections.reverse(list);
        System.out.println("反转后："+list);
        Collections.shuffle(list);
        System.out.println("随机排序："+list);
        Collections.swap(list,0,1);
        System.out.println("交换两个索引的位置："+list);

        //当distance为正数时，将list后distance个元素整体移到前面。
        // 当distance为负数时，将 list的前distance个元素整体移到后面。
        Collections.rotate(list,-2);
        System.out.println("旋转后："+list);

    }

    /**
     * 查找替换
     */

    public void replace(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(-1);
        list.add(0);
        list.add(8);
        list.add(0);
        System.out.println(list);
        System.out.println("二分查找："+Collections.binarySearch(list,2));
        System.out.println("最大数："+Collections.max(list));
        System.out.println("最小数："+Collections.min(list));
        System.out.println("统计元素出现次数："+Collections.frequency(list,0));
        System.out.println("替换："+Collections.replaceAll(list,1,10));
    }
}
