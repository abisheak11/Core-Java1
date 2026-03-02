package com.javaproject.module4.reflection1;


import lombok.extern.log4j.Log4j2;


@Log4j2

public class Account {

    private String accountName;

    private String getAccountNo(){
        return "AccountNo";
    }
    private int getBalances(int balances){
        return balances ;
    }
}
