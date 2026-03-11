package com.javaproject.module4.gen1.generics3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account21 <T>{

    private T accountName;

    public void setAccountName(T accountName){
        this.accountName =accountName;
    }
    public T getAccountName(){
        return accountName;
    }
    //UPPER BOUND STRING
    public <K extends String>void getDetail(K accountType){
        log.info(accountType);
    }
    //UPPER
    public <I extends Number>void  getBalances(I balances){
        log.info(balances);
    }

    public static void main(String[] args) {
        Account21 <String>account21 = new Account21<>();
        account21.setAccountName("Abisheak");
        log.info(account21.getAccountName());
        account21.getDetail("Saving Account");
        account21.getBalances(1000.00);
    }
}
