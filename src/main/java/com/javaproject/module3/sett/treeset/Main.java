package com.javaproject.module3.sett.treeset;

import lombok.extern.log4j.Log4j2;


import java.util.Set;
import java.util.TreeSet;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductName("B IPhone 14");
        product1.setProductId(112);

        Product product2 = new Product();
        product2.setProductName("A IPhone 15");
        product2.setProductId(115);

        Product product3 = new Product();
        product3.setProductName("C IPhone 11");
        product3.setProductId(110);

        Set<Product>productSet = new TreeSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product1);


        productSet.forEach(product -> log.info(product));
    }
}
