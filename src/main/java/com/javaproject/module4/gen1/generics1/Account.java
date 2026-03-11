package com.javaproject.module4.gen1.generics1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account <T,K>{
    public T accountName;
    public K accountId;



}
