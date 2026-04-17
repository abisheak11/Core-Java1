package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WhileLoop {
    public void whileLoop(int n){
        int i =1;
        while (i<=n){
          log.info("while loop");
            i++;
        }
    }
    public void doWhile(int n){
        int i =1;
      do {
          log.info("Do while loop");
          i++;
      }while (i>=n);
    }
    public static void main(String[] args) {
        WhileLoop whileLoop= new WhileLoop();
        whileLoop.whileLoop(5);
        whileLoop.doWhile(5);
    }
}
