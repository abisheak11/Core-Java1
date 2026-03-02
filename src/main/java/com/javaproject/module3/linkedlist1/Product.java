package com.javaproject.module3.linkedlist1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

@Log4j2
@Getter
@Setter
@ToString
public class Product implements  Comparable<Product> {
    public String productName;
    public int productPrice;

    public int compareTo(Product product){
        return this.getProductPrice()-product.getProductPrice();
    }


}
