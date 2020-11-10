package com.javaplan.thread.threadmethod;

/**
 * 设置优先级：setPriority(int priorityLevel),参数在1-10之间，常用的三个静态常量值：
 * MAX_PRIORITY:10
 * NORM_PRIORITY:5
 * MIN_PRIORITY:1
 * 获取优先级：getPriority()
 */

public class SetPriority implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" i="+i);
        }
    }

    public static void main(String args[]){
        SetPriority sp = new SetPriority();
        Thread thread = new Thread(sp);
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" i="+i);
            if(i==2){
                thread.setPriority(Thread.MAX_PRIORITY);
                thread.start();
            }
        }
    }
}
