package com.javaproject.module1.switch1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Switch1 {
    public static void main(String[] args) {
        Switch1 switch1 = new Switch1();
        String rep=switch1.getCurrency("india");
        log.info(rep);
        Switch1 switch2 = new Switch1();
        String rep1=switch2.getCurrency1("india");
        log.info(rep1);
        switch2.getSeason("summer");

    }
    public void getSeason(String season) {
        switch (season) {
            case "summer":
                log.info("Orange Juice");
                break;
            case "winter":
                log.info("Ginger Tea");
                break;
            case "autumn":
                log.info("Apple Juice");
                break;
            case "spring":
                log.info("Eat Veggies");
                break;
            default:
                log.info("Give Valid Season Name");
        }
    }

    public String getCurrency(String country) {
        return switch (country){
            case "india"->"rupees";
            case "USA"->"dollar";
            case"germany"->"euro";
            default -> "invalid currency";
        };

    }
    public String getCurrency1(String country) {
        return switch (country){
            case "india":log.info("indian currency name");yield "rupee" ;
            case "USA":log.info("USA currency name");yield "dollar";
            case"germany":log.info("germany currency name");yield "euro";
            default:yield "give valid currency name";
        };

    }
}

