package com.github.princessCrumb.currency.dto;

public class CurrencyDto {
    public final String symbol;
    public final String name;
    public final long value;

    public CurrencyDto(String symbol, String name, long value) {
        this.symbol = symbol;
        this.name = name;
        this.value = value;
    }
}
