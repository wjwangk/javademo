package com.javaplan.thread.threadmethod;

/**
 * run():调用线程的run() 方法，就是普通的方法调用，线程名称为 mian
 * start():启动一个线程，线程名称为 thread-0
 * 线程的几种状态：
 * 1.创建（new Thread）:new Thread 后线程就进入新建状态，它保持这个状态，直到程序start() 该线程
 * 2.就绪（runnable）:当线程调用 start()方法后，进入就绪状态，等待CPU调度
 * 3.运行（running）:若就绪状态的线程获得CPU资源，就会执行run(),处于运行状态。 运行状态的线程可以变为
 *                  阻塞状态、就绪状态、结束状态
 * 4.结束（dead）：一个运行状态的线程完成任务，或者其他终止条件 stop()发生时，该线程终止
 * 5.阻塞（blocked）：如果线程执行了sleep、suspend等方法，失去所占用cpu资源后，该线程就从运行状态进入阻塞状态。
 *                    当睡眠时间已到或者获得资源以后，重新进入就绪状态。
 */

public class ThreadStatus {

    public static void main(String args[]){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<5;i++){
                    System.out.println("threadA "+"线程名称："+Thread.currentThread().getName()+"  "+"线程ID："+Thread.currentThread().getId()+"  "+"i="+i);
        }
            }
        });
        thread1.start();
      //  thread1.run();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("threadB "+"线程名称："+Thread.currentThread().getName()+"  "+"线程ID："+Thread.currentThread().getId()+"  "+"i="+i);
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){}
                }
            }
        });
    //    thread2.start();
        thread2.run();



    }
}
