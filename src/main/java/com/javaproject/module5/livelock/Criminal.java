package com.javaproject.module5.livelock;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Criminal {
    public boolean hostageReleased = false;

    public void releaseHostage(Police police){
       while (!police.isMoneySent()){
         log.info("Criminal waiting police to give the money");
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
       }
       log.info("criminal released hostage");
       this.hostageReleased = true;
    }
    public boolean isHostageReleased(){
        return this.hostageReleased;
    }
}
