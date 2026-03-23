package com.javaproject.module1.mutablestring;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class mutableString {

    //STRING BUILDER
    public void getBuilder(String input1,String input2){
        StringBuilder stringbuilder= new StringBuilder();
        stringbuilder.append(input1);
        stringbuilder.append(input2);
        log.info(stringbuilder);
    }
    //STRING BUFFER
    public void getBuffer(String input2,String input){
        StringBuffer stringbuffer= new StringBuffer();
        stringbuffer.append(input2);
        stringbuffer.append(input);
        log.info(stringbuffer);
    }

    public static void main(String[] args) {
        mutableString mutableString = new mutableString();
        mutableString.getBuffer("Hello","Java");
        mutableString.getBuilder("Hello","Spring");
    }
}
