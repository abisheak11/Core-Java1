package com.javaproject.module4.enum1.enum2;

public enum School {
    YEAR(2026),Date(23),MONTH(3);

    public int date;

     School(int date){
        this.date = date;
    }
    public int getDate(){
         return date;
    }


}
