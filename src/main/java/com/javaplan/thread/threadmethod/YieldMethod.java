package com.javaplan.thread.threadmethod;

import static java.lang.Thread.yield;

/**
 * Thread.currentThread().yield()：将一个线程的操作暂时，让其他同等优先级的线程来执行
 * 但是我这个为什么没有实现呢？？？
 * 当线程主动调用yield()时，会将此线程从运行状态转化为就绪状态
 */

public class YieldMethod implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++){

            System.out.println(Thread.currentThread().getName()+"  i="+i);
                if(i==2){
            //        Thread.sleep(1000);
                    System.out.println("线程礼让");
                    Thread.yield();
                    System.out.println(Thread.currentThread().getName()+"  i="+i);
            }

            }
        }


    public static void main(String args[]){
        YieldMethod ym = new YieldMethod();
        Thread thread1 = new Thread(ym,"线程A");
        Thread thread2 = new Thread(ym,"线程B");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();

    }
}
