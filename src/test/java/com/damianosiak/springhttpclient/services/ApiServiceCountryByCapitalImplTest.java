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
public class ApiServiceCountryByCapitalImplTest {

    @Autowired
    ApiServiceCountryByCapital apiServiceCountryByCapital;

    @Test
    public void testGetCountries() throws Exception{

        Country[] countries = apiServiceCountryByCapital.getCountries("Havana");

        Assertions.assertEquals(1, countries.length);
    }
}
