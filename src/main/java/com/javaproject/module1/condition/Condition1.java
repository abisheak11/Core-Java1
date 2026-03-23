package com.javaproject.module1.condition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Condition1 {
    public double balances=10000;
    public void withdraw(double amount){
        if(amount<balances){
           log.info("your withdraw amount"+amount);
           balances-=amount;
           log.info("current balances"+balances);
        }else {
            log.info("insufficient balances");
        }
    }

    public static void main(String[] args) {
        Condition1 condition1 = new Condition1();
        condition1.withdraw(500);
    }
}
