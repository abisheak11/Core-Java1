package com.javaproject.module4.gen1.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

    public <K,V>Boolean compare(Account<K,V>account1,Account<K,V>account2){
        return account1.getAccountId().equals(account2.getAccountId())&&
                account1.getAccountName1().equals(account2.getAccountName1());
    }

    public static void main(String[] args) {
        Account<String,Integer>account1= new Account<>("Abishek",2344);
        log.info(account1);
        Account<String,Integer>account2 =new Account<>("Ajay",4567);
        log.info(account2);
        Main m1 = new Main();
        Boolean res= m1.compare(account1,account2);
        log.info(res);
    }

}
