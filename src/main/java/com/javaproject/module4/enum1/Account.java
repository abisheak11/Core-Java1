package com.javaproject.module4.enum1;

public enum Account {
    SAVING("saving account"),CURRENT("current account");
    private String accountType;

     Account(String accountType){
        this.accountType=accountType;
    }
    public String getAccountType(){
        return this.accountType;
    }
}
