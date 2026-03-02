package com.javaproject.module1.constuctor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Parameter {
    public String bankName;

    public  Parameter(String BankName){
        this.bankName=BankName;
    }

    public static void main(String[] args) {
        Parameter para = new Parameter("SBI");
        log.info(para.bankName);

    }
}
