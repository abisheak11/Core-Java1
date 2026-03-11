package com.javaproject.module4.gen1.generics2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Customer<Integer, String> customer1 = new Customer<>(1234, "Abisheak");
        Integer accountId =customer1.accountId();
        log.info(accountId);
        String accountName= customer1.accountName();
        log.info(accountName);
        Customer<String,Integer>customer2= new Customer<>("Ajay",2345);
        log.info(customer2);
        customer2.getDetail("Saving account",234565);

    }
}
