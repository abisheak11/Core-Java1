package com.javaproject.module4.gen1.genericsp;

public class AccountMain {
    public static void main(String[] args) {
        Account<String,Double> account = new Account("Abisheak",123568);
        account.getDetails();
    }
}
