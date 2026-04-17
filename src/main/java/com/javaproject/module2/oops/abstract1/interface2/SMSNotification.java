package com.javaproject.module2.interface2;

public interface SMSNotification {
    default void sentNotification(){
        System.out.println("Payment Notification");
    }
}
