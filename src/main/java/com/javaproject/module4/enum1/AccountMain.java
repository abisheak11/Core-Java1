package com.javaproject.module4.enum1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountMain {
    public static void main(String[] args) {

        log.info(Account.CURRENT.getAccountType());
        for (Account account :Account.values()){
            log.info(account);
        }
    }
}
