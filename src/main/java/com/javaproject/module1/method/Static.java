package com.javaproject.module1.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Static {
    public static  final String BANK_NAME="IOB";

    public static  void getDetail(){
        log.info(BANK_NAME);
    }

    public static void main(String[] args) {
        getDetail();
    }
}
