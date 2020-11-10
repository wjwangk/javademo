package com.javaplan.thread.threadmethod;


import java.util.Date;

/**
 * 注意注意：
 * 以下这种写法也是实现多线程的写法。这样写可以在一个类里实现多个线程并行，就是每个线程都有一个run()方法，
 * 而之前的 implement 是只能在一个类里实现一个run线程
 * sleep()
 * 1.属于 Thread 类，表示让一个线程进入休眠状态，等待一定的时间后，自动醒来，进入[可运行]状态，注意是就绪（runnable），
 * 等待cpu调度，
 * 2. sleep 必须捕获异常
 * 3. sleep 方法没有释放锁
 * （区分 sleep 与 wait 的区别）
 */

public class SleepMethod {

    public static void main(String args[]) throws Exception{

        final Thread thread1 = new Thread(new Runnable(){
            public void run() {
                try {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t太困了，让我睡10秒，中间有事叫我，zZZ。。。");
                    Thread.sleep(10);
                    System.out.println("-----再执行一下-----");
                } catch (InterruptedException e) {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t被叫醒了，又要继续干活了");
                }
            }});
        thread1.start();

        Thread.sleep(100);   //加这个的作用是让线程不被以下方法的 interrupt()中断，如果中断，将执行上面的catch内容

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date()+"\t"+Thread.currentThread().getName()+"\t第二个进程");
                thread1.interrupt();
            }
        });
        thread2.start();

    }


}
