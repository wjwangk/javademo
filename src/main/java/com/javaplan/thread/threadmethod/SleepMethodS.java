package com.javaplan.thread.threadmethod;

/**
 * sleep的简单实例
 * sleep()的作用就是让执行程序延时**ms，当延时时间到后，进入runnable状态，等待cpu调度
 */

public class SleepMethodS implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{System.out.println(Thread.currentThread().getName()+" i="+i);
                Thread.sleep(1000);    //加入该方法，让执行时间变慢
            }catch (Exception e)
            {e.printStackTrace();}

        }
    }

    public static void main(String args[]){
        SleepMethodS sms = new SleepMethodS();
        Thread thread = new Thread(sms);
        thread.start();
    }


}
