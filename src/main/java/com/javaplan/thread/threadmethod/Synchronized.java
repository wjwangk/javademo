package com.javaplan.thread.threadmethod;

public class Synchronized implements Runnable {

    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 2; i++)
//            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "剩余票数：" + ticket--);
                }
            }




    public static void main(String args[]){
        Synchronized syn = new Synchronized();
        Thread thread1 = new Thread(syn,"线程A");
        Thread thread2 = new Thread(syn,"线程B");
        Thread thread3 = new Thread(syn,"线程C");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
