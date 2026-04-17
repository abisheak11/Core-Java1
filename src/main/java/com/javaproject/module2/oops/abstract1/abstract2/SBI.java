package com.javaproject.module2.abstract2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SBI extends Bank{
    public SBI(String accountType){
        super(accountType);
    }
    @Override
    public double getCalculation(double balance) {
        return 0.5*balance;
    }

    public void getAccountDetail() {
     log.info("Account No:{}",23455);
     log.info("Account Type:{}",accountType);
    }
}
