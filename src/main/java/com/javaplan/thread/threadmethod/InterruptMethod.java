package com.javaplan.thread.threadmethod;

/**
 * interrupt()方法中断当前运行的线程
 * 解释：
 *    interrupt()方法不会中断一个正在运行的线程。就是说如果线程正在运行中，调用此方法是没有任何反应的
 * 为什么呢？ 因为这个线程只是提供给 被阻塞的线程，即当线程调用了 Object.wait,Thread.join,Thread.sleep
 * 三种方法之一的时候，再调用 interrupt 方法，才会中断阻塞的线程，而继续执行线程。即把线程由阻塞（block）
 * 状态变成可执行（runnable）状态
 *
 */

public class InterruptMethod implements Runnable {

    public void run(){
        System.out.println("1、进入run() 方法");
        try {
            Thread.sleep(10000);
            System.out.println("2、完成休眠");
        }catch (Exception e){
 //           e.printStackTrace();
            System.out.println("3、休眠被终止");
        }
        System.out.println("4、run()方法正常结束");
    }

    public static void main(String args[]){
        InterruptMethod im =new  InterruptMethod();
        Thread thread = new Thread(im);
        thread.start();
        thread.interrupt();
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException e){
            System.out.println("休眠的线程终于被终止了");
        }

    }
}
