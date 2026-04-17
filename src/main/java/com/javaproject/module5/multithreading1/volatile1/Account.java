package com.javaproject.module5.multithreading1.volatile1;

public class Account {
    public volatile static Account obj;

    public static Account getInstance(){
        if (obj==null){
            synchronized (Account.class){
               // if (obj==null){
                    obj = new Account();
                }
            }
       // }
        return obj;
    }
}
