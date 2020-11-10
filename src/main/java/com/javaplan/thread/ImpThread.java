package com.javaplan.thread;

/**
 * 第二种创建线程的方法： 实现 implements runnable 接口
 * 用处：推荐使用，当线程不需要返回值时，就用 runnable
 */
public class ImpThread implements Runnable {

    //实现接口，并重写run()方法
    public void run(){
        // 输出“当前线程”的线程名称
        System.out.printf("2.Welcome ! %s.%n",Thread.currentThread().getName());
    }

    public static void main(String args[]){
        // 创建线程
        ImpThread impThread = new ImpThread();  //实例化类
        Thread thread = new Thread(impThread); //实例化 Thread，并传入自己的实现类
        //启动线程
        thread.start();
        new Thread(impThread,"ss").start();   //可以自定义线程名字
        // 输出“当前线程”的线程名称
        System.out.printf("1. Welcome ! I am %s.%n",Thread.currentThread().getName());
    }
}
