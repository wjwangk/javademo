package com.xiaowenzi.demo.Exception;

public class ExceptionDome {
    /**
     * 以下test() 方法实现功能如下：
     * divider(除数)：
     * result(结果);
     * try-catch 捕获while循环
     * 每次循环，divider减一，result = result + 100/divider
     * 如果：捕获异常，打印输出“抛出异常啦！！！”返回-1
     * 否则：返回result
     */
    // 字符类型为double 时结果为：Infinity（无穷）;换成int 就好啦，为什么？？？   答：和double的精度有关
public int test(){
    int result =100;
    int divider =10;
    try {

        while (divider> -1) {
            result = result + 100 / divider;
            divider--;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("test()的循环抛出异常啦！！！");
        return -1;
    }

}

    /**
     * 以下test2() 方法实现功能如下：
     * divider(除数)：
     * result(结果);
     * try-catch 捕获while循环
     * 每次循环，divider减一，result = result + 100/divider
     * 如果：捕获异常，打印输出“抛出异常啦！！！”返回result =999;
     * 否则：返回result
     * finally:打印输出“这是finally!!! 哈哈！！！”同时打印输出result的值
     */
    /*
    finally语句块是在try块和catch块语句的return执行完之后，返回到调用者之前执行的
     */
    public int test2(){
        int result =100;
        int divider =10;
        try {

            while (divider> -1) {
                result = result + 100 / divider;
                divider--;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("test2()的循环抛出异常啦！！！");
            return result=999;
        }finally {
            System.out.println("这是finally!!! 哈哈！！！");
            System.out.println("result的值为："+result);
            return result;
        }

    }

    /**
     * 以下test3() 方法实现功能如下：
     * divider(除数)：
     * result(结果);
     * try-catch 捕获while循环
     * 每次循环，divider减一，result = result + 100/divider
     * 如果：捕获异常，打印输出“抛出异常啦！！！”;
     * finally:打印输出“这是finally!!! 哈哈！！！”同时打印输出result的值
     *最后，返回1111
     */

    public int test3(){
        int result =100;
        int divider =10;
        try {

            while (divider> -1) {
                result = result + 100 / divider;
                divider--;
            }

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("test3()的循环抛出异常啦！！！");

        }finally {
            System.out.println("这是finally!!! 哈哈！！！");
            System.out.println("result的值为："+result);

        }
        System.out.println("我是test3,我运行完啦");
        return 1111;
    }
    public static void main(String[] args){

        ExceptionDome ed = new ExceptionDome();
        int   a =ed.test();
        System.out.println("test()方法的最终结果为："+a);
        int b = ed.test2();
        System.out.println("test2()方法的最终结果为："+b);
        int c = ed.test3();
        System.out.println("test3()方法的最终结果为："+c);
        }
    }