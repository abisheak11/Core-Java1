package com.javaproject.module4rp.arraylist1;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Log4j2
public class AccountMain {
    public void forEach(List<Account> accounts) {
        if (CollectionUtils.isNotEmpty(accounts)) {
            for (Account account : accounts) {
                log.info(account);
            }
        }
    }

    public void iterator(List<Account> accounts) {
        if (CollectionUtils.isNotEmpty(accounts)) {
            Iterator<Account> accountIterator = accounts.iterator();
            while (accountIterator.hasNext()) {
                Account account=accountIterator.next();
                log.info(account);
            }
        }
    }

    public void listIterator(List<Account> accounts) {
        if (CollectionUtils.isNotEmpty(accounts)) {
            ListIterator<Account> accountIterator = accounts.listIterator();
            while (accountIterator.hasNext()) {
                Account account = accountIterator.next();
                log.info(account);
            }
            while (accountIterator.hasPrevious()) {
                Account account = accountIterator.previous();
                log.info(account);
            }
        }
    }

    public void iteratorLambda(List<Account> accounts) {
        if (CollectionUtils.isNotEmpty(accounts)) {
            accounts.forEach(account -> log.info(account));
        }
    }

    public void iteratorLambdaWithStream(List<Account> accounts) {
        if (CollectionUtils.isNotEmpty(accounts)) {
            accounts.stream().forEach(account -> log.info(account));
        }
    }

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setAccountName("Abisheak");
        account1.setAccountId(111);

        Account account2 = new Account();
        account2.setAccountName("Abisheak");
        account2.setAccountId(111);

        Account account3 = new Account();
        account3.setAccountName("Abisheak");
        account3.setAccountId(111);

        List<Account> accountsList = new ArrayList<>();
        accountsList.add(account1);
        accountsList.add(account2);
        accountsList.add(account3);

        AccountMain accountMain = new AccountMain();
        accountMain.forEach(accountsList);
        accountMain.iteratorLambda(accountsList);
        accountMain.iterator(accountsList);
        accountMain.listIterator(accountsList);
        accountMain.iteratorLambdaWithStream(accountsList);

    }
}
