package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Country;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiServiceCountryByCapitalImpl implements ApiServiceCountryByCapital {
    private RestTemplate restTemplate;

    public ApiServiceCountryByCapitalImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Country[] getCountries(String capital){
        Country[] countries = restTemplate.getForObject("https://restcountries.eu/rest/v2/capital/"+capital, Country[].class);
        return countries;
    }
}
