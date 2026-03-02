package com.javaproject.module1.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Instance {
    public String bankName;
    public int accountNo;

    public Instance(String bankName, int accountNo){
        this.bankName = bankName;
        this.accountNo = accountNo;
    }
    public void getDetail(){
        log.info(bankName);
        log.info(accountNo);
    }

    public static void main(String[] args) {
        Instance instance = new Instance("SBI",564);
        instance.getDetail();
    }
}
