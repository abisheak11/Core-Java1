package com.javaproject.module5.multithreading1.semphore;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.concurrent.Semaphore;

@Log4j2
public class Parking {
    Semaphore semaphore = new Semaphore(10);

    public void parking(String carName){
        try {
            log.info(carName+"Entering to the parking");
            semaphore.acquire();
            log.info(carName+"parked");
            Thread.sleep(6000);
            log.info(carName+"leaving the parking");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
           semaphore.release();
        }
    }

    public static void main(String[] args) {
        Parking parking = new Parking();
         for (int i=1;i<=5;i++){
             String carName = "Car"+i;
             new Thread(()->parking.parking(carName)).start();
         }
    }
}
