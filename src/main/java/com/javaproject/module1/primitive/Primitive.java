package com.javaproject.module1.primitive;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Primitive {
    public byte byteData;
    public short shortData;
    public int intData;
    public long longData;
    public float floatData;
    public double doubleData;
    public boolean booleanData;
    public char charData;

    public Primitive(short shortdata, int intdata, long longdata, float floatdata, double doubledata, boolean booleandata, char chardata, byte bytedata){
       this.byteData=bytedata;
       this.shortData=shortdata;
       this.intData=intdata;
       this.longData=longdata;
       this.floatData=floatdata;
       this.doubleData=doubledata;
       this.booleanData=booleandata;
       this.charData=chardata;

    }
    public void getPrimitive(){
        log.info(byteData);
        log.info(shortData);
        log.info(intData);
        log.info(longData);
        log.info(floatData);
        log.info(doubleData);
        log.info(booleanData);
        log.info(charData);
    }

    public static void main(String[] args) {
        Primitive primitive = new Primitive((short)24,999, 922333L,537383f,393.00,true,'a',(byte)34);
        primitive.getPrimitive();
    }
}
