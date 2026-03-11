package com.javaproject.module1.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    public String AccountType;

    public Account (String AccountType){
       this.AccountType= AccountType;
    }
    public void getDetail(){
        log.info(AccountType);
    }
    public static void main(String[] args) {
        Account account = new Account("Saving Account");
        account.getDetail();
    }
}
