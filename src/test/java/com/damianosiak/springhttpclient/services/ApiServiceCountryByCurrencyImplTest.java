package com.damianosiak.springhttpclient.services;

import com.damianosiak.springhttpclient.api.domain.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceCountryByCurrencyImplTest {

    @Autowired
    ApiServiceCountryByCurrency apiServiceCountryByCurrency;

    @Test
    public void testGetCountries() throws Exception{

        Country[] countries = apiServiceCountryByCurrency.getCountries("PLN");

        Assertions.assertEquals(1, countries.length);
    }
}
