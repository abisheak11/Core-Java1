package com.javaproject.module3.linklistes.linklist3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product implements Comparable<Product> {
    private String productName;
    private int productId;

    @Override
    public int compareTo(Product o) {
        return this.getProductName().compareTo(o.getProductName());
    }
}
