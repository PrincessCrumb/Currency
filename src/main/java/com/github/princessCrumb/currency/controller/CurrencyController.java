package com.github.princessCrumb.currency.controller;

import com.github.princessCrumb.currency.dto.CurrencyDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyController {
    private final Map<String, CurrencyDto> currencies = new HashMap<>();

    public CurrencyController() {
        init(
            new CurrencyDto("₽", "Rubble", 1),
            new CurrencyDto("$", "dollar", 65),
            new CurrencyDto("€", "Euro", 70)
        );
    }

    private void init(CurrencyDto... currencies) {
        for (CurrencyDto ccy : currencies) {
            this.currencies.put(ccy.name.toLowerCase(), ccy);
        }
    }

    @GetMapping(value = "/currency")
    Collection<CurrencyDto> getAllCurrencies() {
        return currencies.values();
    }

    @GetMapping(value = "/currency/{name}")
    CurrencyDto getCurrency(@PathVariable("name") String name) {
        return currencies.get(name.toLowerCase());
    }
}

