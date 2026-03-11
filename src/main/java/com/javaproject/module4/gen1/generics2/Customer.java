package com.javaproject.module4.gen1.generics2;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
public class Customer <K,V>implements Account1<K,V>{

    public V accountName;
    public K accountId;

    public Customer(K key,V value){
        this.accountName = value;
        this.accountId = key;
    }

    //GENERICS METHOD
    public <T,I>void getDetail(T accountType,I IFSCCode){
        log.info(accountType);
        log.info(IFSCCode);
    }

    public K accountId() {
        return accountId;
    }
    public V accountName(){
        return accountName;
    }
}
