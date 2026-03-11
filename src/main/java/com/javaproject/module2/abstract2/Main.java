package com.javaproject.module2.abstract2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI("Saving Account");
       double interest = sbi.getCalculation(2000.00);
       log.info(interest);
       sbi.getAccountDetail();
    }
}
