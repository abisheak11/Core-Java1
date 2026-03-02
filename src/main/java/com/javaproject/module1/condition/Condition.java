package com.javaproject.module1.condition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Condition {
    public static void main(String[] args) {
        Condition condition = new Condition();//OBJECT CREATION

        condition.IfCondition(18);
        condition.IfElseCondition(20);
        condition.IfElseIfElseCondition(50);
    }

    public void IfCondition(int age){//IF CONDITION
        if(age >= 18){
            log.info("agree");
        }
    }

    public void IfElseCondition(int age){ //IF ELSE CONDITION
        if(age >= 21){
            log.info("agree");
        }else {
            log.info("don't agree");
        }
    }

    public void IfElseIfElseCondition(int age){//IF ELSE IF ELSE CONDITION
        if(age < 18){
            log.info("don't agree");
        }else if(age > 50 ){
            log.info("don't agree");
        }else{
            log.info("agree");
        }
    }
}
