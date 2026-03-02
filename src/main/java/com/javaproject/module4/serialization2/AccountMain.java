package com.javaproject.module4.serialization2;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Log4j2
public class AccountMain {

    public static final String FileName="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\Account.ser";
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountName("Abisheak");
        account1.setAccountNo(2344);
        AccountMain account2 = new AccountMain();
        account2.getSer(FileName,account1);
        account2.deSer(FileName);

    }
    public void getSer(String FileName,Account account) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FileName));
            objectOutputStream.writeObject(account);
        }catch (Exception exception){
            log.error(exception);
        }
    }
    public void deSer(String FileName){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FileName));
            Account account = (Account) objectInputStream.readObject();
            log.info(account);
        }catch (Exception ev){
            log.error(ev);
        }

    }
}
