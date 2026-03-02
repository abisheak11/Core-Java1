package com.javaproject.module4.enum1.enum2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SchoolMain {
    public static void main(String[] args) {
        log.info("MONTH:{}",School.MONTH.getDate());
        log.info("YEAR:{}",School.YEAR.getDate());
    }
}
