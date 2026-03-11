package com.javaproject.module1.wrapperclass;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WrapperClass {
    public Integer integer1;
    public Character character1;
    public Float float1;
    public Long long1;
    public Boolean boolean1;
    public Double double1;
    public Short short1;
    public Byte byte1;

    public WrapperClass(Integer integer1,Character character1,Float float1,Long long1,Boolean boolean1,Double double1,Short short1,Byte byte1){
        this.integer1 = integer1;
        this.character1 = character1;
        this.float1= float1;
        this.long1= long1;
        this.boolean1 = boolean1;
        this.double1 = double1;
        this.byte1 = byte1;
        this.short1 = short1;
    }
    public void getWrapperClass() {
        log.info(double1);
        log.info(integer1);
        log.info(character1);
        log.info(float1);
        log.info(long1);
        log.info(boolean1);
        log.info(double1);
        log.info(byte1);
        log.info(short1);
    }

    public static void main(String[] args) {
        WrapperClass wrapperClass = new WrapperClass(123,'A',2637F,36748L,true,63.09,(short) 123,(byte)122);
        wrapperClass.getWrapperClass();
    }
}
