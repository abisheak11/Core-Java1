package com.javaproject.module1.variable1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Company1 {
    public static final String COMPANY_NAME ="HONDA";
    public String carModel;
    public String carNo;

    public Company1(String carModel, String carNo){
        this.carModel= carModel;
        this.carNo= carNo;
    }

    public static void main(String[] args) {
        //Invoking Static Variable
        log.info("CompanyName:{}",Company1.COMPANY_NAME);
        //Object Creation
        Company1 company1 = new Company1("civic","TN 75 999");
        //Invoking Instance Variable
        log.info("CarModel:{} and CarNo:{}",company1.carModel,company1.carNo);
        //Local Variable
        int mileage=10;
        //Invoking Local Variable
        log.info("Car Mileage:{}",mileage);
    }
}
