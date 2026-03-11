package com.javaproject.module4.gen1.generics1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccMain {
    public static void main(String[] args) {
       Account<String,Integer> accountDetail = new Account<>();
       accountDetail.setAccountName("Abishek");
       accountDetail.setAccountId(2345);
       log.info(accountDetail);
    }
}
