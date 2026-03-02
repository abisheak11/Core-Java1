package com.javaproject.module1.mutablestring;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class mutableString {

    //STRING BUILDER
    public void getBuilder(String input1){
        StringBuilder stringbuilder= new StringBuilder();
        log.info(stringbuilder.append(input1));
    }
    //STRING BUFFER
    public void getBuffer(String input2){
        StringBuffer stringbuffer= new StringBuffer();
       log.info( stringbuffer.append(input2));
    }

    public static void main(String[] args) {
        mutableString mutableString = new mutableString();
        mutableString.getBuffer("Hello");
        mutableString.getBuilder("Hello");
    }
}
