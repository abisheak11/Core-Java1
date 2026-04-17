package com.javaproject.module2.interface2;


public interface EmailNotification {

    default void sendNotification(){
        System.out.println("Email Notification");
    }
}
