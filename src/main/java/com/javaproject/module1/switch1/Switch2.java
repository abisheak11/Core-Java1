package com.javaproject.module1.switch1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Switch2 {
    public void getOrder(String foodName){
        String res= null;
        switch (foodName){
            case "Coffee":log.info("give coffee");
            break;
            case "Tea" : log.info("give tea");
            break;
            case "Milk" : log.info("give milk");
            break;
            default:log.info("invalid foodName");
        }
    }

    public static void main(String[] args) {
        Switch2 switch2 = new Switch2();
        switch2.getOrder("Coffee");
    }
}
