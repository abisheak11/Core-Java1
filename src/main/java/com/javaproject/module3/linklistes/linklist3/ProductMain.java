package com.javaproject.module3.linklistes.linklist3;

import lombok.extern.log4j.Log4j2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
@Log4j2
public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductName("BIPHONE 14");
        product1.setProductId(111);

        Product product2 = new Product();
        product2.setProductName("AIPHONE 15");
        product2.setProductId(112);

        Product product3 = new Product();
        product3.setProductName("CIPHONE 16");
        product3.setProductId(110);

        List<Product>products = new LinkedList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.remove(2);

        //Collections.sort(products);

        Collections.sort(products,Collections.reverseOrder( Comparator.comparing(product -> product.getProductName())));
        products.forEach(product -> log.info(product));
    }
}
