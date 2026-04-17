package com.javaproject.module2.oops.abstract1.association.composition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Engine {
    public String engineType;
    public int noOfCylinder;

    public Engine(String engineType,int noOfCylinder){
        this.engineType = engineType;
        this.noOfCylinder= noOfCylinder;
    }
    public void getEngine(){
        log.info(engineType);
        log.info(noOfCylinder);
    }
}
