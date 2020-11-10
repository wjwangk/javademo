package com.javaplan.object.extendTest;

public class Account {

    private int id;
    private double balance;    //余额
    private double annualInterestRate;   //年利息

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率的方法
    public void   getMonthlyInterest(){
        System.out.println("月利率为："+annualInterestRate/12+"%");
    }

    //取款方法
    public void withDraw(double drawMoney){
    //    getBalance();
        if (drawMoney <= balance){
            balance = getBalance() - drawMoney;
            System.out.println("您的账户余额为："+balance);
            getMonthlyInterest();
        }
        else{
            System.out.println("余额不足");
            System.out.println("您的账户余额为："+balance);
        }

    }

    //存款方法deposit()
    public  double deposit( double depositMoney){
    //   getBalance();
        balance = balance + depositMoney;
        System.out.println("您的账户余额为："+balance);
        getMonthlyInterest();
        return balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
