package com.javaplan.thread.threadmethod;

/**
 * thread.setDaemon()——设置后台线程
 * 如下代码中，运行 run()方法会进入死循环，但是设置了thread.setDaemon() 可以执行完，是因为run()中
 * 死循环的进程被设置成后台运行了
 */
public class SetDaemon implements Runnable {

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"线程运行");
        }
    }

    public static void main(String args[]){
        SetDaemon sd = new SetDaemon();
        Thread thread = new Thread(sd);
        thread.setDaemon(true);
        thread.start();
    }
}
