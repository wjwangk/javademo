package com.xiaowenzi.demo.Exception;

public class ExceptionTest {


    public int getResult() {
        int divider = 10;
        int result = 100;

            try {
                while (divider > -1) {

                        result = result + 100 / divider;
                        divider--;
                }
           //     return result;
            }catch (Exception e)

            {
                e.printStackTrace(); // 打印抛出的异常信息
                System.out.println("抛出异常啦！！");
            //    return result=999;

            }finally {
                System.out.println("这是finally！！！"+result);
            }

           return 1111;
        }




    public static void main(String[] args) {

        String str = "学习JAVA  编程";
        System.out.println(str.length());
//    ExceptionTest e = new ExceptionTest();
//    int n = e.getResult();
//    System.out.println("test()方法的最终结果为："+n);
      }
}




