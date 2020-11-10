package com.xiaowenzi.demo.collection;


import java.util.*;

/**
 * 案例功能说明：
 * 通过Map<String,Student>进行学生信息管理，其中key为学生ID，valeu为学生对象
 * 通过键盘输入学生信息
 * 对集合中的学生信息进行增删改查操作
 */
public class MapTest {

    /**
     * 用来承载学生类型对象
     */
    public Map<String,Student> students;

    /**
     * 在构造器中初始化students属性
     */
    public MapTest(){
        this.students = new HashMap<String,Student>();
    }

    /**
     * 添加学生信息：输入学生ID，判断是否被占用
     * 若未被占用，则输入学生姓名，创建新的学生对象，并且添加到students中
     * 若被占用，则提示“该学生ID已被占用”
     */
    public void testPut(){
        // 创建一个Scanned对象，用来获取输入的学生ID和姓名
        Scanner input = new Scanner(System.in);

        int i=0;
        while (i<3){
            System.out.println("请输入学生ID");
            String sid = input.nextLine();
            //判断该ID是否被占用
            /**
             * 通过Map的get()方法，把key作为参数传递进去，获取key对应的value。若存在，返回key对应的value值，若不存在，则返回null
             */
            Student st = students.get(sid);
            if(st==null){
                System.out.println("请输入学生姓名");
                String sn = input.nextLine();
                //创建新的学生对象
                Student newStudent = new Student(sid,sn);
                //通过调用students的put方法，添加ID-学生映射
                students.put(sid,newStudent);
                System.out.println("成功添加学生："+students.get(sid).name);
                i++;

            }
            else{
                System.out.println("该学生ID已被占用!!!");
                continue;
            }

        }
    }

    /**
     * 测试Map的keySet方法
     * @param args
     */
    public void testKeySet() {
        //通过keySet方法返回Map中的所有“键”的Set集合
        Set<String> keySet = students.keySet();
        //取得students的容量
        System.out.println("共有学生：" + students.size() + "个");
        //遍历keySet,取得每一个键，再调用get方法取得每个键对应的value
        for (String stuId : keySet) {
            Student st = students.get(stuId);
            if (st != null)
                System.out.println("学生：" + st.name);
        }

    }

    /**
     * 测试删除Map中的映射
     * @param args
     */
    public void testRemove(){
        //从键盘获取待删除学生ID字符串
        System.out.println("请输入要删除的学生ID");
        Scanner input = new Scanner(System.in);
        while (true) {
            String sid = input.next();
            //判断该ID是否有对应的学生对象
            Student st = students.get(sid);
            //若该ID存在，则调用remove方法删除学生
            if (st != null) {
                students.remove(sid);
                System.out.println("成功删除学生：" + st.name);
                break;
            } else {
                System.out.println("输入的学生ID不存在,请重新输入");
                continue;
            }
        }
    }

    /**
     * 通过entrySet方法来遍历Map
     * @param args
     */
    public void testEntrySet(){
        //通过entrySet方法，返回Map中的所有键值对
        Set<Map.Entry<String,Student>>entrySet = students.entrySet();
        for(Map.Entry<String,Student> entry:entrySet){
            System.out.println("取得键为："+entry.getKey());
            System.out.println("取得值为："+entry.getValue().name);
        }
    }

    /**
     * 利用put方法修改Map中的已有映射
     * @param args
     */
    public void testModify() {
        System.out.println("请输入要修改的学生ID：");
        Scanner console = new Scanner(System.in);
        while (true) {
            String stuID = console.next();
            Student student = students.get(stuID);
            if (student == null) {
                System.out.println("输入的ID不存在，请重新输入");
                continue;
            } else {
                System.out.println("当前该ID对应的学生为：" + student.name);
                System.out.println("请输入新的学生姓名：");
                String newName = console.next();
                Student newStudent = new Student(stuID, newName);
                students.put(stuID, newStudent);
                System.out.println("修改成功");
                break;
            }

        }
    }


    public static void main(String[] args){
//        MapTest mp = new MapTest();
//        mp.testPut();
//        mp.testKeySet();
//        mp.testRemove();
//        mp.testEntrySet();
      //  mp.testModify();
      //  mp.testEntrySet();

        Map<Integer,String> map = new HashMap();
        map.put(1,"a");
        map.put(2,"b");

        map.get(1);
        map.put(1,"c");

        map.remove(2);

        map.containsKey(1);
        map.containsValue("b");
    }

}
