package com.javaproject.module3.exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThrowsException {
    public static void main(String[] args) {
        ThrowsException exception = new ThrowsException();

        try{
          exception.eligible(10);
        }catch (NotEligible eligible){
            log.info(eligible.getMessage());
        }

    }
    public void eligible(int age)throws NotEligible{
        if(age<18){
            log.info("Age less than 18");
            throw new NotEligible("Age is less than 18");
        }
        log.info("Not Working");
    }
}
