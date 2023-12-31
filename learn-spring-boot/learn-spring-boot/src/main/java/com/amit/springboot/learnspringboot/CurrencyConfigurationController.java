package com.amit.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration retreiveAllCurrencyConfig(){
        return currencyServiceConfiguration;
    }
}
