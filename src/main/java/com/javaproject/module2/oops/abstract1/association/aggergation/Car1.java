package com.javaproject.module2.association.aggergation;

import com.javaproject.module2.association.composition.Engine;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car1 {
    public String carName;

    public String carColor;

    public Engine1 engine;

    public Car1(String carName, String carColor, Engine1 engine){
        this.carName = carName;
        this.carColor = carColor;
        this.engine = engine;
    }
    public void getCarDetail(){
        log.info(carColor);
        log.info(carName);
        engine.getEngine();
    }
}
