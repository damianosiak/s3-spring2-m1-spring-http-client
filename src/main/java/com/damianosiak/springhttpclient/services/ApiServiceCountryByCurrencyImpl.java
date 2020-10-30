package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Country;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiServiceCountryByCurrencyImpl implements ApiServiceCountryByCurrency {
    private RestTemplate restTemplate;

    public ApiServiceCountryByCurrencyImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Country[] getCountries(String currency){
        Country[] countries = restTemplate.getForObject("https://restcountries.eu/rest/v2/currency/"+currency, Country[].class);
        return countries;
    }
}
