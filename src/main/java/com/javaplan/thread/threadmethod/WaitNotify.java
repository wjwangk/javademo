package com.javaplan.thread.threadmethod;

public class WaitNotify  implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    private WaitNotify(String names,Object prev,Object self){
        this.name = names;
        this.prev = prev;
        this.self = self;
    }

    public void run(){
        int count =0;
        while (count<10){
            synchronized (prev){
                synchronized (self){
                    System.out.print(name);
                    count++;
                    self.notify();
                }
                try {
                    prev.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }

        }
    }

    public static void main(String args[]) throws Exception{
        Object a = new Object();
        Object b = new Object();
   //     Object c = new Object();
        WaitNotify wn1 = new WaitNotify("A",b,a);
        new Thread(wn1).start();
 //       Thread.sleep(5000);
        WaitNotify wn2 = new WaitNotify("B",a,b);
        new Thread(wn2).start();

    }
}
