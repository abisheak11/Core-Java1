package com.javaproject.module3.sett.set2;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
@Log4j2
public class LinkedHashSetOrderId {
    public void integerSet(Set<Integer>integerSet1){
        if (CollectionUtils.isNotEmpty(integerSet1)){
            for (Integer integerList:integerSet1){
               log.info(integerList);
            }
        }
    }
    public void iteratorSet1(Set<Integer>integerSet){
        if (CollectionUtils.isNotEmpty(integerSet)){
            Iterator<Integer>iterator=integerSet.iterator();
            while (iterator.hasNext()){
             Integer orderId = iterator.next();
             log.info(orderId);
            }
        }
    }
    public void lambda(Set<Integer>integerSet){
        if (CollectionUtils.isNotEmpty(integerSet)){
            integerSet.forEach(log::info);
        }
    }
    public void stream(Set<Integer>integerSet){
        if (CollectionUtils.isNotEmpty(integerSet)){
            integerSet.stream().forEach(log::info);
        }
    }
    public static void main(String[] args) {
     Set<Integer>orderId =new LinkedHashSet<>();
     orderId.add(111);
     orderId.add(112);
     orderId.add(113);
     orderId.add(114);
     orderId.add(114);
     orderId.add(115);
     orderId.add(null);
     LinkedHashSetOrderId order = new LinkedHashSetOrderId();
     order.integerSet(orderId);
     //order.iteratorSet1(orderId);
    // order.lambda(orderId);
     //order.stream(orderId);

    }
}
