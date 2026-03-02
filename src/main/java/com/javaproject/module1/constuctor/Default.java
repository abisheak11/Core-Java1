package com.javaproject.module1.constuctor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Default {
    //INSTANCES VARIABLES
    public String accountName;
    public int accountNo;

    //DEFAULT CONSTRUCTOR
    public Default(){
        this.accountName="SAVING ACCOUNT";
        this.accountNo=345343647;
    }

    public static void main(String[] args) {
        Default default1 = new Default();
        log.info(default1.accountName);
        log.info(default1.accountNo);
    }
}
