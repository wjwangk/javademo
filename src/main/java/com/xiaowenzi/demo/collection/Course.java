package com.xiaowenzi.demo.collection;

/**
 * 实现功能——模拟学生选课
 *
 * 选择课程（往集合中添加课程）
 * 删除所选的某门课程（删除集合中的元素）
 * 查看所选课程
 * 修改所选课程
 *
 */


/**
 * 课程类
 */
public class Course {
    public String id;
    public String name;

    public  Course(String id, String name){

        this.id = id;
        this.name = name ;
    }

    public Course(){

    }
}
