package com.javaproject.module2.oops.abstract1.encapsulation2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setBalances(1000);
        bank1.setDeposit(2000);
        bank1.setWithdraw(900);

       log.info(bank1.getBalances());


    }
}
