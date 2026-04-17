package com.javaproject.module2.oops.abstract1.interface2;


public interface EmailNotification {

    default void sendNotification(){
        System.out.println("Email Notification");
    }
}
