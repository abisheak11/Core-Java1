package com.javaproject.module2.association.composition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    public String carName;

    public String carColor;

    public final Engine engine;

    public Car(String carName, String carColor,String engineType,int noOfCylinder){
        this.carName = carName;
        this.carColor = carColor;
        this.engine = new Engine(engineType,noOfCylinder);
    }
    public void getCarDetail(){
        log.info(carColor);
        log.info(carName);
        engine.getEngine();
    }
}
