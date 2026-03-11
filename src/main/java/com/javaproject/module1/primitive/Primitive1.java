package com.javaproject.module1.primitive;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Primitive1 {
    public byte byte1;
    public short short1;
    public int int1;
    public double double1;
    public long long1;
    public float float1;
    public boolean boolean1;
    public char char1;

    public Primitive1(byte byte1,short short1,int int1,double double1,long long1,float float1,boolean boolean1,char char1){
        this.byte1 = byte1;
        this.short1= short1;
        this.int1 = int1;
        this.double1 =double1;
        this.long1 = long1;
        this.float1 = float1;
        this.boolean1 = boolean1;
        this.char1 = char1;
    }
    public void getPrimitive(){
        log.info(byte1);
        log.info(short1);
        log.info(int1);
        log.info(double1);
        log.info(long1);
        log.info(float1);
        log.info(boolean1);
        log.info(char1);
    }

    public static void main(String[] args) {
        Primitive1 primitive1 = new Primitive1((byte) 12,(short) 23,234,20.0,234L,2344F,true,'A');
        primitive1.getPrimitive();

    }

}
