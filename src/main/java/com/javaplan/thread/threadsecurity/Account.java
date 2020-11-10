package com.javaplan.thread.threadsecurity;

/**
 * 实现功能：
 * 实现银行取款机取钱的多线程操作
 */

public class Account {

    private double account;    //总金额
    private double balance;   //余额




    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}
