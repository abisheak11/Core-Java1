package com.javaproject.module4.enum1.enum2;

public enum School {
    YEAR(2026),MONTH(2);
    private int DATE;

    School(int date){
        this.DATE= date;
    }
    public int getDate(){
        return this.DATE;
    }


}
