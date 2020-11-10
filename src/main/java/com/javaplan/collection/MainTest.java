package com.javaplan.collection;

import java.util.*;

// collection 集合的一些练习题
public class MainTest {

    /**
     * 生成10个1到20之间的不重复的随机数
     * 1. 需要生成随机数，那么需要Random类
     * 2. 需要存储10个不能重复的数，需要HashSet集合
     * 3. 判断，当HashSet的Size小于10就往里存储随机数，等于就停止添加存储元素
     * 4. 通过Random的nextInt()方法获取随机数并加入到HashSet里
     * 5. 遍历HashSet,打印出10个随机数
     */
    public void setRandom(){
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add(random.nextInt(10) + 10);
        }

        Iterator<Integer> ite = set.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }

    /**
     * 二．从键盘获取一行输入字符串，要求去除重复字符。
     * 分析过程：
     * 1. 需要使用Scanner
     * 2. 输入的是一行字符串，需要转换成字符数组
     * 3. 创建HashSet集合对象
     * 4. 字符数组遍历元素，并添加进入HashSet集合
     * 5. 变量集合元素
     */
    public void setScanner(){
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.next();
        //   System.out.println(scanner);
        Set<String> set = new HashSet<>();
        set.add(ss);
        for(String str:set){
            System.out.println(str);
        }

    }

    /**
     * 将1~20之间的所有正整数存放在一个 List 集合中，并移除索引为10的对象, 和内容为 10 的对象
     * @param
     */
    public void test1(){
        List<Integer> list = new ArrayList();
        for(int i =1;i<=20;i++){
            list.add(i);
        }
        list.remove(10);
        list.remove("10");
        for(Integer in : list){
            System.out.println(in);
        }
    }



    public static void main(String args[]) {

         MainTest mt = new MainTest();
        // mt.setRandom();
       // mt.setScanner();
        mt.test1();

    }
}
