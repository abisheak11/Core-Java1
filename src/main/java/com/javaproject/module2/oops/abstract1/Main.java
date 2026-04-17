package com.javaproject.module2.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        MyBook book = new MyBook();
        book.setTitle("title");
        String rep=book.getTitle();
        log.info(rep);

    }
}
