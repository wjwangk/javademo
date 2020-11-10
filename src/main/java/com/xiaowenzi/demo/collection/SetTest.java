package com.xiaowenzi.demo.collection;

import java.security.PublicKey;
import java.util.*;

/**
 * 功能说明：
 * 1.提供备选课程
 * 2.创建学生对象，并给该学生添加三门课程（添加在学生的courses——Set类型的属性中）
 * --显示备选课程
 * --循环三次，每次输入课程ID
 * --往学生的courses属性中添加与输入的ID匹配的课程
 * --输出学成选择的课程
 */
public class SetTest {
    public List<Course> coursesToSelect;

    public SetTest() {

        this.coursesToSelect = new ArrayList<Course>();
    }

    public void testAdd() {
        /**
         * 创建一个课程对象，并通过调用add方法，添加到备选课程List中
         */
        //     System.out.println("添加课程——使用add()添加课程");
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);     //此时数组长度为0，所以这里默认插入到下标为0的位置
        Course temp = (Course) coursesToSelect.get(0);     //下标从0开始的
        //     System.out.println("添加了课程："+temp.id+":"+temp.name);

        //     System.out.println("添加课程——使用add（int index,Object element）添加课程");
        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);   //插入到下标为0的位置，之前0位置的值被依次挤到后面
        Course temp2 = (Course) coursesToSelect.get(0);
        //    System.out.println("添加了课程："+temp2.id+":"+temp2.name);

        //以上执行完毕后，数组的长度为2，下标分别为0和1，现在插入元素值=长度时，会顺序插入到数组末尾
        Course cr3 = new Course("3", "化学");
        // <=> coursesToSelect.add(cr3);如果不下index值时，默认插入末尾
        coursesToSelect.add(2, cr3);
        Course temp3 = (Course) coursesToSelect.get(2);
        //     System.out.println("添加了课程："+temp3.id+":"+temp3.name);

        //插入元素值>数组长度时，会报错：数组下标越界异常，同样，若下标小于0，也会报数组下标越界
        //   Course cr4 = new Course("4","物理");
        //   coursesToSelect.add(8,cr2);

        /**
         * 使用addALL(Collection c)方法
         */
        //     System.out.println("添加课程——使用addALL(Collection c)添加课程");
        Course[] course = {new Course("4", "离散数学"), new Course("5", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp4 = (Course) coursesToSelect.get(3);
        Course temp5 = (Course) coursesToSelect.get(4);
        //    System.out.println("添加了2门课程："+temp4.id+":"+temp4.name+temp5.id+":"+temp5.name);


        /**
         * 使用addALL(int index,Collection c)方法,插入到指定位置。注意下标从0开始的
         */
        //     System.out.println("添加课程——使用addALL(int index,Collection c)方法,插入到指定位置6和位置7");
        Course[] course2 = {new Course("6", "大学英语"), new Course("7", "java课程")};
        coursesToSelect.addAll(3, Arrays.asList(course2));
        Course temp6 = (Course) coursesToSelect.get(3);
        Course temp7 = (Course) coursesToSelect.get(4);
        //     System.out.println("添加了2门课程："+temp6.id+":"+temp6.name+temp7.id+":"+temp7.name);

        //     /**
        //     * 重复添加相同的元素——set元素不能重复
        //      */
        //      System.out.println("添加课程——重复添加相同的元素");
        //     coursesToSelect.addAll(Arrays.asList(course2));
        //     Course temp8 = (Course) coursesToSelect.get(7);
        //     Course temp9= (Course) coursesToSelect.get(8);
        //     System.out.println("添加了2门课程："+temp8.id+":"+temp8.name+temp9.id+":"+temp9.name);
    }


    public void testForEach() {
        System.out.println("使用迭代器通过 for each访问查询课程列表");
        for (Object obj : coursesToSelect) {
            Course cr = (Course) obj;
            System.out.println(cr.id + ":" + cr.name);

        }
    }

    public static void main(String[] args) {
//        SetTest st = new SetTest();
//        st.testAdd();
//        st.testForEach();
//        // 创建一个学生对象
//        Student student = new Student("1", "小明");
//        System.out.println("欢迎学生：" + student.name + "选课！！");
//        //创建scanner对象，用于接收从键盘输出的课程ID
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入课程ID");
//            String ss = input.next();
//            for (Course mm : st.coursesToSelect) {
//                if (ss.equals(mm.id)) {
//                    /**
//                     * Set中，添加某个对象，无论添加多少次，
//                     * 最终只保留一个该对象的引用
//                     * 并且保留的是第一次添加的那一个
//                     */
//                //    student.courses.add(mm);
//                    student.courses.add(mm);
//                }
//            }
//        }
//
//       st.testForEachForSet(student);
//

        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.remove(1);

    }
    //打印输出学生所选课程
    public void testForEachForSet(Student student){
        System.out.println("输出课程的长度："+student.courses.size());
        for (Course cr : student.courses) {
          System.out.println("选择了课程："+cr.id+":"+cr.name);
        }

    }
}