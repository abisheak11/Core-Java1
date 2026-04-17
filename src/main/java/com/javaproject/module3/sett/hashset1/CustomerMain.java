package com.javaproject.module3.sett.hashset1;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Log4j2
public class CustomerMain {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setAccountType("Saving Account");
        account1.setAccountNo(23445);

        Account account2 = new Account();
        account2.setAccountType("Saving Account");
        account2.setAccountNo(23445);

        List<Account> account=new ArrayList<>();
        account.add(account1);
        account.add(account2);

        Customer customer1 = new Customer();
        customer1.setCustomerName("Ajay1");
        customer1.setCustomerId(111);
        customer1.setAccounts(account);

        Customer customer2 = new Customer();
        customer2.setCustomerName("Ajay2");
        customer2.setCustomerId(111);
        customer2.setAccounts(account);

        Customer customer3 = new Customer();
        customer3.setCustomerName("Ajay3");
        customer3.setCustomerId(113);
        customer3.setAccounts(account);

        Set<Customer>customers=new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        customers.forEach(customer -> log.info(customer));

    }
}
