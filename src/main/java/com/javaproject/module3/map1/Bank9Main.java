package com.javaproject.module3.map1;

import lombok.extern.log4j.Log4j2;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Log4j2
public class Bank9Main {
    public static void main(String[] args) {
        Bank9 account1 = new Bank9();
        account1.setAccountName("ABISHEK");
        account1.setAccountNo(234);
        Bank9 account2 = new Bank9();
        account2.setAccountName("JIXEN");
        account2.setAccountNo(123);
        Bank9 account3 = new Bank9();
        account3.setAccountName("JEROLD");
        account3.setAccountNo(222);
        Saving ifsc1 = new Saving();
        ifsc1.setIfscCode("SBI234");
        Saving ifsc2 = new Saving();
        ifsc2.setIfscCode("SBI234");
        Saving ifsc3 = new Saving();
        ifsc3.setIfscCode("SBI234");

        Map<Saving, Bank9> accountMap = new HashMap<>();
        accountMap.put(ifsc1, account1);
        accountMap.put(ifsc2, account2);
        accountMap.put(ifsc3, account3);
        log.info(accountMap.get(ifsc1));

        accountMap.forEach((accountDetail, accounts) -> log.info
                ("accountDetail{}:and accountName{}:", accountDetail, accounts));
        Set<Map.Entry<Saving, Bank9>> entries = accountMap.entrySet();
        for (Map.Entry<Saving, Bank9> entry : entries) {
            log.info("key:{}and value:{}",entry.getKey(),entry.getValue());

        }
    }
}
