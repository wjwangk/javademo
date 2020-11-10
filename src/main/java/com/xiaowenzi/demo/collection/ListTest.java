package com.xiaowenzi.demo.collection;
/**
 * Collecttion 包实现功能——模拟学生选课功能
 * ## 选择课程（往集合中添加课程）
 * ## 删除所选的某门课程（删除集合中的元素）
 * ## 查看所选课程
 * ## 修改所选课程
 * <p>
 * <p>
 * 备选课程类
 * <p>
 * <p>
 * 备选课程类
 */
/**
 *
 * 备选课程类
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    /**
     * 用于存放备选课程的List
     *
     */
    public List coursesToSelect;

    public ListTest() {

        this.coursesToSelect = new ArrayList();

    }

    /**
     * 用于往coursesToSelect 中添加备选课程
     */
    public void testAdd() {
        /**
         * 创建一个课程对象，并通过调用add方法，添加到备选课程List中
         */
        System.out.println("添加课程——使用add()添加课程");
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);     //此时数组长度为0，所以这里默认插入到下标为0的位置
        Course temp = (Course) coursesToSelect.get(0);     //下标从0开始的
        System.out.println("添加了课程：" + temp.id + ":" + temp.name);

        System.out.println("添加课程——使用add（int index,Object element）添加课程");
        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);   //插入到下标为0的位置，之前0位置的值被依次挤到后面
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

        //以上执行完毕后，数组的长度为2，下标分别为0和1，现在插入元素值=长度时，会顺序插入到数组末尾
        Course cr3 = new Course("3", "化学");
        // <=> coursesToSelect.add(cr3);如果不下index值时，默认插入末尾
        coursesToSelect.add(2, cr3);
        Course temp3 = (Course) coursesToSelect.get(2);
        System.out.println("添加了课程：" + temp3.id + ":" + temp3.name);

        //插入元素值>数组长度时，会报错：数组下标越界异常，同样，若下标小于0，也会报数组下标越界
        //   Course cr4 = new Course("4","物理");
        //   coursesToSelect.add(8,cr2);

        /**
         * 使用addALL(Collection c)方法
         */
        System.out.println("添加课程——使用addALL(Collection c)添加课程");
        Course[] course = {new Course("4", "离散数学"), new Course("5", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp4 = (Course) coursesToSelect.get(3);
        Course temp5 = (Course) coursesToSelect.get(4);
        System.out.println("添加了2门课程：" + temp4.id + ":" + temp4.name + temp5.id + ":" + temp5.name);


        /**
         * 使用addALL(int index,Collection c)方法,插入到指定位置。注意下标从0开始的
         */
        System.out.println("添加课程——使用addALL(int index,Collection c)方法,插入到指定位置6和位置7");
        Course[] course2 = {new Course("6", "大学英语"), new Course("7", "java课程")};
        coursesToSelect.addAll(3, Arrays.asList(course2));
        Course temp6 = (Course) coursesToSelect.get(3);
        Course temp7 = (Course) coursesToSelect.get(4);
        System.out.println("添加了2门课程：" + temp6.id + ":" + temp6.name + temp7.id + ":" + temp7.name);

        /**
         * 重复添加相同的元素
         */
        System.out.println("添加课程——重复添加相同的元素");
        coursesToSelect.addAll(Arrays.asList(course2));
        Course temp8 = (Course) coursesToSelect.get(7);
        Course temp9 = (Course) coursesToSelect.get(8);
        System.out.println("添加了2门课程：" + temp8.id + ":" + temp8.name + temp9.id + ":" + temp9.name);
    }


    /**
     * 课程查询——方法一：使用for循环依次遍历
     */
    public void testGet() {
        System.out.println("使用for循环依次查询课程列表");
        int length = coursesToSelect.size();
        for (int i = 0; i < length; i++) {
            Course temp0 = (Course) coursesToSelect.get(i);
            System.out.println(temp0.id + ":" + temp0.name);
        }
    }


    /**
     * 课程查询——方法二：使用迭代器的循环访问
     * 注意：迭代器依赖于集合存在，不能单独存在
     */
    public void testIterator() {
        System.out.println("使用迭代器访问查询课程列表");
        Iterator it = coursesToSelect.iterator();
        while (it.hasNext()) {
            Course cr = (Course) it.next();
            System.out.println(cr.id + ":" + cr.name);

        }
    }


    /**
     * 课程查询——方法三：使用迭代器的forEach方法访问
     * 注意：迭代器依赖于集合存在，不能单独存在
     */
    public void testForEach() {
        System.out.println("使用迭代器通过 for each访问查询课程列表");
        for (Object obj : coursesToSelect) {
            Course cr = (Course) obj;
            System.out.println(cr.id + ":" + cr.name);

        }
    }

    /**
     * 修改List 中的元素——调用set（）方法
     * @param args
     */
    public void testModify() {
        System.out.println("修改课程——使用set（）修改8位置和9位置的值");
        coursesToSelect.set(7, new Course("8", "毛概"));
        coursesToSelect.set(8, new Course("9", "生物科学"));
    }

    /**
     * 删除课程——使用方法remove(Object)
     * @param args
     */
    public void testRemove() {
        System.out.println("删除课程——使用remove（Object）删除7位置的值");
        Course cr = (Course) coursesToSelect.get(7);
        System.out.println("我是取出来的元素：" + cr.id + ":" + cr.name + ",我将要被删除啦");
        coursesToSelect.remove(cr);
        System.out.println("元素删除成功啦");
        testForEach();
    }

    /**
     * 删除课程——方法二：使用remove（int index）
     * index——指的是删除位置的索引
     * 注意：
     * 如果index<0 || index >=size() 时，会报异常</0>
     * @param args
     */
    public void testRemove1() {
        System.out.println("删除课程——使用remove（int index）删除7位置的值");
        Course cr = (Course) coursesToSelect.get(7);
        System.out.println("我是取出来的元素：" + cr.id + ":" + cr.name + ",我将要被删除啦");
        coursesToSelect.remove(7);
        System.out.println("元素删除成功啦");
        testForEach();
    }

    /**
     * 删除课程——方法三： removeAll(collection e)方法：从一个集合中将另一个集合中的元素全部删除
     * 以下功能实现删除集合4位置和5位置上的元素
     * @param args
     */
    public void testRemove2() {
        System.out.println("删除课程——使用removeAll（）删除4位置和5位置的值");
        //将位置4和位置5上的元素取出来，放到一个新的数组中
        Course[] cr = {(Course) coursesToSelect.get(4), (Course) coursesToSelect.get(5)};
        //removeAll时，后面为集合，需要把以上cr数组转变为集合，使用Arrays.asList()方法
        coursesToSelect.removeAll(Arrays.asList(cr));
        testForEach();

    }

    public static void main(String[] args) {

//        ListTest lt = new ListTest();
//        lt.testAdd();
//        lt.testGet();
//        lt.testIterator();
//        lt.testForEach();
//        lt.testModify();
//        lt.testForEach();
//        lt.testRemove();
//        lt.testRemove1();
//        lt.testRemove2();

        List<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("123");

        list.remove(0);
        list.remove(123);

        list.get(1);

        list.add(1, "ccc");

        list.set(1, "ddd");

        boolean flag  = list.contains(123);

        String a = list.get(2);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
        }

        for (String str : list) {
            System.out.println(str);
        }






    }
}
