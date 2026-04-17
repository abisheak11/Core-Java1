package com.javaproject.module3.linklistes.linkedlist;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@Log4j2
public class PaymentMain {
    public void setPaymentIterator(List<Payment> payment) {
        Iterator<Payment> paymentIterator = payment.iterator();
        while (paymentIterator.hasNext()) {
            Payment payment1 = paymentIterator.next();
            log.info(payment1);
        }
    }
        public static void main (String[]args){
            Payment payment1 = new Payment();
            payment1.setDebtor("Ajit");
            payment1.setDebitAmount(10000);

            Payment payment2 = new Payment();
            payment2.setDebtor("Surya");
            payment2.setDebitAmount(20000);

            Payment payment3 = new Payment();
            payment3.setDebtor("Vijay");
            payment3.setDebitAmount(1000);

            List<Payment> payments = new LinkedList<>();
            payments.add(payment1);
            payments.add(payment2);
            payments.add(payment3);

        }

    public void setPaymentListIterator(List<Payment> payment) {
        if (CollectionUtils.isNotEmpty(payment)) {
            ListIterator<Payment> paymentListIterator1 = payment.listIterator();
            while (paymentListIterator1.hasPrevious()){
                paymentListIterator1.hasPrevious();
                log.info(paymentListIterator1);
            }
        }
    }
    public void setPayment(List<Payment>payments){
        if (CollectionUtils.isNotEmpty(payments)){
            payments.forEach(payment -> log.info(payment));
        }
    }
    public void setPayment1(List<Payment>payments){
        if (CollectionUtils.isNotEmpty(payments)){
            payments.stream().forEach(payment -> log.info(payment));
        }
    }

    }

