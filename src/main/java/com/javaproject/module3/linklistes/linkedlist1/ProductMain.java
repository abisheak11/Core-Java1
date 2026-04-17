package com.javaproject.module3.linklistes.linkedlist1;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductName("Rice");
        product1.setProductPrice(1249);

        Product product2 = new Product();
        product2.setProductName("veges");
        product2.setProductPrice(100);

        Product product3 = new Product();
        product3.setProductName("sunflower");
        product3.setProductPrice(123);

        List<Product>productList= new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Collections.sort(productList);

        productList.forEach(log::info);

        List<Product>products = new LinkedList<>();
        for(Product product :productList){
            if (product.getProductPrice()>1000)
           products.add(product);
        }
        products.forEach(log::info);


    }
}
