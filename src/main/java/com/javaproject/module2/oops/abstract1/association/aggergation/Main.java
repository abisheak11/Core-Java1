package com.javaproject.module2.oops.abstract1.association.aggergation;

public class Main {
    public static void main(String[] args) {
        Engine1 engine1 = new Engine1("DIESEL ENGINE",4);
        Car1 car = new Car1("CITY","WHITE",engine1);
        car.getCarDetail();
    }
}
