package com.javaproject.module3.linklistes.linklist;


import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.List;
@Log4j2
public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountName("Abisheak");
        account1.setAccountType("SAVING ACCOUNT");
        account1.setAccountNo(987654321);
        account1.setBalances(1000);

        Account account2 = new Account();
        account2.setAccountName("Abisheak");
        account2.setAccountType("SAVING ACCOUNT");
        account2.setAccountNo(987654321);
        account2.setBalances(1000);

        Account account3 = new Account();
        account3.setAccountName("Abisheak");
        account3.setAccountType("SAVING ACCOUNT");
        account3.setAccountNo(987654321);
        account3.setBalances(1000);

        List<Account>accounts = new LinkedList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        AccountMain accountMain = new AccountMain();
        accountMain.getDetails(accounts,"Abisheak");
    }
    public void getDetails(List<Account>accounts,String name){
        if (CollectionUtils.isNotEmpty(accounts)){
            for (Account account : accounts){
                if (account.getAccountName().equals(name)){
                   log.info(account);
                }
            }
        }
    }
}
