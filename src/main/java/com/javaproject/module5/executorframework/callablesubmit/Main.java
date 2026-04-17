package com.javaproject.module5.executorframework.callablesubmit;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Log4j2
public class Main {
    //CALLABLE SUBMIT
    public static void main(String[] args) {
        Payment payment1 = new Payment("ABC", 100, 111);
        Payment payment2 = new Payment("JDB", 110, 112);
        Payment payment3 = new Payment("DFG", 100, 113);
        Payment payment4 = new Payment("GHT", 100, 114);
        Payment payment5 = new Payment("AJAY", 100, 115);
        Payment payment6 = new Payment("ABI", 100, 116);

        List<Payment> payments = Arrays.asList(payment1, payment2, payment3, payment4, payment5, payment6);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<Payment>>futurePayment = new ArrayList<>();
        for(Payment payment:payments) {
            Future<Payment> futures = executorService.submit(payment);
           futurePayment.add(futures);
        }
        futurePayment.forEach(futurePayment1->{
            try{
                futurePayment1.get();
            } catch (Exception e) {
               e.printStackTrace();
            }
        });
    }
}
