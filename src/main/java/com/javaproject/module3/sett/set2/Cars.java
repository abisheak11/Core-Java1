package com.javaproject.module3.sett.set2;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Log4j2
public class Cars {

    public void forEachLoop(Set<String> stringSet) {
        if (CollectionUtils.isNotEmpty(stringSet)) {
            for (String string : stringSet) {
                log.info(string);
            }
        }
    }

    public void iterator(Set<String> stringSet) {
        if (CollectionUtils.isNotEmpty(stringSet)) {
            Iterator<String> stringIterator = stringSet.iterator();
            while (stringIterator.hasNext()) {
                String string1 = stringIterator.next();
                log.info(string1);
            }
        }
    }

    public void lambda(Set<String> stringSet) {
        if (CollectionUtils.isNotEmpty(stringSet)) {
            stringSet.forEach(log::info);
        }
    }

    public void stream(Set<String> stringSet) {
        if (CollectionUtils.isNotEmpty(stringSet)) {
            stringSet.stream().forEach(log::info);
        }
    }

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("HONDA");
        stringSet.add("TOYOTA");
        stringSet.add("TATA");
        stringSet.add("KIA");
        stringSet.add("KIA");
        stringSet.add(null);

        Cars cars = new Cars();
        cars.forEachLoop(stringSet);
        //cars.iterator(stringSet);
       // cars.lambda(stringSet);
        //cars.stream(stringSet);
    }


}
