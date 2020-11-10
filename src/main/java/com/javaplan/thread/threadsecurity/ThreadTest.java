package com.javaplan.thread.threadsecurity;

/**
 * 实现银行取现业务，当不同的人同一时间进行多线程操作时，就可能出现如下所示实例
 */

public class ThreadTest implements Runnable {
    private double balance=1000;
    private double monney;
 //   public Account account;




    public ThreadTest(double monney){
        this.monney = monney;
  //      this.balance = account.getBalance();

    }

    @Override
    public void run() {

            if (balance > 0) {
                balance = balance - monney;
                System.out.println(Thread.currentThread().getName() + "取款成功，取出钱数为：" + monney);
                System.out.println("您的可用余额为：" + balance);
            }

        }



    public static void main(String args[]){
        ThreadTest tt = new ThreadTest(600);
        Thread thread1 = new Thread(tt,"线程A");
        Thread thread2 = new Thread(tt,"线程B");
        Thread thread3 = new Thread(tt,"线程C");
        thread2.start();
        thread1.start();
        thread3.start();
    }
}
