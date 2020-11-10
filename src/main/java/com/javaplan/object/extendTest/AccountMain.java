package com.javaplan.object.extendTest;

/**
 * 出自csdn: https://blog.csdn.net/lovejojo222/article/details/103610926
 * （1）写一个名为Account的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：账号id，余额balance，年利率annualInterestRate；包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，取款方法withdraw()，存款方法deposit()。
 * （2）写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。使用withdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 *
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 */

public class AccountMain {

    public static void main(String[] args){
        Account account = new Account(1122,20000,4.5);
        account.withDraw(30000);
        account.withDraw(2500);
        account.deposit(3000);
        ExtendAccount ea = new ExtendAccount(1111,20000,4.5,5000);
        ea.withDraw(5000);
        ea.withDraw(18000);
        ea.withDraw(3000);

    }
}
