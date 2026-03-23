package com.javaproject.module1.condition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Condition2 {
    public void getStatement(String password){
        if (password.length()<=6){
            log.info("give valid password");
        }else if (password.length()>=10){
            log.info("give valid password");
        }else {
            log.info("password created");
        }
    }

    public static void main(String[] args) {
        Condition2 condition2 = new Condition2();
        condition2.getStatement("abishek");
    }
}
