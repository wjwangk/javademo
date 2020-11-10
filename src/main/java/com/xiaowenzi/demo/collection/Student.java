package com.xiaowenzi.demo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class Student {

    public String id;
    public String name;
    public Set<Course> courses;

    public Student(String id,String name){

        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();    //实现Set接口定义的courses变量，使用HashSet 实现 Set接口
    }


}
