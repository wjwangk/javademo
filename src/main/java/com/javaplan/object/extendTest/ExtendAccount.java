package com.javaplan.object.extendTest;

public class ExtendAccount extends Account {

    private double overDraft;
    public ExtendAccount(int id, double balance, double annualInterestRate,double overDraft) {
        super(id, balance, annualInterestRate);
        this.overDraft = overDraft;
    }


    //取款
    public void withDraw(double drawMoney){
        double balance =   super.getBalance();
         if(drawMoney <= overDraft){
             balance = balance - drawMoney;
             super.setBalance(balance);
             System.out.println("您的账户余额为："+super.getBalance());
             System.out.println("您的可透支余额为："+overDraft);
         }
         else if (drawMoney>(overDraft+super.getBalance())){

             System.out.println("超过可透支余额");
         }else {
             overDraft -= (drawMoney - balance);
             overDraft = 0;
             super.setBalance(overDraft);
             System.out.println("您的账户余额为：" + super.getBalance() + "\n" + "您的可透支余额：" + overDraft);
         }


    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
}


