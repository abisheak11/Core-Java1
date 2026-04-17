package com.javaproject.module2.oops.abstract1.interface2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PaymentService implements SMSNotification,EmailNotification{

    public void getNotification() {
       EmailNotification.super.sendNotification();
    }
}
