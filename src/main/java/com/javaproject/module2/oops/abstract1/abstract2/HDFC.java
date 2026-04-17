package com.javaproject.module2.oops.abstract1.abstract2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HDFC extends Bank{

    public HDFC(String accountType){
        super(accountType);
    }
    @Override
    public double getCalculation(double balance) {
        return balance*0.5;
    }
    public void getDetails(){
        log.info(accountType);
        log.info("AccountNumber:{}",2344556);
    }
}
