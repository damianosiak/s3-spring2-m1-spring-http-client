package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Country;


public interface ApiServiceCountryByCapital {

    Country[] getCountries(String capital);
}
