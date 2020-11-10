package com.xiaowenzi.demo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类型：规定集合只存放特定类型的对象
 */
public class TestGeneric {
    /**
     * 带有泛型——Course 的Lise 类型属性声明
     * 格式： Lise<属性类型></>
     */
    public List<Course> courses;

    /**
     * 实例化带有泛型的Lise 属性的 courses
     */
    public TestGeneric(){
        this.courses = new ArrayList<Course>();
    }

    /**
     * 测试增加
     */
    public void testAdd(){
        Course cr1 = new Course("1","大学语文");
        courses.add(cr1);
        //泛型集合会在编译时进行类型检查，不能添加泛型规定的类型及其子类型以外的对象，否则会报错
      //  courses.add("添加一些奇怪的方法呢？？？");
        Course cr2 = new Course("2","java基础");
        courses.add(cr2);
    }

    /**
     * 查询：即测试循环遍历的方法
     */
    public void testForEach(){
    //可以直接按照指定类型获取集合元素
        for(Course cr:courses){
            System.out.println(cr.id+":"+cr.name);
        }
    }

    /**
     * 泛型集合可以添加泛型的子类型的对象实例
     * @param args
     */
    public void testChild(){
        ChildCourse ccr = new ChildCourse();
        ccr.id = "3";
        ccr.name = "我是子类型的课程对象实例~~";
        courses.add(ccr);
    }

    /**
     * 泛型不能使用基本类型
     * @param args
     */
    public void testBasicType(){
        //使用基本类型时，编译器会报错，如下：
       // List<int> list = new ArrayList<int>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);   //1是int基本类型但是编译器没报错，是因为会把1强制转化成Integer类
        System.out.println("基本类型必须使用包装类："+list.get(0));
    }

    public static void main(String[] args){
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
        tg.testChild();
        tg.testForEach();
        tg.testBasicType();
    }

}

