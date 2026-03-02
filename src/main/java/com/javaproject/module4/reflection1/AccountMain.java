package com.javaproject.module4.reflection1;


import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class AccountMain {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        
        Class accountClass= account.getClass();

        Field field = accountClass.getDeclaredField("accountName");
        field.setAccessible(true);
        field.set(account, "Abisheak");
        log.info(field.get(account));

        Method method = accountClass.getDeclaredMethod("getAccountNo");
        method.setAccessible(true);
        String response =(String) method.invoke(account);
        log.info(response);

        Method method1 = accountClass.getDeclaredMethod("getBalances", int.class);
        method1.setAccessible(true);
        int res= (int)method1.invoke(account,334);
        log.info(res);


    }
}
