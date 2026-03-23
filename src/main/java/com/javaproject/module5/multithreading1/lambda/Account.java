package com.javaproject.module5.multithreading1.lambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    private double balances=1000;

    public void withDraw(String user,int amount){
        if(balances>=amount){
           log.info(user + "is withdraw " + amount);
           balances-=amount;
           log.info(user + "completed withdrawal . remaining balances" +balances);
        }else {
            log.info("insufficient balances");
        }
    }
}
