package com.javaproject.module5.executorframework.runnablesubmit;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    //RUNNABLE SUBMIT
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Abishek",10);
        Ticket ticket2 = new Ticket("Ajith",11);
        Ticket ticket3 = new Ticket("Vijay",12);
        Ticket ticket4 = new Ticket("Surya",13);
        Ticket ticket5 = new Ticket("Chiyan",14);

        List<Ticket>ticketList= Arrays.asList(ticket1,ticket2,ticket3,ticket4,ticket5);

        ExecutorService service = Executors.newFixedThreadPool(2);
        for (Ticket ticket : ticketList){
            service.submit(ticket);
        }
        service.shutdown();
    }
}
