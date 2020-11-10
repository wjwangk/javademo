package com.javaplan.thread;


import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 第三种创建线程的方法： 实现 Callable<V></>
 * call()方法有返回值的方法
 * 使用场景：当线程需要返回值时，就使用 callable
 */

public class Mycallable implements Callable<Integer> {

    public Integer call() throws Exception{
        System.out.println("--------------");
        System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getId()+"\t"+ new Date()+"\tstarting");
        int sum = 0;
        for(int i = 0;i<=10000;i++){
            sum = sum +i;
        }
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getId()+"\t"+sum);
        System.out.printf("1. Welcome ! I am %s.%n",Thread.currentThread().getName());
        return sum;



    }



    public static void main(String args[]) throws Exception{
        Mycallable mycallable = new Mycallable();
        FutureTask<Integer> futureTask = new FutureTask<>(mycallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.printf("1. Welcome ! I am %s.%n",Thread.currentThread().getName());

        Integer sum = futureTask.get();
        System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getId()+"\t"+sum);


    }

}
