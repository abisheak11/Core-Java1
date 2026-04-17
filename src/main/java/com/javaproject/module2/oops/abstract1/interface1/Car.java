package com.javaproject.module2.oops.abstract1.interface1;

public interface Car {

     //STATIC VARIABLE
     String BRAND ="HONDA";

    //ABSTRACT METHOD
    void getEngine();

    //DEFAULT METHOD
   default void getSeat(){
      getMileage();

    }
    //DEFAULT METHOD
    default void getSeat1(){
        getMileage();

    }

    //STATIC METHOD
    static void getCarNo(){
        System.out.println("TN 75 5555");
    }

    //PRIVATE METHOD
    private void getMileage(){
        System.out.println(5);
    }

}
