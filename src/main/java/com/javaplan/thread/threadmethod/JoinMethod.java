package com.javaplan.thread.threadmethod;

/**
 * join():
 * 使用时，强制运行某子线程，强制运行期间，其他线程无法运行，必须等此子线程运行完毕后主线程或其他线程才能运行
 * A.join()——强制运行线程A
 */

public class JoinMethod implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("线程"+Thread.currentThread().getName()+"  i="+i);
        }
    }

    public static void main(String args[])throws Exception{
        JoinMethod jm = new JoinMethod();
        Thread thread1 = new Thread(jm);
        thread1.start();
        Thread thread2 = new Thread(jm,"ss");
        thread2.start();

        for(int i =0;i<5;i++){
            if(i>2){
               try {
                       thread2.join();    //main线程需要等待thread线程执行完成后才能继续执行
               //    System.out.println(Thread.currentThread().getName()+" i="+i);
                    }catch (InterruptedException e){
                          e.printStackTrace();
               }

            }
            System.out.println(Thread.currentThread().getName()+" i的值："+i+"   zhu??");
        }
    }
}
