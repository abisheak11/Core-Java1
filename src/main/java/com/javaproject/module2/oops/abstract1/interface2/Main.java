package com.javaproject.module2.oops.abstract1.interface2;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.getNotification();
        paymentService.sendNotification();
        paymentService.sentNotification();
    }
}
