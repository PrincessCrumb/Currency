package com.example.currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyController {
    private final HashMap<String, CurrencyClass> currencyList = new HashMap<>();

public CurrencyController () {
    CurrencyClass rubble = new CurrencyClass("₽", "Rubble", 1);
    CurrencyClass dollar = new CurrencyClass("$", "dollar", 65);
    CurrencyClass euro = new CurrencyClass("€", "Euro", 70);
    currencyList.put(rubble.name, rubble);
    currencyList.put(dollar.name, dollar);
    currencyList.put(euro.name, euro);

}
    @GetMapping(value = "/currency")
CurrencyClass getValuta(@RequestParam("name") String name){

        return  currencyList.get(name);
    }

     //   @GetMapping(value = "/234")
     //   public String test (String name){

       //     return "Hello234"; //Это работает
      //  }
    }

