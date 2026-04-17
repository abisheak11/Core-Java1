package com.javaproject.module3.map.map0;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountName("Ajay1");
        account1.setAccountType("Saving Account1");
        account1.setAccountNo(12345);
        account1.setBalances(10000.0);

        Account account2 = new Account();
        account2.setAccountName("Ajay2");
        account2.setAccountType("Saving Account2");
        account2.setAccountNo(12346);
        account2.setBalances(10001.0);

        Account account3 = new Account();
        account3.setAccountName("Ajay3");
        account3.setAccountType("Saving Account3");
        account3.setAccountNo(12346);
        account3.setBalances(10002.0);

        Account account4 = new Account();
        account4.setAccountName("Ajay4");
        account4.setAccountType("Saving Account4");
        account4.setAccountNo(12347);
        account4.setBalances(10003.0);

        Customer customer1 = new Customer();
        customer1.setCustomerId(1);

        Customer customer2 = new Customer();
        customer2.setCustomerId(2);

        Customer customer3 = new Customer();
        customer3.setCustomerId(3);

        Customer customer4 = new Customer();
        customer4.setCustomerId(4);

        Customer customer5 = new Customer();
        customer3.setCustomerId(4);

        Map<Customer, Account> accountMap = new HashMap<>();
        accountMap.put(customer1, account1);
        accountMap.put(customer2, account2);
        accountMap.put(customer3, account3);
        accountMap.put(customer4,account3);
        accountMap.put(customer5,account3);

        Main main = new Main();
        main.getLambda(accountMap);
        //main.getForEach(accountMap);
        //main.getIterator(accountMap);
    }

    public void getLambda(Map<Customer, Account> map) {
        map.forEach((customerKey, accValue) -> log.info("customerKey:{} and AccountValue:{}", customerKey, accValue));
    }

    public void getForEach(Map<Customer, Account> map) {
        Set<Map.Entry<Customer, Account>> entrySet = map.entrySet();
        for (Map.Entry<Customer, Account> customerAccountEntry : entrySet) {
            log.info("CustomerKey:{} and AccountValue:{} ", customerAccountEntry.getKey(), customerAccountEntry.getValue());
        }
    }

    public void getIterator(Map<Customer, Account> map) {
        Set<Map.Entry<Customer, Account>> entrySet = map.entrySet();
        Iterator<Map.Entry<Customer, Account>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Customer, Account> iteratorMap = iterator.next();
            log.info(iteratorMap);
        }
    }
}
