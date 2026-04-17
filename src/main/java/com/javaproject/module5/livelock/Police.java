package com.javaproject.module5.livelock;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Police {
    public boolean moneySent = false;

    public void giveHostage(Criminal criminal){
        while (!criminal.isHostageReleased()){
           log.info("police waiting  for criminal to release the hostage");
           try {
               Thread.sleep(3000);
           }catch (Exception e){
               e.printStackTrace();
           }
        }
        log.info("police sent money");
        this.moneySent = true;
    }

    public boolean isMoneySent(){
        return this.moneySent;
    }
}
