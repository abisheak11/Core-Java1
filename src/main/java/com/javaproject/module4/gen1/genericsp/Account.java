package com.javaproject.module4.gen1.genericsp;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account <K,V>{
    public K accountName;
    public V accountNo;

    public Account(K accountName,V accountNo){
        this.accountName=accountName;
        this.accountNo=accountNo;
    }
    public void getDetails(){
        log.info(accountName);
        log.info(accountNo);
    }
}
