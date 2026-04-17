package com.javaproject.module2.oops.abstract1.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Petrol implements Car {
    public String carName;
    public Petrol(String carName){
        this.carName = carName;
    }
    public void getCarName(){
        log.info(carName);
    }
    @Override
    public void getEngine() {
        log.info("Petrol Engine");
    }



}
