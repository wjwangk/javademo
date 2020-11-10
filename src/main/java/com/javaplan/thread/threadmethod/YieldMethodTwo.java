package com.javaplan.thread.threadmethod;

/**
 * 线程礼让实例，可还是没有实现礼让。。。。。
 */

public class YieldMethodTwo implements Runnable {
    String name;
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + ":"+i);
        }
    }

    public static void main(String args[]){
        YieldMethodTwo ym1 = new YieldMethodTwo();
        ym1.name="one";
        Thread thread1 = new Thread(ym1);
        YieldMethodTwo ym2 = new YieldMethodTwo();
        ym1.name="two";
        Thread thread2 = new Thread(ym2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
