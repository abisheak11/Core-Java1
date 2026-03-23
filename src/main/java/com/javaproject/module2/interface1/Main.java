package com.javaproject.module2.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info(Car.BRAND);
        Petrol petrol = new Petrol("CIVIC");
        petrol.getCarName();
        petrol.getEngine();
        petrol.getSeat();
        Car.getCarNo();
        Diesel diesel = new Diesel("CITY");
        diesel.getCarName();
        diesel.getEngine();
        diesel.getSeat1();






    }
}
