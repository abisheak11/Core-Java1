package com.javaproject.module5.executorframework.runnablesubmit;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ticket implements Runnable{
    private String passengerName;
    private int passengerId;

    public Ticket (String passengerName,int passengerId){
       this.passengerName = passengerName;
       this.passengerId =passengerId;
    }
    @Override
    public void run() {
      log.info(passengerName+"your booking is started");
      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      log.info(passengerName+"your ticket booked and your Id"+passengerId);
    }
}
