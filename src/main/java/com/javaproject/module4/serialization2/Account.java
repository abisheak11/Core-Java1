package com.javaproject.module4.serialization2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Log4j2
@Getter
@Setter
@ToString
public class Account implements Serializable {
    public static final long serialVersionUID=24L;

    public String accountName;
    public int accountNo;
}
