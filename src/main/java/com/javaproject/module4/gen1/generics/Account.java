package com.javaproject.module4.gen1.generics;

public class Account<K,V> {
    public K accountName1;
    public V accountId;

    public Account(K accountName1, V accountId){
        this.accountName1 = accountName1;
        this.accountId = accountId;
    }

    public K getAccountName1() {
        return accountName1;
    }

    public V getAccountId(){
        return accountId;
    }

}
