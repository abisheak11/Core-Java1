package com.javaproject.module2.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class Bank {
    public String accountType;

    public Bank(String accountType){
        this.accountType = accountType;

    }
    public abstract double getCalculation(double balance);

    public void getAccountDetail(){
    }
}
