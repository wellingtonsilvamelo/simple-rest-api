package com.tomwel.simplerestapi;

import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;

public class Teste {
    
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        StringUtils.isNotBlank(localDate.toString());
    }
}
