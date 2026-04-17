package com.javaproject.module1.looping;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Loop1 {
    public void getLoop(int n){
        for(int i =0;i<=n;i++){
          log.info("FOR LOOP"+i);
        }
    }
    public void getLoopDec(int n){
        for (int i=n; i>=0;i--){
            log.info("FOR LOOP DESCENDING"+i);
        }
    }
    public void innerLoop(int n){
       for (int i =0; i<=n;i++){
           for (int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
    public static void main(String[] args) {
        Loop1 loop = new Loop1();
        // loop.getLoop(10);
        //loop.getLoopDec(10);
        loop.innerLoop(5);
    }
}
