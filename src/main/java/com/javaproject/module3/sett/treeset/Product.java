package com.javaproject.module3.sett.treeset;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product implements Comparable<Product> {
    public String productName;
    public int productId;

    @Override
    public int compareTo(Product o) {
        return this.getProductName().compareTo(o.getProductName());
    }
}
