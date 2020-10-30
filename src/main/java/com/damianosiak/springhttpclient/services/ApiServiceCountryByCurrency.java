package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Country;


public interface ApiServiceCountryByCurrency {

    Country[] getCountries(String currency);
}
