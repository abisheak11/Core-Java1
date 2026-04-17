package com.javaproject.module5.executorframework.callablesubmit;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Callable;
@Getter
@Log4j2
public class Payment implements Callable<Payment> {
    private String creditor;
    private double balances;
    private int paymentId;

    public Payment(String creditor,double balances,int paymentId){
        this.creditor = creditor;
        this.balances = balances;
        this.paymentId= paymentId;
    }

    @Override
    public Payment call() throws Exception {
        log.info("started"+creditor);

            Thread.sleep(5000);
        log.info("completed"+paymentId);

        return this;
    }


}
