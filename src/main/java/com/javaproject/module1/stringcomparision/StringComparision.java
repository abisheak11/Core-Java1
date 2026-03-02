package com.javaproject.module1.stringcomparision;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringComparision {
    private static final Logger log = LogManager.getLogger(StringComparision.class);

    public static void main(String[] args) {
        StringComparision sc = new StringComparision();
        sc.DoubleEquals("Abi","Abi");
        sc.Equals("abi","cd");
        sc.CompareTo("Abi","Abi");
    }
    // DOUBLE EQUAL METHOD TO COMPARE THE STRING
    public void DoubleEquals(String name, String name1){
        if(name == name1){
            log.info("same");
        }
    }
    //EQUALS METHOD TO COMPARE THE STRING
    public void Equals(String name,String name1){
        if(name.equals(name1)){
            log.info("its same");
        }else{
            log.info("not same");
        }
    }
    //COMPARETO METHOD TO COMPARE THE STRING
    public void CompareTo(String name, String name1){
        if(name.compareTo(name1)==0){
            log.info("same");
        }else{
            log.info("not same");
        }
    }
}
