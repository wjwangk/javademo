package com.javaplan.thread;

/**
 * 第一种创建线程的方法： 继承 thread类，重写该类的 run() 方法
 * 看源码得知:
 * ①接口runnable有方法run()。  interface runnable{ public abstract run();}
 * ②类thread 实现接口runnable,即  class thread implements runnable{ public void run(){  }}
 * ③ 其他类再继承 thread 类，并重写run() 方法
 */
public class ExtendThread extends Thread {

    String name;
    // 类的构造方法
    public ExtendThread(String name){
        this.name = name;
        System.out.println(name);
    }

    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(name +"  "+ Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String args[]){
        System.out.printf("1.Welcome! I am %s.%n", Thread.currentThread().getName());
      //创建进程对象
        ExtendThread exthread1 = new ExtendThread("a");
        //启动进程
        exthread1.start();
        ExtendThread extendThread2 = new ExtendThread("b");
        extendThread2.start();

    }
}
