package com.javaproject.module2.oops.abstract1.encapsulation2;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
public class Bank {
    private int balances;

    public void  setDeposit(int depositAmount){
        if(depositAmount>20000){
            log.info("20000 is your limit");
        }else {
          log.info( "Total Balances:{}",balances+depositAmount);
        }
    }

    public void setWithdraw(int withdraw){
        if(withdraw<=balances){

            log.info("Withdraw Amount:{} Current Balances:{}",withdraw,balances-withdraw);
        }else {
            log.info("Insufficient Balances");
        }
    }

    public void setBalances(int balances) {
        this.balances = balances;
    }

    public int getBalances() {
       return balances;
    }
}
